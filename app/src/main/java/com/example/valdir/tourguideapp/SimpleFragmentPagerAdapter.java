package com.example.valdir.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by VALDIR on 23/12/2017.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Alimentação", "Hotéis", "Lazer", "Uteis"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1) {
            return new HotelFragment();
        } else if (position == 2) {
            return new RecreationFragment();
        } else {
            return new UserfulTelephonesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Gerar título com base na posição do item
        return tabTitles[position];
    }
}
