package dundeeuniversity.attendanceappdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

//Refactored by Will
//From 1.68KB to 1.55KB

public class LoginActvity extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_login_actvity);
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

 //BUTTON CODE
 public void studentLogin(View view) {
  Intent intent = new Intent(this, StudentTimetableActivity.class);

  startActivity(intent);

 }

 public void staffLogin(View view) {
  Intent intent = new Intent(this, StaffTimetableActivity.class);

  startActivity(intent);
 }

 public void viewStudents(View view) {
  Intent intent = new Intent(this, StaffStudentListActivity.class);

  startActivity(intent);
 }
}