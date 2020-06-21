package kz.itcollege.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class mugalimder extends AppCompatActivity {
    Button mug1,mug2,mug3,mug4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mugalimder);
        mug1 = findViewById(R.id.mug1);
        mug2 = findViewById(R.id.mug2);
        mug3 = findViewById(R.id.mug3);
        mug4 = findViewById(R.id.gmug4);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.tv_prepodavateli);

        mug1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mugalimder.this,mugalim.class));
            }
        });
        mug2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mugalimder.this,mugalim2.class));
            }
        });
        mug3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mugalimder.this,mugalim3.class));
            }
        });
        mug4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mugalimder.this,mugalim4.class));
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
