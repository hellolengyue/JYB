package com.hel.jyb.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * @author hel
 * @date 2019-08-15
 * 文件 JYB
 * 描述
 */
public class ThinkTitleAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public ThinkTitleAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, String item) {

    }
}
