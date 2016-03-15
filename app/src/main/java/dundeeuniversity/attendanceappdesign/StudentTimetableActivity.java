package dundeeuniversity.attendanceappdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

import dundeeuniversity.attendanceappdesign.models.ModuleModel;
import dundeeuniversity.attendanceappdesign.stores.Module;

public class StudentTimetableActivity extends Activity {

    TextView moduleTimeTextView;
    TextView moduleTitleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_timetable);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student_timetable, menu);
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

    public void viewStudentProfile(View view){
        Intent intent = new Intent(this, StudentProfileActivity.class);

        startActivity(intent);
    }

    public void viewStudentClass(View view){
        Intent intent = new Intent(this, StudentViewClassActivity.class);

        startActivity(intent);
    }
}
