package kz.itcollege.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Logo_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_activity);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Logo_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 500);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}
