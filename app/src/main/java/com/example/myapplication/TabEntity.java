package com.example.myapplication;

import com.example.tablayoutlib.CustomTabEntity;

/**
 * @author:wangshouxue
 * @date:2019-10-11 17:49
 * @description:类作用
 */
public class TabEntity implements CustomTabEntity {
    private String title;
    private int selectIcon,unSelectIcon,coverIcon=-1;

    public TabEntity(String title){
        this.title=title;
    }
    public TabEntity(String title,int selectIcon,int unSelectIcon){
        this.title=title;
        this.selectIcon=selectIcon;
        this.unSelectIcon=unSelectIcon;
    }
    public TabEntity(String title,int selectIcon,int unSelectIcon,int coverIcon){
        this.title=title;
        this.selectIcon=selectIcon;
        this.unSelectIcon=unSelectIcon;
        this.coverIcon=coverIcon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSelectIcon(int selectIcon) {
        this.selectIcon = selectIcon;
    }

    public void setUnSelectIcon(int unSelectIcon) {
        this.unSelectIcon = unSelectIcon;
    }

    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return selectIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unSelectIcon;
    }

    @Override
    public int getCoverIcon() {
        return coverIcon;
    }
}
