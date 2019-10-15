package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.tablayoutlib.OnTabSelectListener;
import com.example.tablayoutlib.SegmentTabLayout;

import java.util.ArrayList;

/**
 * @author:wangshouxue
 * @date:2019-10-14 15:29
 * @description:类作用
 */
public class SegmentTabActivity extends AppCompatActivity {
    private String[] mTitles_1 = {"首页", "消息"};
    private String[] mTitles_2 = {"首页", "消息", "社区"};
    private String[] mTitles_3 = {"首页", "消息", "社区", "更多"};
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private ArrayList<Fragment> mFragments_divider = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segmenttab);

        for (int i = 0; i < mTitles_1.length; i++) {
            mFragments.add(SimpleFragment.getInstance("ViewPager " + mTitles_1[i]));
        }
        initTab();
        initTab_dot();
        initTab_anim();
        initTab_divider();
    }

    private void initTab() {
        final SegmentTabLayout tabLayout=findViewById(R.id.segment_tl);
        tabLayout.setTabData(mTitles_1);
        final ViewPager vp1=findViewById(R.id.vp1);
        MyPagerAdapter pagerAdapter=new MyPagerAdapter(getSupportFragmentManager());
        pagerAdapter.setData(mFragments);
        vp1.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                vp1.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {
            }

            @Override
            public void onTabPublish(int position) {

            }

            @Override
            public void onDoubleClick(int position) {

            }
        });

        vp1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabLayout.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    private void initTab_dot(){
        SegmentTabLayout tabLayout_dot=findViewById(R.id.segment_tl_dot);
        tabLayout_dot.setTabData(mTitles_2);
        tabLayout_dot.showDot(1);
    }
    private void initTab_anim(){
        SegmentTabLayout tabLayout_anim=findViewById(R.id.segment_tl_anim);
        tabLayout_anim.setTabData(mTitles_2);
    }
    private void initTab_divider() {
        for (int i = 0; i < mTitles_3.length; i++) {
            mFragments_divider.add(SimpleFragment.getInstance("ViewPager " + mTitles_3[i]));
        }
        SegmentTabLayout tabLayout_divider=findViewById(R.id.segment_tl_divider);
        tabLayout_divider.setTabData(mTitles_3, this, R.id.fg, mFragments_divider);
    }

}
