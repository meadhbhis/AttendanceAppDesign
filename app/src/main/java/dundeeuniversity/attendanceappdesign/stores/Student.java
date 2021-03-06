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
    private String matricNo;
    private int isInternationalStudent;
    private ArrayList<Module> modules;

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

    public String getMatricNo() {
        return matricNo;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    public int getIsInternationalStudent() {
        return isInternationalStudent;
    }

    public void setIsInternationalStudent(int isInternationalStudent) {
        this.isInternationalStudent = isInternationalStudent;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public Student(){

    }
}
