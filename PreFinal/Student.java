/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_40
 */
public class Student {
    private String std_id, firstname, lastname;
    private double gpa;
    public Student(String std_id, String firstname, String lastname, double gpa){
        this.std_id = std_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
    }

    /**
     * @return the std_id
     */
    public String getStd_id() {
        return std_id;
    }

    /**
     * @param std_id the std_id to set
     */
    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
