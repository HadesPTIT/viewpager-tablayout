package com.framgia.viewpagerdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;
    private TabLayout mTabLayout;
    private SimplePagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = findViewById(R.id.viewPager);
        mTabLayout = findViewById(R.id.tabLayout);
        mAdapter = new SimplePagerAdapter(this, getSupportFragmentManager());

        mPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mPager);
        setupTabIcon();

    }

    private void setupTabIcon() {
        for (int i = 0; i < mTabLayout.getTabCount(); i++) {
            mTabLayout.getTabAt(i).setIcon(R.mipmap.ic_launcher);
        }
    }
}
