package com.smecking.qqslidedrawer;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Smecking on 2016/12/23.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {
    private String[] titles = new String[]{"消息", "联系人", "动态"};
    private Context context;
    private int[] items;

    public MyFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    public MyFragmentAdapter(FragmentManager fm, int[] items, Context context) {
        super(fm);
        this.items = items;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return BaseFragment.newInstance(titles[position]);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    // TabLayout关联viewpager时会调用此方法.
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
