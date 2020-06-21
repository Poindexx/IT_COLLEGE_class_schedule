package kz.itcollege.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.Objects;

public class mugalim4 extends AppCompatActivity {
    private static final String TAG = "mugalim";
    private static final int NUM_COLUMNS = 2;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mSabak = new ArrayList<>();
    private ArrayList<String> mId = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mugalim4);
        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.mug4);
        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_09.jpg");
        mName.add("Смайлова Арайлым Сағатовна");
        mSabak.add("Председатель предметно-цикловой комиссии, преподаватель  математики");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_614.jpg");
        mName.add("Айтуова Эльмира Саматовна");
        mSabak.add("Преподаватель  Истории Казахстана");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_06.jpg");
        mName.add("Досжан Бақыткул Наукановна");
        mSabak.add("Преподаватель  химии");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_615.jpg");
        mName.add("Дүрменбаева Жадыра Дүйсенбекқызы");
        mSabak.add("Преподаватель  химии");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_43.jpg");
        mName.add("Ертисбаева Самалай Бейлхановна");
        mSabak.add("Преподаватель  истории, географии, политологии и социологии");


        mImageUrls.add("https://intc.kz/images/2020/01/19/img_6207.jpg");
        mName.add("Ілесбеков Жолдасбек Құрасбекұлы");
        mSabak.add("Преподаватель физической культуры");


        mImageUrls.add("https://intc.kz/images/2020/02/04/jpg5.");
        mName.add("Кабдрасил Жанибек Кабдрасилович");
        mSabak.add("Преподаватель физики");

        mImageUrls.add("https://intc.kz/images/2020/01/19/img_6200.jpg");
        mName.add("Карымбаев Аскар Мырзабекович");
        mSabak.add("Преподаватель  начально-военной подготовки");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_23.jpg");
        mName.add("Марасулов Нұрлы Канатұлы");
        mSabak.add("Преподаватель культурологии, обществознания");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_37.jpg");
        mName.add("Оразбекова Нилиям Тохтахуновна");
        mSabak.add("Преподаватель физической культуры");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_618.jpg");
        mName.add("Оспанова Жайна Ермекбайқызы");
        mSabak.add("Преподаватель физики");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_38.jpg");
        mName.add("Сабырлы Жақсылық Тынысбекұлы");
        mSabak.add("Преподаватель физической культуры");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_620.jpg");
        mName.add("Сандыбаева Сандугаш Қалжанқызы");
        mSabak.add("Преподаватель  биологии");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_621.jpg");
        mName.add("Саттарова Рамина Рустамовна");
        mSabak.add("Преподаватель  истории");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_40.jpg");
        mName.add("Умиргалиева Айжан Бауыржановна");
        mSabak.add("Преподаватель математик");

        mImageUrls.add("https://intc.kz/images/2020/02/04/-.jpg");
        mName.add("Жексембаев Кайнар Иманбаевич");
        mSabak.add("Преподаватель");

        initRecyclerView();
    }



    private  void  initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initializing staggerd recyclerview. ");

        RecyclerView recyclerView = findViewById(R.id.recyclerView_m);
        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter = new StaggeredRecyclerViewAdapter(this,mName,mSabak ,mId, mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggeredRecyclerViewAdapter);
    }
}
