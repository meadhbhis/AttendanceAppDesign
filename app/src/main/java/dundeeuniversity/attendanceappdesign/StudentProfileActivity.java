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
import dundeeuniversity.attendanceappdesign.models.StudentModel;
import dundeeuniversity.attendanceappdesign.stores.Module;
import dundeeuniversity.attendanceappdesign.stores.Student;

public class StudentProfileActivity extends Activity {

    TextView studentNameTextView;
    TextView matricNoTextView;
    TextView courseNameTextView;
    TextView emailAddressTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
        studentNameTextView = (TextView) findViewById(R.id.txtName);
        matricNoTextView = (TextView) findViewById(R.id.txtMatricNo);
        courseNameTextView = (TextView) findViewById(R.id.txtCourseName);
        emailAddressTextView = (TextView) findViewById(R.id.txtEmailAddress);

        StudentModel studentModel = new StudentModel();
        ModuleModel moduleModel = new ModuleModel();
        Student aStudent = new Student();
        ArrayList<Module> modules = new ArrayList<Module>();

        modules = moduleModel.retrieveModules();
        aStudent = studentModel.retrieveStudent();

        studentNameTextView.setText(aStudent.getFirstname() + " " + aStudent.getLastname());
        matricNoTextView.setText(aStudent.getMatricNo());
        courseNameTextView.setText(aStudent.getCourse());
        emailAddressTextView.setText(aStudent.getEmail());

        TableLayout table = (TableLayout) findViewById(R.id.moduleTable);

        for(int i=0; i<6; i++){
            TableRow row = new TableRow(this);
            Module m = new Module();
            m = modules.get(i);
            TextView txtModuleID = new TextView(this);
            txtModuleID.setText(m.getModuleID());
            TextView txtModuleName = new TextView(this);
            txtModuleName.setText(m.getModuleName());
            row.addView(txtModuleID);
            row.addView(txtModuleName);
            table.addView(row);
        }
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
}
