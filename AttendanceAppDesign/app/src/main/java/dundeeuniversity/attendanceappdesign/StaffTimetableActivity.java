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

public class StaffTimetableActivity extends Activity {

    final String TAG = this.getClass().getName();
    SharedPreferences loginPrefs;
    SharedPreferences.Editor loginEditor;
     Button logout;

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
