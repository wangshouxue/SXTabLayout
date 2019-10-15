package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * @author:wangshouxue
 * @date:2019-10-12 09:46
 * @description:类作用
 */
public class SimpleFragment extends Fragment {
    private String mTitle;

    public static SimpleFragment getInstance(String title) {
        SimpleFragment sf = new SimpleFragment();
        sf.mTitle = title;
        return sf;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_simple, null);
        TextView card_title_tv = (TextView) v.findViewById(R.id.fg_tv);
        card_title_tv.setText(mTitle);

        return v;
    }
}
