package com.example.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.tablayoutlib.CommonTabLayout;
import com.example.tablayoutlib.CustomTabEntity;
import com.example.tablayoutlib.OnTabSelectListener;

import java.util.ArrayList;

/**
 * @author:wangshouxue
 * @date:2019-10-12 17:16
 * @description:类作用
 */
public class CommonTabActivity extends AppCompatActivity {
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private String[] mTitles = {"首页", "购物", "群组"};
    private int[] mIconUnselectIds = {
            R.drawable.ic_home_unst, R.drawable.ic_good_unst,
            R.drawable.ic_group_unst};
    private int[] mIconSelectIds = {
            R.drawable.ic_home_st, R.drawable.ic_good_st,
            R.drawable.ic_group_st};
    private ArrayList<Fragment> mFragments = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commontab);
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
            mFragments.add(SimpleFragment.getInstance("ViewPager " + mTitles[i]));

        }
        initTab1();
        initTab2();
        initTab3();
        initTab4();
        initTab5();
        initTab6();
        initTab7();
        initTab8();
    }

    private void initTab8() {
        CommonTabLayout mTabLayout_8 = findViewById(R.id.tl_8);
        ArrayList<CustomTabEntity> tabEntities = new ArrayList<>();
        for (int i = 0; i < mTitles.length; i++) {
            if (i==1){
                tabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i],R.mipmap.edit));
            }else {
                tabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i],0));
            }
        }
        mTabLayout_8.setTabData(tabEntities);
        mTabLayout_8.setUnderlineGravity(Gravity.TOP);
        mTabLayout_8.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {

            }

            @Override
            public void onTabReselect(int position) {

            }

            @Override
            public void onTabPublish(int position) {
                Toast.makeText(CommonTabActivity.this,"点击了发布",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDoubleClick(int position) {
                Toast.makeText(CommonTabActivity.this,"快速双击",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initTab1() {
        final CommonTabLayout mTabLayout_1=findViewById(R.id.tl_1);
        final ViewPager mViewPager=findViewById(R.id.vp_1);
        MyPagerAdapter pagerAdapter=new MyPagerAdapter(getSupportFragmentManager());
        pagerAdapter.setData(mFragments);
        mViewPager.setAdapter(pagerAdapter);

        mTabLayout_1.setTabData(mTabEntities);
        mTabLayout_1.setUnderlineHeight(0.5f);
        mTabLayout_1.setFollowTvWidth(true);
        mTabLayout_1.setIconVisible(false);//图片不可见
        mTabLayout_1.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                mViewPager.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {

            }

            @Override
            public void onTabPublish(int position) {
                Toast.makeText(CommonTabActivity.this,"点击了发布",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDoubleClick(int position) {
                Toast.makeText(CommonTabActivity.this,"快速双击",Toast.LENGTH_SHORT).show();
            }
        });
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mTabLayout_1.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    private void initTab2() {
        CommonTabLayout mTabLayout_2 = findViewById(R.id.tl_2);
        ArrayList<CustomTabEntity> tabEntities = new ArrayList<>();
        for (int i = 0; i < mTitles.length; i++) {
            tabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i],0));
        }
        tabEntities.add(new TabEntity(mTitles[0], mIconSelectIds[0], mIconUnselectIds[0],R.drawable.ic_add_circle_black_24dp));
        mTabLayout_2.setTabData(tabEntities);
        mTabLayout_2.showDot(3);
        mTabLayout_2.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {

            }

            @Override
            public void onTabReselect(int position) {

            }

            @Override
            public void onTabPublish(int position) {
                Toast.makeText(CommonTabActivity.this,"点击了发布",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDoubleClick(int position) {
                Toast.makeText(CommonTabActivity.this,"快速双击",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initTab3() {
        CommonTabLayout mTabLayout_3 = findViewById(R.id.tl_3);
        mTabLayout_3.setTabData(mTabEntities);
        mTabLayout_3.setIndicatorStyle(1);
        mTabLayout_3.setIndicatorWidth(14);
        mTabLayout_3.setIndicatorHeight(8);
        mTabLayout_3.showMsg(1,8);
    }
    private void initTab4() {
        CommonTabLayout mTabLayout_4 = findViewById(R.id.tl_4);
        mTabLayout_4.setTabData(mTabEntities);
    }
    private void initTab5() {
        CommonTabLayout mTabLayout_5 = findViewById(R.id.tl_5);
        mTabLayout_5.setTabData(mTabEntities);

    }
    private void initTab6() {
        ArrayList<CustomTabEntity> mTabEntities6 = new ArrayList<>();
        mTabEntities6.add(new TabEntity(mTitles[0], mIconSelectIds[0], mIconUnselectIds[0]));
        mTabEntities6.add(new TabEntity("精选", mIconSelectIds[1], mIconUnselectIds[1]));

        CommonTabLayout mTabLayout_6 = findViewById(R.id.tl_6);
        mTabLayout_6.setTabData(mTabEntities6);
        mTabLayout_6.setIconWidth(20);
        mTabLayout_6.setIconVisible(false);//图片不可见
        mTabLayout_6.showDot(1,2,10);
    }
    private void initTab7() {
        CommonTabLayout mTabLayout_7 = findViewById(R.id.tl_7);
        mTabLayout_7.setTabData(mTabEntities);
        mTabLayout_7.setIndicatorWidth(18);
        mTabLayout_7.setIconVisible(false);//图片不可见
    }

}
