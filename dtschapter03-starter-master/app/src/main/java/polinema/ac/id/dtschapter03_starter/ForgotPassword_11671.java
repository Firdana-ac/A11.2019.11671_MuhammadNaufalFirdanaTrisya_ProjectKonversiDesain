package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgotPassword_11671 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_11671);
    }
    public void postSendRequest(View view){
        Intent i = new Intent(ForgotPassword_11671.this, ResetPassword_11671.class);
        startActivity(i);
    }
}