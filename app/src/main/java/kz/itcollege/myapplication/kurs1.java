package kz.itcollege.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class kurs1 extends AppCompatActivity {
    Button g1_1,g1_2,g1_3,g1_4,g1_5,g1_6,g1_7,g1_8,g1_9,g1_10,g1_11,g1_12,g1_13,g1_14,g1_15,g1_16,g1_17,g1_18,g1_19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurs1);
        g1_1 = findViewById(R.id.grop1_1);
        g1_2 = findViewById(R.id.grop1_2);
        g1_3 = findViewById(R.id.grop1_3);
        g1_4 = findViewById(R.id.grop1_4);
        g1_5 = findViewById(R.id.grop1_5);
        g1_6 = findViewById(R.id.grop1_6);
        g1_7 = findViewById(R.id.grop1_7);
        g1_8 = findViewById(R.id.grop1_8);
        g1_9 = findViewById(R.id.grop1_9);
        g1_10 = findViewById(R.id.grop1_10);
        g1_11 = findViewById(R.id.grop1_11);
        g1_12 = findViewById(R.id.grop1_12);
        g1_13 = findViewById(R.id.grop1_13);
        g1_14 = findViewById(R.id.grop1_14);
        g1_15 = findViewById(R.id.grop1_15);
        g1_16 = findViewById(R.id.grop1_16);
        g1_17 = findViewById(R.id.grop1_17);
        g1_18 = findViewById(R.id.grop1_18);
        g1_19 = findViewById(R.id.grop1_19);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.kurs1);

        g1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П1-19К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П2-19К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П3-19Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П4-19Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ПД1-19Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ПД2-19Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ПД3-19К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ПД4-19К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ТЗИ-19Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ТЗИ1Д-19Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "АҚТ-19К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ИС-19Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ИСД-19Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "АЖ-19К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "С-19Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "С-19К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "МК-19К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ЕжА-19К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g1_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs1.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "Д-19Р");
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
