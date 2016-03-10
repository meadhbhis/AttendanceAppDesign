package dundeeuniversity.attendanceappdesign.stores;

/**
 * Created by john.bothwell1705 on 22/02/2016.
 */
public class Class {
    private int classID;
    private int module;
    private String time;
    private String info;


    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Class(){

    }

    public Class(int classID, int module, String time, String info){
        this.classID = classID;
        this.module = module;
        this.time = time;
        this.info = info;
    }
}
