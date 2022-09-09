package com.quintrix.conversion.model;

public class Student {
    private int studentId;
    private String firstname;
    private String lastname;
    private String major;

    public Student() {

    }
    public Student(String firstname, String lastname, String major) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
