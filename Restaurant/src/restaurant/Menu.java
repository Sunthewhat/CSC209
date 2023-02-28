package restaurant;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {
    Food[] foods;
    int amountOfFood;
    String filename;

    public Menu() {
        foods = new Food[30];
        amountOfFood = 0;
        filename = "menu.dat";
    }

    public int addNewFood(Food newFood) {
        foods[amountOfFood] = newFood;
        writeOneFoodToFile(newFood);
        return amountOfFood++;
    }

    public boolean removeFood(int foodID) {
        for (int i = 0; i < amountOfFood; i++) {
            if (foods[i].ID == foodID) {
                for (int j = i; j < amountOfFood - 1; j++) {
                    foods[j] = foods[j + 1];
                }
                amountOfFood--;
                return true;
            }
        }
        return false;
    }

    public void showAllFood() {
        for (int i = 0; i < amountOfFood; i++) {
            System.out.print(foods[i].ID + ") " + foods[i].name + " ");
        }
        System.out.println();
    }

    /*
     * int ID; 4 bytes
     * String name; 20 bytes
     * String category; 20 bytes
     * double price; 8 bytes
     * int calory; 4 bytes
     * short star; 2 bytes
     * Vector<String> ingredients; 20*10 = 200 bytes
     * 1 record = 4 + 20 +20 +8 +4 +2 +200 = 258 bytes
     */

    public boolean searchByName(String nameFood) {
        try {
            RandomAccessFile fptr = new RandomAccessFile(filename, "r");
            // fptr point to 0
            byte[] temp = new byte[20];
            // fptr.seek((long) 4);
            // fptr.read(temp, 0, 20);
            // System.out.println(new String(temp) + " ");
            // fptr.seek(fptr.getFilePointer() + 238);

            // fptr.read(temp, 0, 20);
            // System.out.println(new String(temp) + " ");

            // // fptr.seek(258 + 4);
            // // fptr.read(temp, 0, 20);
            // // System.out.println(new String(temp) + " ");

            // fptr.seek(258 * 2 + 4);
            // fptr.read(temp, 0, 20);
            // System.out.println(new String(temp) + " ");
            int record = 0;
            while (fptr.getFilePointer() < fptr.length()) {
                fptr.seek(258 * record + 4);
                fptr.read(temp, 0, 20);
                String foodNameFromFile = (new String(temp)).trim();
                if (foodNameFromFile.equalsIgnoreCase(nameFood)) {
                    fptr.seek(fptr.getFilePointer() + 20);
                    double price = fptr.readDouble();
                    System.out.println("Price of  " + nameFood + " is " + price);
                    return true;
                }
                record++;
            }

            fptr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void showNamePrice(short fromStar) {
        try {
            RandomAccessFile fptr = new RandomAccessFile(filename, "r");
            byte[] temp = new byte[20];
            for (int record = 0; fptr.getFilePointer() < fptr.length() - 258; record++) {
                fptr.seek(record * 258 + 56);
                short starFromFile = fptr.readShort();
                if (starFromFile >= fromStar) {
                    fptr.seek(record * 258 + 4);
                    fptr.read(temp, 0, 20);
                    fptr.seek(record * 258 + 44);
                    double price = fptr.readDouble();
                    System.out.println((new String(temp)).trim() + ":" + price);
                }
            }
            fptr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readAllRecord() {
        try {
            RandomAccessFile fptr = new RandomAccessFile(filename, "r");
            while (fptr.getFilePointer() < fptr.length()) {
                byte[] temp = new byte[20];
                int id = fptr.readInt();
                System.out.print(id + " ");

                fptr.read(temp, 0, 20); // Name
                System.out.print(new String(temp) + " ");

                fptr.read(temp, 0, 20);// Category
                System.out.println(new String(temp) + " ");

                double p = fptr.readDouble(); // Price
                int cal = fptr.readInt();// cal
                short star = fptr.readShort();
                System.out.println(p + " " + cal + " " + star + " ");

                String ingredient = "";
                for (int i = 0; i < 10; i++) {
                    fptr.read(temp, 0, 20);
                    ingredient += (new String(temp)).trim() + ", ";
                }
                System.out.println(ingredient);

            }
            fptr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean writeOneFoodToFile(Food food) {

        try {
            RandomAccessFile fptr = new RandomAccessFile(filename, "rw");
            fptr.seek(fptr.length());
            // String userName = "Chotiwet 65130500208";
            byte[] temp = new byte[30];
            // temp = userName.concat(" ").getBytes();
            // fpointer.write(temp, 0, 30);

            fptr.writeInt(food.ID);
            // byte[] temp = new byte[20];
            temp = food.name.concat("                                ").getBytes();
            fptr.write(temp, 0, 20);
            if (food.category != null) {

                temp = food.category.concat("                                   ").getBytes();
            } else {
                temp = "".concat("                                               ").getBytes();
            }
            fptr.write(temp, 0, 20);
            fptr.writeDouble(food.price);
            fptr.writeInt(food.calory);
            fptr.writeShort(food.star);
            int i = 0, j;
            for (j = 0; j < food.ingredients.size(); j++) {
                String t = ((String) food.ingredients.elementAt(j));
                temp = t.concat("                                      ").getBytes();
                fptr.write(temp, 0, 20);
            }
            for (i += j; i < 10; i++) {
                temp = "                                                           ".getBytes();
                fptr.write(temp, 0, 20);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
