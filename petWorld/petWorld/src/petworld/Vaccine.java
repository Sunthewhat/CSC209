/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petworld;

/**
 *
 * @author sunthewhat
 */
public class Vaccine {
    private String name;
    private String preventedDisease;
    private String company;
    private double dose;

    public Vaccine(String name, String preventedDisease) {
        this.name = name;
        this.preventedDisease = preventedDisease;
    }

    public Vaccine(String name, String preventedDisease, String company, double dose) {
        this.name = name;
        this.preventedDisease = preventedDisease;
        this.company = company;
        this.setDose(dose);
    }

    public Vaccine(String name, String preventedDisease, String company) {
        this.name = name;
        this.preventedDisease = preventedDisease;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getPreventedDisease() {
        return preventedDisease;
    }

    public String getCompany() {
        return company;
    }

    public double getDose() {
        return dose;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreventedDisease(String preventedDisease) {
        this.preventedDisease = preventedDisease;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDose(double dose) {
        if (dose <= 20) {
            this.dose = dose;
        } else {
            this.dose = 0;
            System.out.println("Dose is not valid.");
        }
    }

}
