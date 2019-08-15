package com.hel.jyb.fragments;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hel.jyb.R;
import com.hel.jyb.base.BaseFragment;

import butterknife.BindView;

/**
 * @author hel
 * @date 2019-08-15
 * 文件 JYB
 * 描述
 */
public class ThinkFragment extends BaseFragment {
    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_common;
    }

    @Override
    protected void initViews() {
        recyclerview.setLayoutManager(new GridLayoutManager(getActivity(), 3));
    }

    @Override
    protected void lazyFetchData() {

    }
}
