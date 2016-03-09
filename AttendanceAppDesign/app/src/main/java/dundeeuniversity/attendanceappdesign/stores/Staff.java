package dundeeuniversity.attendanceappdesign.stores;

/**
 * Created by john.bothwell1705 on 09/03/2016.
 */
public class Staff {
    private int staffID;
    private String firstname;
    private String lastname;
    private String email;
    private int departmentID;

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
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

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public Staff(){

    }

    public Staff(int staffID, String firstname, String lastname, String email, int departmentID){
        this.staffID = staffID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.departmentID = departmentID;
    }
}
