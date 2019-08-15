package com.hel.jyb.activitys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.blankj.utilcode.util.FragmentUtils;
import com.hel.jyb.R;
import com.hel.jyb.base.BaseActivity;
import com.hel.jyb.fragments.CommonFragment;
import com.hel.jyb.widget.ResideLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.avatar)
    ImageView avatar;
    @BindView(R.id.desc)
    TextView desc;
    @BindView(R.id.top_menu)
    LinearLayout topMenu;
    @BindView(R.id.all)
    TextView all;
    @BindView(R.id.fuli)
    TextView fuli;
    @BindView(R.id.android)
    TextView android;
    @BindView(R.id.scrollView)
    ScrollView scrollView;
    @BindView(R.id.about)
    TextView about;
    @BindView(R.id.theme)
    TextView theme;
    @BindView(R.id.bottom_menu)
    LinearLayout bottomMenu;
    @BindView(R.id.menu)
    RelativeLayout menu;
    @BindView(R.id.container)
    FrameLayout container;
    @BindView(R.id.resideLayout)
    ResideLayout resideLayout;
    private List<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentList.add(CommonFragment.newInstance("0"));
        fragmentList.add(CommonFragment.newInstance("1"));
        fragmentList.add(CommonFragment.newInstance("2"));
        FragmentUtils.add(getSupportFragmentManager(), fragmentList, R.id.container, 0);
    }


    @OnClick({R.id.all, R.id.fuli, R.id.android})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.all:
                FragmentUtils.showHide(0,fragmentList);
                resideLayout.closePane();
                break;
            case R.id.fuli:
                FragmentUtils.showHide(1,fragmentList);
                resideLayout.closePane();
                break;
            case R.id.android:
                FragmentUtils.showHide(2,fragmentList);
                resideLayout.closePane();
                break;
        }
    }
    @Override
    public void onBackPressed() {
        if (resideLayout.isOpen()) {
            resideLayout.closePane();
        } else {
            super.onBackPressed();
        }
    }
}
