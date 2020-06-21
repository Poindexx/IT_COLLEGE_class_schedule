package kz.itcollege.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class etaj3 extends AppCompatActivity {
    Button k301,k302,k303,k304,k305,k306,k307,k308,k309,k310,k311;

        @SuppressLint("ResourceAsColor")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_etaj3);
        k301 = findViewById(R.id.k301);
        k302 = findViewById(R.id.k302);
        k303 = findViewById(R.id.k303);
        k304 = findViewById(R.id.k304);
        k305 = findViewById(R.id.k305);
        k306 = findViewById(R.id.k306);
        k307 = findViewById(R.id.k307);
        k308 = findViewById(R.id.k308);
        k309 = findViewById(R.id.k309);
        k310 = findViewById(R.id.k310);
        k311 = findViewById(R.id.k311);

            Toolbar toolbar = findViewById(R.id.toolbar3);
            toolbar.setTitle(" ");
            setSupportActionBar(toolbar);
            Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.etaj3);

        k301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "301");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "302");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "303");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "304");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "305");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "306");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k307.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "307");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k308.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "308");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k309.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "309");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "310");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k311.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "311");
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
