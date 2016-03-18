package dundeeuniversity.attendanceappdesign.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import dundeeuniversity.attendanceappdesign.stores.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by john.bothwell1705 on 18/03/2016.
 */
public class StudentTest {

    private Student aStudent;
    private ArrayList<Object> modules;

    @Before
    public void setup(){
        aStudent = new Student();
        aStudent.setStudentID(0);
        aStudent.setFirstname("John");

        modules = new ArrayList<Object>();
        Object obj1 = new Object();
        Object obj2 = new Object();
        modules.add(obj1);
        modules.add(obj2);
    }

    @Test
    public void testgetStudentID(){
        int studentID = aStudent.getStudentID();
        assertEquals("Student ID is 0",0,studentID);
    }

    @Test
    public void testGetFirstname(){
        String firstname = aStudent.getFirstname();
        assertEquals("Student name is John","John",firstname);
    }

    @Test
    public void testStudentModules(){
        assertEquals("Size is 2",2,modules.size());
    }

    @After
    public void takeDown(){
        aStudent = null;
        assertNull(aStudent);

        modules = null;
        assertNull(modules);
    }

}
