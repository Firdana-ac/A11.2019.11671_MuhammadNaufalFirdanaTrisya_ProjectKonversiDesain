package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SuccessActivity_11671 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_11671);
    }
    public void postSendRequest(View view){
        Intent i = new Intent( SuccessActivity_11671.this, SuccessActivity_11671.class);
        startActivity(i);
    }
}