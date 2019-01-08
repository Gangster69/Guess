package com.fju.guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int max =100;
    int min=1;
    Random random =new Random();
    int secret =random.nextInt(100)+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    public void show(View view){

        while(true){
            int number =Integer.parseInt(((EditText)findViewById(R.id.ed_number)).getText().toString());
            if (secret > number){
                min =number;
                Toast.makeText(this,min+"to"+max,Toast.LENGTH_LONG).show();
            }
            if (secret < number){
                max =number;
                Toast.makeText(this ,min+"to"+max ,Toast.LENGTH_LONG).show();
            }
            if (secret == number){
                Toast.makeText(this ,"Yes, the number is : "+secret ,Toast.LENGTH_LONG).show();
                break;
            }
        }
    }
}
