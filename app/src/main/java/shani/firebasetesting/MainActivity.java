package shani.firebasetesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {
   Button addBtn, updBtn, dltBtn;
   public static String test ="Your Task App";
   static  DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addBtn=findViewById(R.id.addBtn);
        updBtn=findViewById(R.id.updBtn);
        dltBtn=findViewById(R.id.deletBtn);



    }
public void buttonadd(View view){
    Intent intent=new Intent(MainActivity.this,Activity_UI.class);
    startActivity(intent);
}
public void buttonUpdate(View view){
        Intent intent=new Intent(MainActivity.this, Update_Delete_ViewAll.class);
        startActivity(intent);
}

}
