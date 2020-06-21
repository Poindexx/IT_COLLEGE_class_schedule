package kz.itcollege.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class progressButton extends MainActivity{

    private CardView cardView;
    private ConstraintLayout layout;
    private ProgressBar progressBar;
    private TextView textView;

    Animation fade_in;

    progressButton(Context ct,View view){

        cardView = view.findViewById(R.id.card_view_log);
        layout = view.findViewById(R.id.constraint_layout_log);
        textView = view.findViewById(R.id.textView_log);
        progressBar = view.findViewById(R.id.progressBar);

    }
    void buttonActivated(){
        progressBar.setVisibility(View.VISIBLE);
        textView.setText(R.string.podajdite);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(15);
        textView.setWidth(300);
    }
    @SuppressLint("ResourceAsColor")
    void buttonNoActiv(){
        progressBar.setVisibility(View.GONE);
        textView.setText(R.string.log);
        textView.setTextSize(20);
        textView.setTextColor(R.color.colorBlue);
        textView.setGravity(Gravity.CENTER);
        textView.setWidth(300);
    }
    void buttonFinished(){
        layout.setBackgroundColor(cardView.getResources().getColor(R.color.colorGreen));
        progressBar.setVisibility(View.GONE);
        textView.setText(R.string.dobro);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(15);
    }
}
