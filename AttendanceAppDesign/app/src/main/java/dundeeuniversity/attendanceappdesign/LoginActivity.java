package dundeeuniversity.attendanceappdesign;

//Login Activity hijacked by Will Hulme to make it work properly
//13:00 8/3/2016

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity implements View.OnClickListener {

    //Private JSON String
    private String myJSONString;

    //Private variables for holding login information
    private static final String JSON_ARRAY ="Result";
    private static final String ID = "ID";
    private static final String USERNAME= "Matriculation";
    private static final String PASSWORD = "Passcode";

    private JSONArray users = null;

    private int TRACK = 0;

    Button btnLogin;
    EditText txtUsername, txtPassword;

    //Create function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_actvity);

        myJSONString = "My_JSON";

        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);

        btnLogin = (Button) findViewById(R.id.loginConfirm);
        btnLogin.setOnClickListener(this);

        extractJSON();
    }

    private void extractJSON(){
        try {
            JSONObject jsonObject = new JSONObject(myJSONString);
            users = jsonObject.getJSONArray(JSON_ARRAY);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, StudentTimetableActivity.class);
        if (v == btnLogin) {
            startActivity(intent);

        } else {
            Context context = getApplicationContext();
            CharSequence text = "Login Error!";
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, text, duration).show();
        }
    }
}
