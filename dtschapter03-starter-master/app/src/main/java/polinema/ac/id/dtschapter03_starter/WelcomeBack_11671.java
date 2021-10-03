package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeBack_11671 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back_11671);
    }
    public void clickForgot(View view){
        Intent i = new Intent(WelcomeBack_11671.this,SuccessActivity_11671.class);
        startActivity(i);
    }
    public void postLogin(View view){
        Intent i = new Intent(WelcomeBack_11671.this, SuccessActivity_11671.class);
        startActivity(i);
    }
}