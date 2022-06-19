package com.jeiu.mycoverletter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MainPage p1;
    CapstonePage p2;
    TabLayout tabs;
    ViewPager pager;
    MainViewPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = new MainPage();
        p2 = new CapstonePage();

        tabs = (TabLayout) findViewById(R.id.tabs);
        pager = (ViewPager) findViewById(R.id.viewpager);

        pager.setOffscreenPageLimit(3);
        pagerAdapter = new MainViewPagerAdapter(this.getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        pagerAdapter.additem(p1, "홈");
        pagerAdapter.additem(p2, "캡스톤 작품 소개");

        pager.setAdapter(pagerAdapter);

        tabs.setupWithViewPager(pager);
    }
}