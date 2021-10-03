package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeSlideCalender_11671 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_calender_11671);
    }
    public void clickGetStarted (View view){
        Intent i = new Intent(WelcomeSlideCalender_11671. this, WelcomeSlideSuperhero_11671.class);
        startActivity(i);

    }

    public void clickLogin(View view){
        Intent i =new Intent(WelcomeSlideCalender_11671.this, WelcomeBack_11671.class);
        startActivity(i);
    }
}