/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentModel;

import java.util.Date;

/**
 *
 * @author SHYAKA
 */
public class StudentModel {
    private String regNo;
    private String firstname;
    private String lastname;
    private Date dob;
    private String sem;
    private String course;

    public StudentModel() {
    }

    public StudentModel(String regNo, String firstname, String lastname, Date dob, String sem, String course) {
        this.regNo = regNo;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.sem = sem;
        this.course = course;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
}
