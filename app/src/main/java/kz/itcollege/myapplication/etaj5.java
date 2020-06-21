package kz.itcollege.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class etaj5 extends AppCompatActivity {

    Button k501,k502,k503,k504,k505,k506,k507,k508,k509,k510,k511;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etaj5);
        k501 = findViewById(R.id.k501);
        k502 = findViewById(R.id.k502);
        k503 = findViewById(R.id.k503);
        k504 = findViewById(R.id.k504);
        k505 = findViewById(R.id.k505);
        k506 = findViewById(R.id.k506);
        k507 = findViewById(R.id.k507);
        k508 = findViewById(R.id.k508);
        k509 = findViewById(R.id.k509);
        k510 = findViewById(R.id.k510);
        k511 = findViewById(R.id.k511);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.etaj5);

        k501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "501");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k502.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "502");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k503.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "503");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k504.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "504");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k505.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "505");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k506.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "506");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k507.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "507");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k508.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "508");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k509.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "509");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k510.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "510");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k511.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj5.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "511");
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
