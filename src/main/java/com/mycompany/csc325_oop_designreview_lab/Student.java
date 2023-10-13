package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Nick Gutierrez
 */
public class Student extends Human{
    protected int gpa; //gpa is protected so Freshman and Senior can access it

    // Constructor takes 3 params, 2 for the super, 1 for student class
    public Student(String sName, short sAge, int gpa) {
        super(sName, sAge);
        this.gpa = gpa;
    }

    public void setGPA(int gpa) {
        this.gpa = gpa;
    }

    public int getGPA() {
        return this.gpa;
    }
    //Override the abstract method in Human
    @Override
    public String getAddress() {
        return this.address;
    }
    //Override the abstract method in Human
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    //toString override, returns the member variables line by line, labeled.
    @Override
    public String toString() {
        return "Name: " + this.getName()
                + "\nAddress: " + this.getAddress()
                + "\nAge: " + this.getAge()
                + "\nGPA: " + this.gpa;
    }
}
