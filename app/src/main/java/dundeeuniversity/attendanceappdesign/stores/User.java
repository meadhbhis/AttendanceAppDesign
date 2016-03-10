package dundeeuniversity.attendanceappdesign.stores;

/**
 * Created by john.bothwell1705 on 09/03/2016.
 */
public class User {
    private int userID;
    private int matriculationID;
    private String pincode;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getMatriculationID() {
        return matriculationID;
    }

    public void setMatriculationID(int matriculationID) {
        this.matriculationID = matriculationID;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public User(){

    }

    public User(int userID, int matriculationID, String pincode){
        this.userID = userID;
        this.matriculationID = matriculationID;
        this.pincode = pincode;
    }
}
