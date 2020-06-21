package kz.itcollege.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class kurs3 extends AppCompatActivity {
    Button g3_1,g3_2,g3_3,g3_4,g3_5,g3_6,g3_7,g3_8,g3_9,g3_10,g3_11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurs3);
        g3_1 = findViewById(R.id.grop3_1);
        g3_2 = findViewById(R.id.grop3_2);
        g3_3 = findViewById(R.id.grop3_3);
        g3_4 = findViewById(R.id.grop3_4);
        g3_5 = findViewById(R.id.grop3_5);
        g3_6 = findViewById(R.id.grop3_6);
        g3_7 = findViewById(R.id.grop3_7);
        g3_8 = findViewById(R.id.grop3_8);
        g3_9 = findViewById(R.id.grop3_9);
        g3_10 = findViewById(R.id.grop3_10);
        g3_11 = findViewById(R.id.grop3_11);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.kurs3);

        g3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П 17-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П-1 17-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П-2 17-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "П-3 17-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ТЗИ 17-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g3_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "АЖ 17-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "МГКП 17-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g3_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "МК 17-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g3_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "МК 17-09 Р");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g3_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "ЕжА 17-09 К");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        g3_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(kurs3.this, grop4_1.class);
                Bundle b = new Bundle();
                b.putString("classID", "Э 17-09 Р");
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
