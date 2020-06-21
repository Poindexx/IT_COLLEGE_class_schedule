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

public class mugalim2 extends AppCompatActivity {
    private static final String TAG = "mugalim";
    private static final int NUM_COLUMNS = 2;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mSabak = new ArrayList<>();
    private ArrayList<String> mId = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mugalim2);
        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.mug2);
        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_34.jpg");
        mName.add("Кудабаева Кульбайра Ерназаровна");
        mSabak.add("Председатель предметно-цикловой комиссии, преподаватель спецдисциплин.");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_15.jpg");
        mName.add("Асет Асхат");
        mSabak.add("Преподаватель спецдисциплин");


        mImageUrls.add("https://intc.kz/images/2020/01/19/zaglushka2.jpg");
        mName.add("Дараев Абдумежит Масимович");
        mSabak.add("Преподаватель спецдисциплин, кандидат технических наук");


        mImageUrls.add("https://intc.kz/images/2020/01/19/zaglushka2.jpg");
        mName.add("Манасова Бакыт Сериккуловна");
        mSabak.add("Преподаватель  экономических дисциплин.");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_601.jpg");
        mName.add("Муратбекқызы Айжан");
        mSabak.add("Преподаватель экономических дисциплин.");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_602.jpg");
        mName.add("Наримова Гульмира Абатовна");
        mSabak.add("Преподаватель спецдисциплин");


        mImageUrls.add("https://intc.kz/images/2020/02/04/jpg6.");
        mName.add("Орынбекова Сауле Жарылкасыновна");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_13.jpg");
        mName.add("Рашат Есентай");
        mSabak.add("Преподаватель спецдисциплин");


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
