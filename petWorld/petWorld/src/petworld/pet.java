/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petworld;

/**
 *
 * @author sunthewhat
 */
import java.util.*;

public class Pet {
    String name;
    Date DateOfBirth;
    String[] color;
    int ID;
    private String type;
    private String gender;
    private Vaccine[] vaccines;
    private int vaccineCount;

    public Pet(String name, int ID, String gender) {
        this.name = name;
        this.ID = ID;
        this.setGender(gender);
        vaccines = new Vaccine[100];
        vaccineCount = 0;
   }
    
    public int vaccinate(Vaccine v) {
        vaccines[vaccineCount++] = v;
        return vaccineCount;
    }
    
    public void showAllPreventDiseases() {
        if (vaccineCount>0) {
            System.out.print("The pet is safe from: ");
            for (int i = 0; i < vaccineCount; i++) {
                System.out.print(vaccines[i].getPreventedDisease()+" ");
            }
            System.out.println("");
        }
        else System.out.println("This pet is at all risk of all diseases.");
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
            this.gender = gender;
        } else {
            System.out.println("Animal genders are only male or female.");
            this.gender = "Unknown";
        }
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public String[] getColor() {
        return color;
    }

    public int getID() {
        return ID;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public int getVaccineCount() {
        return vaccineCount;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean setType(String type) {
        String[] typeList = {"dog","cat","fish","rabbit","bird","chicken","python","raptor","worm","cricket"};
        for (int i = 0; i < typeList.length; i++) {
            if (type.equalsIgnoreCase(typeList[i])) {
                this.type = type;
                return true;
            }
        }
        this.type = "Unknown";
        return false;
    }
    
    
    
}