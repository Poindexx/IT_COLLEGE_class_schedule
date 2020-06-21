package kz.itcollege.myapplication;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class grop4_1 extends AppCompatActivity {

    TabLayout tablayout;
    ViewPager viewPager;
    TabItem pn,vt,cr,ct,pt,sb;
    PagerAdapter pagerAdapter;
    Toolbar toolbar;
    String classID;
    Bundle bundle;
    ImageView back_page;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grop4_1);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        pn = (TabItem) findViewById(R.id.tabItem);
        vt = (TabItem) findViewById(R.id.tabItem2);
        cr = (TabItem) findViewById(R.id.tabItem3);
        ct = (TabItem) findViewById(R.id.tabItem4);
        pt = (TabItem) findViewById(R.id.tabItem5);
        sb = (TabItem) findViewById(R.id.tabItem6);
        viewPager = findViewById(R.id.viewpager);
        Toolbar toolbar = findViewById(R.id.toolbar3);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        pagerAdapter = new PageAdapter(getSupportFragmentManager(),tablayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);


        bundle = getIntent().getExtras();
        classID = bundle.getString("classID");
        getSupportActionBar().setTitle(classID);

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pagerAdapter.notifyDataSetChanged();
                }else if (tab.getPosition() == 1) {
                    pagerAdapter.notifyDataSetChanged();
                }else if (tab.getPosition() == 2) {
                    pagerAdapter.notifyDataSetChanged();
                }else if (tab.getPosition() == 3) {
                    pagerAdapter.notifyDataSetChanged();
                }else if (tab.getPosition() == 4) {
                    pagerAdapter.notifyDataSetChanged();
                }else if (tab.getPosition() == 5){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));




    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}

