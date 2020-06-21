package kz.itcollege.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class etaj6 extends AppCompatActivity {


    Button k601,k602,k603,k604,k605,k606,k607,k608,k609,k610,k611;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etaj6);
        k601 = findViewById(R.id.k601);
        k602 = findViewById(R.id.k602);
        k603 = findViewById(R.id.k603);
        k604 = findViewById(R.id.k604);
        k605 = findViewById(R.id.k605);
        k606 = findViewById(R.id.k606);
        k607 = findViewById(R.id.k607);
        k608 = findViewById(R.id.k608);
        k609 = findViewById(R.id.k609);
        k610 = findViewById(R.id.k610);
        k611 = findViewById(R.id.k611);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.etaj6);

        k601.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "601");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k602.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "602");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k603.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "603");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k604.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "604");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k605.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "605");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k606.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "606");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k607.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "607");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k608.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "608");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k609.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "609");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k610.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "610");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k611.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj6.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "611");
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
