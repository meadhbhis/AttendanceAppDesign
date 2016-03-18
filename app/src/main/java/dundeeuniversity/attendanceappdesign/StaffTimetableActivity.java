package dundeeuniversity.attendanceappdesign;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

public class StaffTimetableActivity extends Activity {

    final String TAG = this.getClass().getName();
    SharedPreferences loginPrefs;
    SharedPreferences.Editor loginEditor;
    Button logout;

    private RequestQueue requestQueue;
    private static final String URL = "https://zeno.computing.dundee.ac.uk/2015-agile/team4/timetable1.php";
    private StringRequest request;

    TextView module1, module2, module3, module4, module5, module6, module7, module8;
    TextView info1, info2, info3, info4, info5, info6, info7, info8;
    String hour1, hour2, hour3, hour4, hour5, hour6, hour7, hour8;
    String[] room, moduleName, classTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_timetable);

        loginPrefs=getSharedPreferences("loginPrefs", MODE_PRIVATE);

        Log.d(TAG, loginPrefs.getString("USERNAME_KEY", ""));
        Log.d(TAG, loginPrefs.getString("PASSWORD_KEY", ""));

      /* *//* logout = (Button) findViewById(R.id.btnLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // clears the shared preferences and send the user back to the login page
                loginEditor = loginPrefs.edit();
                loginEditor.clear();
                loginEditor.commit();

                Intent in = new Intent(StaffTimetableActivity.this, LoginActivity.class);
                startActivity(in);
            }*//*
        });*/




    }

    public void setData(){

        final String KEY = "class";

        // code to pull the information out the database
        request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray result = jsonObject.getJSONArray(KEY);

                    //gets the every class in the array
                    for(int i = 0; i< 6; i++)
                    {
                        JSONObject collegeData = result.getJSONObject(i);
                        room[i] = collegeData.getString("info");
                        moduleName[i] = collegeData.getString("module");
                        classTime[i] = collegeData.getString("time");

                        if(Arrays.asList(classTime).contains(hour1))
                        {


                        }

                    }


                    if(jsonObject.names().get(0).equals("success")) {
                        Toast.makeText(getApplicationContext(), jsonObject.getString("success"), Toast.LENGTH_SHORT).show();

                        // fillTable(room, moduleName, classTime);
                        //setTime(hour1);

                    } else {
                        Toast.makeText(getApplicationContext(),jsonObject.getString("error"),Toast.LENGTH_SHORT).show();
                    }
                } catch(JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error){
            }
        })
        {

        };
        requestQueue.add(request);
    }

    public void fillTable (String info, String module, String time){

        String hours;
        String date;
        String StringUtils = null;

        if(time != null)
        {


            String split[] = StringUtils.split(time);

            hours = split[0];
            date = split[1];

        }


        //fills the text views with the information
        // module1.setText();
        //info1.setText();



        //module2.setText();
        // info2.setText();



        //module3.setText();
        // info3.setText();


        //module4.setText();
        // info4.setText();


        //module5.setText();
        // info5.setText();



        //module6.setText();
        // info6.setText();


        //module7.setText();
        // info7.setText();

        //module8.setText();
        // info8.setText();

    }

    public void setTime(){


        hour1 = "2016-01-01 09:00:00";
        hour2 = "2016-01-01 10:00:00";
        hour3 = "2016-01-01 11:00:00";
        hour4 = "2016-01-01 12:00:00";
        hour5 = "2016-01-01 13:00:00";
        hour6 = "2016-01-01 14:00:00";
        hour7 = "2016-01-01 15:00:00";
        hour8 = "2016-01-01 16:00:00";

    }

    public void setTableVariables(){

        //finds the text views
        module1 = (TextView) findViewById(R.id.module1);
        info1 = (TextView) findViewById(R.id.info1);

        module2 = (TextView) findViewById(R.id.module2);
        info2 = (TextView) findViewById(R.id.info2);

        module3 = (TextView) findViewById(R.id.module3);
        info3 = (TextView) findViewById(R.id.info3);

        module4 = (TextView) findViewById(R.id.module4);
        info4 = (TextView) findViewById(R.id.info4);

        module5 = (TextView) findViewById(R.id.module5);
        info5 = (TextView) findViewById(R.id.info5);

        module6 = (TextView) findViewById(R.id.module6);
        info6 = (TextView) findViewById(R.id.info6);

        module7 = (TextView) findViewById(R.id.module7);
        info7 = (TextView) findViewById(R.id.info7);

        module8 = (TextView) findViewById(R.id.module8);
        info8 = (TextView) findViewById(R.id.info8);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_staff_timetable, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void viewStaffProfile(View view){
        Intent intent = new Intent(this, StaffProfileActivity.class);

        startActivity(intent);
    }

    public void viewClassStaff(View view){
        Intent intent = new Intent(this, StaffViewClassActivity.class);

        startActivity(intent);
    }

}
