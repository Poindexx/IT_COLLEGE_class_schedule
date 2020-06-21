package kz.itcollege.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;

import com.andrognito.flashbar.Flashbar;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class MapActivity extends MainActivity {
    ImageView logout;
    Button btn_kurs4, btn_kurs3 ,btn_kurs2,btn_kurs1,mugalim,etaj3,etaj5,etaj6,etaj7;
    RelativeLayout map_e;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.rasp);


        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        map_e = findViewById(R.id.map_element);


        btn_kurs4=  findViewById(R.id.kurs4);
        btn_kurs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, kurs4.class));
            }
        });
        btn_kurs3=  findViewById(R.id.kurs3);
        btn_kurs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, kurs3.class));
            }
        });
        btn_kurs2=  findViewById(R.id.kurs2);
        btn_kurs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, kurs2.class));
            }
        });
        btn_kurs1=  findViewById(R.id.kurs1);
        btn_kurs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, kurs1.class));
            }
        });

        mugalim=findViewById(R.id.mugalim);
        mugalim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, mugalimder.class));
            }
        });

       etaj3=  findViewById(R.id.etaj3);
       etaj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, etaj3.class));
            }
        });
        etaj5=  findViewById(R.id.etaj5);
        etaj5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, etaj5.class));
            }
        });
        etaj6=  findViewById(R.id.etaj6);
        etaj6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, etaj6.class));
            }
        });
        etaj7=  findViewById(R.id.etaj7);
        etaj7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, etaj7.class));
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.more, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.viti:
                Logout();
                SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("remember", "false");
                editor.apply();
                MapActivity.super.Logout();
                signOut();
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private static long back_pressed;

    @Override
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            new Flashbar.Builder(MapActivity.this)
                    .gravity(Flashbar.Gravity.TOP)
                    .title(R.string.viti)
                    .message(R.string.viti1)
                    .enableSwipeToDismiss()
                    .dismissOnTapOutside()
                    .backgroundDrawable(R.drawable.gradient1)
                    .show();
        }

        back_pressed = System.currentTimeMillis();
    }


    private void signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(MapActivity.this, "sing out succsses", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
    }


}
