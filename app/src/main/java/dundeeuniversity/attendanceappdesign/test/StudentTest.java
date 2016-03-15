package dundeeuniversity.attendanceappdesign.test;

import org.junit.Test;

import dundeeuniversity.attendanceappdesign.stores.Student;

import static org.junit.Assert.assertEquals;

/**
 * Created by john.bothwell1705 on 15/03/2016.
 */
public class StudentTest {
    @Test
    public void testGetStudentID(){
        Student s = new Student();
        int studentID = s.getStudentID();
        assertEquals("StudentID = 0",0,studentID);
    }
}
