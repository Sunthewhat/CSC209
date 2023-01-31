package restaurant;

import java.util.*;

public class Food {
    int ID;
    String name;
    String category;
    double price;
    int calory;
    short star;
    Vector ingredients;

    public Food(int ID, String name, double price, int calory, short star) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.calory = calory;
        this.star = star;
        ingredients = new Vector(10);
    }

    public void setCategory(String category) {
        String validCategory[] = { "noodle", "appertize", "beef", "pork", "vegetarian", "chicken", "seafood", "dessert",
                "drink" };
        for (String string : validCategory) {
            if (category.equalsIgnoreCase(string)) {
                this.category = category;
                return;
            }
        }
        System.out.println("Not valid category");
    }

    public int addIngredient(String newIngredient) {
        ingredients.add(newIngredient);
        return ingredients.size();
    }

    public String toString() {
        return name + " " + price + " bath with " + star + "*.";
    }
}
