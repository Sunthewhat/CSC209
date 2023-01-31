package restaurant;

import java.util.*;

public class Menu {
    Food[] foods;
    int amountOfFood;

    public Menu() {
        foods = new Food[30];
        amountOfFood = 0;
    }

    public int addNewFood(Food newFood) {
        foods[amountOfFood] = newFood;
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
            System.out.print(foods[i].ID + " " + foods[i].name + " ");
        }
        System.out.println();
    }
}
