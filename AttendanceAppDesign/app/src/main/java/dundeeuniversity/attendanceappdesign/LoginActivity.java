package dundeeuniversity.attendanceappdesign;

//Login Activity hijacked by Will Hulme to make it work properly
//13:00 8/3/2016

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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

public class LoginActivity extends AppCompatActivity {

    private EditText matriculation,passcode;
    private Button login;
    private RequestQueue requestQueue;
    private static final String URL = "https://zeno.computing.dundee.ac.uk/2015-agile/team4/user_control.php";
    private StringRequest request;

    @Override
    protected void onCreate(final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_actvity);

        matriculation = (EditText) findViewById(R.id.txtUsername);
        passcode = (EditText) findViewById(R.id.txtPassword);
        login = (Button) findViewById(R.id.loginConfirm);

        requestQueue = Volley.newRequestQueue(this);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            if(jsonObject.names().get(0).equals("success")) {
                                Toast.makeText(getApplicationContext(),"SUCCESS "+jsonObject.getString("success"),Toast.LENGTH_SHORT).show();
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
}