package dundeeuniversity.attendanceappdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActvity extends Activity {


    Button btnLogin;
    EditText txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_actvity);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_actvity);
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.loginConfirm);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_actvity, menu);
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

    //Meadhbh and John's Code
    public void studentLogin(View view){
        Intent intent = new Intent(this, StudentTimetableActivity.class);

        if (txtUsername.getText().toString().equals("120012544") && txtPassword.getText().toString().equals("1234")) {
            startActivity(intent);
        } else {
            btnLogin.setText("Incorrect - Please Try Again");
        }
    }

    //Meadhbh and John's Code
    public void staffLogin(View view){
        Intent intent = new Intent(this, StaffTimetableActivity.class);

        if (txtUsername.getText().toString().equals("09H017") && txtPassword.getText().toString().equals("1234")) {
            startActivity(intent);
        } else {
            btnLogin.setText("Incorrect - Please Try Again");
        }
    }


}
