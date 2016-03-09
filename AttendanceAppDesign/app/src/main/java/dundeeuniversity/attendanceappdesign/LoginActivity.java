package dundeeuniversity.attendanceappdesign;

//Login Activity hijacked by Will Hulme to make it work properly
//13:00 8/3/2016

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;

public class LoginActivity extends AppCompatActivity {

    private EditText matriculation,passcode;
    private Button login;
    private RequestQueue requestQueue;
    private static final String URL = "https://zeno.computing.dundee.ac.uk/2015-agile/team4/user_control.php";
    private StringRequest request;

    @Override
    protected void onCreate(final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        matriculation = (EditText) findViewById(R.id.matriculation);
        
    }
}