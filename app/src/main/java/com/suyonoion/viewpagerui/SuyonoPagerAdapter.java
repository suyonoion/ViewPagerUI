package com.suyonoion.viewpagerui;

/**
 * Created by Suyono on 4/15/2015.
 */
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SuyonoPagerAdapter extends PagerAdapter {
    private List<View> list;


    public SuyonoPagerAdapter(List<View> list) {

        this.list = list;
    }

    private String loadJam()
    {
        return new SimpleDateFormat(
                "HH:mm:s" ).format(
                new Date() );
    }


    @Override
    public CharSequence getPageTitle(int position) {
        String jam=loadJam();
        switch (position) {
            case 0:

                String semua1="JUDUL-1 | "+jam;

                return semua1;
            case 1:

                String semua2="JUDUL-2 | "+jam;
                return semua2;
            case 2:

                String semua3="HOME | "+jam;
                return semua3;
            case 3:

                String semua4="JUDUL-4 | "+jam;
                return semua4;
            case 4:

                String semua5="JUDUL-5 | "+jam;
                return semua5;
        }
        return null;
    }

    @Override
    public Object instantiateItem(View container, int position) {
        ((ViewPager) container).addView(list.get(position));
        return list.get(position);
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager) container).removeView(list.get(position));
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }


}

