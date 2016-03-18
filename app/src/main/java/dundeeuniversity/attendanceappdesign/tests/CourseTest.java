package dundeeuniversity.attendanceappdesign.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dundeeuniversity.attendanceappdesign.stores.Course;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by john.bothwell1705 on 18/03/2016.
 */
public class CourseTest {
    Course aCourse;

    @Before
    public void setup(){
        aCourse = new Course();
        aCourse.setCourseName("BSc (hons) Applied Computing");
    }

    @Test
    public void testGetCourseName(){
        String coursename = aCourse.getCourseName();
        assertEquals("Course name is BSc (hons) Applied Computing", "BSc (hons) Applied Computing", coursename);
    }

    @After
    public void tearDown(){
        aCourse = null;
        assertNull(aCourse);
    }

}
