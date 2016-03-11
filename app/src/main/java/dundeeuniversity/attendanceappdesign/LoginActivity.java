package dundeeuniversity.attendanceappdesign;

//Login Activity hijacked by Will Hulme to make it work properly
//13:00 8/3/2016

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private EditText matriculation,passcode;
    private Button login;
    private RequestQueue requestQueue;
    private static final String URL = "https://zeno.computing.dundee.ac.uk/2015-agile/team4/user_control.php";
    private StringRequest request;

    final String TAG = this.getClass().getName();
    private CheckBox rememberMe;
    private SharedPreferences loginPrefs;
    private SharedPreferences.Editor loginEditor;
    private final static String USERNAME_KEY="matriculation";
    private final static String PASSWORD_KEY="passcode";
    private final static String SAVED_KEY="saved";
    private Intent logIntent;
    private boolean saved;


    @Override
    protected void onCreate(final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_actvity);
        startActivity(new Intent(getApplicationContext(), StudentTimetableActivity.class));

        matriculation = (EditText) findViewById(R.id.txtUsername);
        passcode = (EditText) findViewById(R.id.txtPassword);
        login = (Button) findViewById(R.id.loginConfirm);

        //check box code to see if data needs saving
        rememberMe = (CheckBox) findViewById(R.id.rememberMe);
        rememberMe.setOnCheckedChangeListener(this);
        saved = rememberMe.isChecked();

        //setting up the shared preferences to store the data
        loginPrefs=getSharedPreferences("loginPrefs", MODE_PRIVATE);
        loginEditor = loginPrefs.edit();

        String username = loginPrefs.getString("USERNAME_KEY", "");
        String password = loginPrefs.getString("PASSWORD_KEY", "");

        if(!(username.equals("") && password.equals("")))
        {

            // this will be the same login code as bellow (onClick) to get the info from the database, to check if a saved preference exists,
            // if it does then we will preform the login using the shared preference details and avoiding
            // having to click the login button


        }



        requestQueue = Volley.newRequestQueue(this);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                // this IF statement needs to go inside the code below after the username and password have been checked successfully
                if(saved){

                    //saves the data
                    loginEditor.putString("USERNAME_KEY", matriculation.getText().toString());
                    loginEditor.putString("PASSWORD_KEY", passcode.getText().toString());
                    loginEditor.apply();

                    //prints data to the android log (only required to check its working, delete after checking)
                    Log.d(TAG, loginPrefs.getString(USERNAME_KEY, ""));
                    Log.d(TAG, loginPrefs.getString(PASSWORD_KEY, ""));

                }


                request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            if(jsonObject.names().get(0).equals("success")) {
                                Toast.makeText(getApplicationContext(),"SUCCESS "+jsonObject.getString("success"),Toast.LENGTH_SHORT).show();

                                // Code above should go here i think after the successful checking of the username and password

                                startActivity(new Intent(getApplicationContext(),StudentTimetableActivity.class));
                            } else {
                                Toast.makeText(getApplicationContext(),"ERROR "+jsonObject.getString("error"),Toast.LENGTH_SHORT).show();
                            }
                        } catch(JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    }, new Response.ErrorListener(){
                        @Override
                                public void onErrorResponse(VolleyError error){
                        }
                }){
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap<String,String> hashMap = new HashMap<String,String>();
                        hashMap.put("matriculation",matriculation.getText().toString());
                        hashMap.put("passcode",passcode.getText().toString());
                        return hashMap;
                    }
                };
                requestQueue.add(request);
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        saved = isChecked;


    }
}