package com.example.myapplication;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author:wangshouxue
 * @date:2019-10-12 09:44
 * @description:类作用
 */
public class MyPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments;
    private String[] mTitles;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setData(List<Fragment> mFragments){
        this.mFragments=mFragments;
    }

    public void setmTitles(String[] mTitles) {
        this.mTitles = mTitles;
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

}
