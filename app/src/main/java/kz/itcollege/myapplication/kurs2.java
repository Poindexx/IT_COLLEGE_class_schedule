package kz.itcollege.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class kurs2 extends AppCompatActivity {
    Button g2_1,g2_2,g2_3,g2_4,g2_5,g2_6,g2_7,g2_8,g2_9,g2_10,g2_11,g2_12,g2_13,g2_14,g2_15,g2_16,g2_17,g2_18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurs2);
        g2_1 = findViewById(R.id.grop2_1);
        g2_2 = findViewById(R.id.grop2_2);
        g2_3 = findViewById(R.id.grop2_3);
        g2_4 = findViewById(R.id.grop2_4);
        g2_5 = findViewById(R.id.grop2_5);
        g2_6 = findViewById(R.id.grop2_6);
        g2_7 = findViewById(R.id.grop2_7);
        g2_8 = findViewById(R.id.grop2_8);
        g2_9 = findViewById(R.id.grop2_9);
        g2_10 = findViewById(R.id.grop2_10);
        g2_11 = findViewById(R.id.grop2_11);
        g2_12 = findViewById(R.id.grop2_12);
        g2_13 = findViewById(R.id.grop2_13);
        g2_14 = findViewById(R.id.grop2_14);
        g2_15 = findViewById(R.id.grop2_15);
        g2_16 = findViewById(R.id.grop2_16);
        g2_17 = findViewById(R.id.grop2_17);
        g2_18 = findViewById(R.id.grop2_18);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.kurs2);

        g2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П 18-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П-1 18-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П-2 18-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "Пд-1 18-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "Пд-2 18-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "Пд-3 18-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ТЗИ 18-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ТЗИд 18-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "АҚТ 18-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ИС 18-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "АЖ 18-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "АЖд 18-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "МК-1 18-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "МК-2 18-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "МК-3 18-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "МК-4 18-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "Э 18-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g2_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs2.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ЕжА 18-09 К");
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
