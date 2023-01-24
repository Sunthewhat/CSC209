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
    String type;
    String gender;

    public Pet(String name, int ID, String gender) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")) {
            this.gender = gender;
        }
        else System.out.println("Animal genders are only male or female.");
    }
}