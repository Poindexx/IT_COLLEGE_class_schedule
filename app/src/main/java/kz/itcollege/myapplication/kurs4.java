package kz.itcollege.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class kurs4 extends AppCompatActivity {

    Button g4_1,g4_2,g4_3,g4_4,g4_5,g4_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurs4);
        g4_1 = findViewById(R.id.grop4_1);
        g4_2 = findViewById(R.id.grop4_2);
        g4_3 = findViewById(R.id.grop4_3);
        g4_4 = findViewById(R.id.grop4_4);
        g4_5 = findViewById(R.id.grop4_5);
        g4_6 = findViewById(R.id.grop4_6);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.kurs4);

//        g4_5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(kurs4.this,grop4_5.class));
//            }
//        });

        g4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs4.this, grop4_1.class);
                Bundle b = new Bundle();
                Bundle c = new Bundle();
                c.putString("id_grop","41");
                b.putString("classID", "МГКП 16-09 К");
                intent.putExtras(b);
                intent.putExtras(c);
                startActivity(intent);
            }
        });
        g4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs4.this, grop4_1.class);
                Bundle b = new Bundle();
                Bundle c = new Bundle();
                c.putString("id_grop","42");
                b.putString("classID", "АжБ 16-09 К");
                intent.putExtras(b);
                intent.putExtras(c);
                startActivity(intent);
            }
        });
        g4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs4.this, grop4_1.class);
                Bundle b = new Bundle();
                Bundle c = new Bundle();
                c.putString("id_grop","43");
                b.putString("classID", "ЕТжБК 16-09 К1");
                intent.putExtras(b);
                intent.putExtras(c);
                startActivity(intent);
            }
        });
        g4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs4.this, grop4_1.class);
                Bundle b = new Bundle();
                Bundle c = new Bundle();
                c.putString("id_grop","44");
                b.putString("classID", "ВТиПО 16-09 Р1");
                intent.putExtras(b);
                intent.putExtras(c);
                startActivity(intent);
            }
        });
        g4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs4.this, grop4_1.class);
                Bundle b = new Bundle();
                Bundle c = new Bundle();
                c.putString("id_grop","45");
                b.putString("classID", "ЕТжБК 16-09 К2");
                intent.putExtras(b);
                intent.putExtras(c);
                startActivity(intent);
            }
        });
        g4_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(kurs4.this, grop4_1.class);
                Bundle b = new Bundle();
                Bundle c = new Bundle();
                c.putString("id_grop","46");
                b.putString("classID", "ВТиПО 16-09 Р2");
                intent.putExtras(b);
                intent.putExtras(c);
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
