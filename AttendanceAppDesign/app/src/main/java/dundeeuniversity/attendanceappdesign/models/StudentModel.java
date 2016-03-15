package dundeeuniversity.attendanceappdesign.models;

import dundeeuniversity.attendanceappdesign.stores.Student;

/**
 * Created by john.bothwell1705 on 11/03/2016.
 */
public class StudentModel {
    public Student retrieveStudent(){
        Student aStudent = new Student();
        aStudent.setMatricNo("140014132");
        aStudent.setFirstname("John");
        aStudent.setLastname("Bothwell");
        aStudent.setEmail("j.bothwell@dundee.ac.uk");
        aStudent.setCourse("BSc (hons) Applied Computing");
        return aStudent;
    }

}
