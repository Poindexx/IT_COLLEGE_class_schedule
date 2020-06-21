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

public class mugalim extends AppCompatActivity {
    private static final String TAG = "mugalim";
    private static final int NUM_COLUMNS = 2;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mSabak = new ArrayList<>();
    private ArrayList<String> mId = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mugalim);
        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.mug1);

        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_27.jpg");
        mName.add("Раймбаева Макпал Едилбаевна");
        mSabak.add("Председатель предметно-цикловой комиссии, преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_555.jpg");
        mName.add("Абишев Ернар Болатұлы");
        mSabak.add("Преподаватель спецдисциплин");


        mImageUrls.add("https://intc.kz/images/2020/01/19/zaglushka.jpg");
        mName.add("Гимадиев Тимур Насырович");
        mSabak.add("Преподаватель спецдисциплин");


        mImageUrls.add("https://intc.kz/images/2020/01/19/zaglushka.jpg");
        mName.add("Досанов Бекжан Бегматұлы");
        mSabak.add("Преподаватель спецдисциплин");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_556.jpg");
        mName.add("Жандосов Адил Бауыржанович");
        mSabak.add("Преподаватель спецдисциплин");


        mImageUrls.add("https://intc.kz/images/2020/01/19/img_6171.jpg");
        mName.add("Жидебай Исламбек Куанышбайұлы");
        mSabak.add("Преподаватель спецдисциплин");


        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_557.jpg");
        mName.add("Жолдас Нұрасыл Айдосұлы");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_31.jpg");
        mName.add("Ильясов Алишер Аскарович");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_558.jpg");
        mName.add("Кожатаева Нурсулу Аманжоловна");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/01/19/img_6164.jpg");
        mName.add("Қадырбек Нурғали Қазбекұлы");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_559.jpg");
        mName.add("Мисебай Арманбек Муратбекұлы");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/01/19/intc.kz_600.jpg");
        mName.add("Нүсіпжан Айдана Маратқызы");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/02/04/jpg.");
        mName.add("Сагинаева Айгерим Кыдыркызы");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/02/04/jpg7.");
        mName.add("Сайлау Бекасыл");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/02/04/jpg2.");
        mName.add("Саясат Нұрым Ерланұлы");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/01/19/zaglushka2.jpg");
        mName.add("Төлеуғазы Райымбек");
        mSabak.add("Преподаватель спецдисциплин");

        mImageUrls.add("https://intc.kz/images/2020/02/04/jpg3.");
        mName.add("Әубәкір Тоқтар Мырзабеккұлы");
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
