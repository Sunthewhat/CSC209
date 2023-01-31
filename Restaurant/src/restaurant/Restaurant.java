/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;

/**
 *
 * @author sunthewhat
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Food padthai = new Food(1, "padthai", 49, 200, (short) 4);
        System.out.println(padthai.toString());
        padthai.setCategory("noodle");
        padthai.addIngredient("shrimp");
        padthai.addIngredient("noodle");
        padthai.addIngredient("bean sprout");
        padthai.addIngredient("egg");
        System.out.println(padthai.ingredients.elementAt(0) + " " + padthai.ingredients.elementAt(2));
        Food tomyum = new Food(2, "Tomyum", 249.50, 500, (short) 5);
        tomyum.setCategory("seafood");
        tomyum.addIngredient("shrimp");
        tomyum.addIngredient("lemon");
        tomyum.addIngredient("chilli pepper");
        
    }

}
