package dundeeuniversity.attendanceappdesign.stores;

import java.util.ArrayList;

/**
 * Created by john.bothwell1705 on 09/03/2016.
 */
public class Student {
    private int studentID;
    private String firstname;
    private String lastname;
    private String email;
    private String course;
    private int matricNo;
    private int isInternationalStudent;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMatricNo() {
        return matricNo;
    }

    public void setMatricNo(int matricNo) {
        this.matricNo = matricNo;
    }

    public int getIsInternationalStudent() {
        return isInternationalStudent;
    }

    public void setIsInternationalStudent(int isInternationalStudent) {
        this.isInternationalStudent = isInternationalStudent;
    }
    
    public Student(){

    }

    public Student(int studentID, String firstname, String lastname, String email, String course, int matricNo, int isInternationalStudent){
        this.studentID = studentID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.course = course;
        this.matricNo = matricNo;
        this.isInternationalStudent = isInternationalStudent;
    }
}
