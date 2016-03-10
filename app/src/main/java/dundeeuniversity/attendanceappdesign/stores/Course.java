package dundeeuniversity.attendanceappdesign.stores;

/**
 * Created by john.bothwell1705 on 09/03/2016.
 */
public class Course {
    private int courseID;
    private int deptID;
    private String courseName;
    private String type;

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Course(){

    }

    public Course(int courseID, int deptID, String courseName, String type){
        this.courseID = courseID;
        this.deptID = deptID;
        this.courseName = courseName;
        this.type = type;
    }
}
