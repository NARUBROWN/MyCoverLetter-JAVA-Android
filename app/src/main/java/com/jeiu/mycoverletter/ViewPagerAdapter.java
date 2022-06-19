package com.jeiu.mycoverletter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> items = new ArrayList<Fragment>();
    ArrayList<String>  title = new ArrayList<String>();
    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void additem(Fragment i) {
        this.items.add(i);
        // title parameter 안 넘겨주면 tab으로 설정
        this.title.add("tab" + items.size());
    }
    // overloading parameter에 title추가
    public void additem(Fragment i, String title) {
        this.items.add(i);
        this.title.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return this.title.get(position);
    }
}
