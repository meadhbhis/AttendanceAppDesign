package dundeeuniversity.attendanceappdesign.models;

import java.util.ArrayList;

import dundeeuniversity.attendanceappdesign.stores.Module;

/**
 * Created by john.bothwell1705 on 11/03/2016.
 */
public class ModuleModel {
    public ArrayList<Module> retrieveModules(){
        ArrayList<Module> modules = new ArrayList<Module>();

        Module module1 = new Module("AC31007", "Agile Software Engineering");
        modules.add(module1);
        Module module2 = new Module("AC31008", "Networks and Data Communications");
        modules.add(module2);
        Module module3 = new Module("AC31009", "Games Programming");
        modules.add(module3);

        return modules;
    }
}
