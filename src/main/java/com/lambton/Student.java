package com.lambton;

import java.time.LocalDate;
import java.util.Date;
enum Gender
{
    MALE,
    FEMALE,
    OTHER,
}
public class Student
{
    private int studentId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Gender gender;
    private float totalMarks;
    private int marks[];
    private float totalMarks;
    private float percentage;
    private String result;


    public Student(int studentId, String firstName, String lastName, Date birthDate, Gender gender) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    private int calculateStudentAge(){
        int age;

        LocalDate today = LocalDate.now();
        age= today.getYear()- birthDate.getYear();

        return age;
    }

    public void setData(int studentId, String firstName, String lastName, Date birthDate, Gender gender, float totalMarks)
    {
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.gender=gender;
        this.totalMarks=totalMarks;
    }
    public void printData()
    {
        System.out.println("studentId" + studentId);
        System.out.println("firstName" + firstName);
        System.out.println("lastName" + lastName);
        System.out.println("birthDate" + birthDate);
        System.out.println("gender" + gender);
        System.out.println("totalMarks" + totalMarks);
    }

}
