package dundeeuniversity.attendanceappdesign.stores;

/**
 * Created by john.bothwell1705 on 09/03/2016.
 */
public class Department {
    private int deptID;
    private String departmentName;

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(){

    }

    public Department(int deptID, String departmentName){
        this.deptID = deptID;
        this.departmentName = departmentName;
    }
}
