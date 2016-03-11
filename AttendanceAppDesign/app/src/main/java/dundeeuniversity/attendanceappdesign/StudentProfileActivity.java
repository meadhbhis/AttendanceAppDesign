package dundeeuniversity.attendanceappdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class StudentProfileActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student_profile, menu);
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

    public void viewStudentModule(View view){
        Intent intent = new Intent(this, StudentModuleActivity.class);

        startActivity(intent);
    }

    public void viewStudentTimetable(View view){
        Intent intent = new Intent(this, StudentTimetableActivity.class);

        startActivity(intent);
    }

    public void returnToLogin(View view){
        Intent intent = new Intent(this, LoginActivity.class);

        startActivity(intent);
    }

    public void scanQR(View view){
        Intent intent = new Intent(this, ScanQRTestActivity.class);

        startActivity(intent);
    }
}
