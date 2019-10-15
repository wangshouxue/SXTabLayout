package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.example.tablayoutlib.CustomTabEntity;
import com.example.tablayoutlib.SlidingTabLayout;

import java.util.ArrayList;

/**
 * @author:wangshouxue
 * @date:2019-10-14 09:17
 * @description:类作用
 */
public class SlidingTabActivity extends AppCompatActivity {
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private String[] mTitles = {"首页","热点","娱乐","新闻","读书","健康","电影","运动","军事"};
    private ArrayList<Fragment> mFragments = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slidingtab);
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i]));
            mFragments.add(SimpleFragment.getInstance("ViewPager " + mTitles[i]));

        }
        SlidingTabLayout mTabLayout_1=findViewById(R.id.sliding_tl_1);
        ViewPager mViewPager=findViewById(R.id.vp);
        MyPagerAdapter pagerAdapter=new MyPagerAdapter(getSupportFragmentManager());
        pagerAdapter.setData(mFragments);
        pagerAdapter.setmTitles(mTitles);
        mViewPager.setAdapter(pagerAdapter);
        mTabLayout_1.setViewPager(mViewPager);

        SlidingTabLayout mTabLayout_2=findViewById(R.id.sliding_tl_2);
        mTabLayout_2.setViewPager(mViewPager);
        mTabLayout_2.showDot(2);
        mTabLayout_2.setMsgMargin(2,0,0);

        SlidingTabLayout mTabLayout_3=findViewById(R.id.sliding_tl_3);
        mTabLayout_3.setViewPager(mViewPager);
        mTabLayout_3.showMsg(1,2);

    }

}
