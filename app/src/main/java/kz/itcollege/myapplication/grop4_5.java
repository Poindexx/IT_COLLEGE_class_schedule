package kz.itcollege.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class grop4_5 extends AppCompatActivity {

    ImageView back_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grop4_5);
        TextView textView =  findViewById(R.id.textAuthor);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        back_page = findViewById(R.id.home_page);

        back_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(grop4_5.this,MapActivity.class));
            }
        });

    }
}
