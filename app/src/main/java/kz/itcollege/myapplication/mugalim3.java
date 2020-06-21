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

public class mugalim3 extends AppCompatActivity {
    private static final String TAG = "mugalim";
    private static final int NUM_COLUMNS = 2;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mSabak = new ArrayList<>();
    private ArrayList<String> mId = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mugalim3);
        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.mug3);
        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_08.jpg");
        mName.add("Қырықбаева Нурзифа Ешеновна");
        mSabak.add("Председатель предметно-цикловой комиссии, препадователь английского языка");

        mImageUrls.add("https://intc.kz/images/2020/02/04/jpg4.");
        mName.add("Айтбаева Сауле Эрнeстовна");
        mSabak.add("Преподаватель русского языка и литературы");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_44.jpg");
        mName.add("Акан Айгуль Ерханқызы");
        mSabak.add("Преподаватель английского языка");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_605.jpg");
        mName.add("Акимова Зухра Кайратовна");
        mSabak.add("Преподаватель английского языка");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_41.jpg");
        mName.add("Баймомынова Шолпан Абрахмановна");
        mSabak.add("Преподаватель  казахского языка и литературы");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_607.jpg");
        mName.add("Даурембаева Нургуль Канагатовна");
        mSabak.add("Преподаватель  казахского языка и литературы");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_47.jpg");
        mName.add("Дусимбаева Меруерт Усеновна");
        mSabak.add("Преподаватель  казахского языка и литературы");

        mImageUrls.add("https://intc.kz/images/2020/01/19/img_6155.jpg");
        mName.add("Есманова Нурия Маратовна");
        mSabak.add("Преподаватель  английского языка");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_608.jpg");
        mName.add("Есперова Камила Маратовна");
        mSabak.add("Преподаватель  английского языка");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_609.jpg");
        mName.add("Кожахмет Әсем Мухитқызы");
        mSabak.add("Преподаватель  казахского языка и литературы");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_18.jpg");
        mName.add("Рысбай Жанар Иманғазықызы");
        mSabak.add("Преподаватель  казахского языка и литературы");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_610.jpg");
        mName.add("Сапарбекова Гулсана Ералықызы");
        mSabak.add("Преподаватель  английского языка");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_611.jpg");
        mName.add("Сейдахметова Сауле Таскожаевна");
        mSabak.add("Преподаватель  русского языка и лиетратуры");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_07.jpg");
        mName.add("Утесбаева Бибигуль Кажимовна");
        mSabak.add("Преподаватель  русского языка и литературы");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_612.jpg");
        mName.add("Утюпова Рабиға Дауылбаевна");
        mSabak.add("Преподаватель  русского языка");

        mImageUrls.add("https://intc.kz/images/2020/02/04/.jpg");
        mName.add("Шаяхметова Айдана Қайратқызы");
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
