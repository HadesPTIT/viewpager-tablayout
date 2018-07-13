package com.framgia.viewpagerdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimplePagerAdapter extends FragmentPagerAdapter {

    private Context mCtx;
    private int mNumberFragments = 3;

    public SimplePagerAdapter(Context ctx,FragmentManager fm) {
        super(fm);
        mCtx = ctx;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return new FirstFragment();
        }
    }

    @Override
    public int getCount() {
        return mNumberFragments;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mCtx.getString(R.string.title_first_fragment);
            case 1:
                return mCtx.getString(R.string.title_second_fragment);
            case 2:
                return mCtx.getString(R.string.title_third_fragment);
            default:
                return null;
        }
    }
}
