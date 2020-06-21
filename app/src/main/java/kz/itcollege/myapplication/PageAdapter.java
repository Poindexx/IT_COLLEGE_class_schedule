package kz.itcollege.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {



    int numoftabs;



    public PageAdapter(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:

                return new tabItem();
            case 1:
                return new tabItem2();
            case 2:
                return new tabItem3();
            case 3:
                return new tabItem4();
            case 4:
                return new tabItem5();
            case 5:
                return new tabItem6();
            default:
                return null;
        }


    }





    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
