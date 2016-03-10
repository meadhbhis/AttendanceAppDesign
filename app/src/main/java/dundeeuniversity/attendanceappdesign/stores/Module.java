package dundeeuniversity.attendanceappdesign.stores;

/**
 * Created by john.bothwell1705 on 09/03/2016.
 */
public class Module {
    private String moduleID;
    private String moduleName;
    private String moduleStaff;
    private int moduleYear;

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleStaff() {
        return moduleStaff;
    }

    public void setModuleStaff(String moduleStaff) {
        this.moduleStaff = moduleStaff;
    }

    public int getModuleYear() {
        return moduleYear;
    }

    public void setModuleYear(int moduleYear) {
        this.moduleYear = moduleYear;
    }

    public Module(){

    }

    public Module(String moduleID, String moduleName, String moduleStaff, int moduleYear){
        this.moduleID = moduleID;
        this.moduleName = moduleName;
        this.moduleStaff = moduleStaff;
        this.moduleYear = moduleYear;
    }
}
