package dundeeuniversity.attendanceappdesign.models;

import java.util.ArrayList;

import dundeeuniversity.attendanceappdesign.stores.Module;
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
        aStudent.setModules(this.retrieveStudentModules());
        return aStudent;
    }

    public ArrayList<Module> retrieveStudentModules(){
        ArrayList<Module> modules = new ArrayList<Module>();
        Module module1 = new Module();
        Module module2 = new Module();
        Module module3 = new Module();
        module1.setModuleID("AC31007");
        module1.setModuleName("Agile Software Engineering");
        module2.setModuleID("AC31009");
        module2.setModuleName("Games Programming");
        module3.setModuleID("AC32005");
        module3.setModuleName("Human Computer Interaction");
        modules.add(module1);
        modules.add(module2);
        modules.add(module3);
        return modules;
    }
}
