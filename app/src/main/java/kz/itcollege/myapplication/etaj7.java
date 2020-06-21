package kz.itcollege.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class etaj7 extends AppCompatActivity {




    Button k701,k702,k703,k704,k705,k706,k707,k708,k709,k710,k711;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etaj7);
        k701 = findViewById(R.id.k701);
        k702 = findViewById(R.id.k702);
        k703 = findViewById(R.id.k703);
        k704 = findViewById(R.id.k704);
        k705 = findViewById(R.id.k705);
        k706 = findViewById(R.id.k706);
        k707 = findViewById(R.id.k707);
        k708 = findViewById(R.id.k708);
        k709 = findViewById(R.id.k709);
        k710 = findViewById(R.id.k710);
        k711 = findViewById(R.id.k711);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.etaj7);

        k701.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "701");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k702.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "702");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k703.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "703");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k704.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "704");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k705.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "705");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k706.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "706");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k707.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "707");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k708.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "708");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k709.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "709");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k710.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "710");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        k711.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(etaj7.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "711");
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
