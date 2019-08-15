package com.hel.jyb.fragments;


import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

import com.blankj.utilcode.util.SpanUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.hel.jyb.R;
import com.hel.jyb.base.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class CommonFragment extends BaseFragment {

    public static final String ARG_TYPE = "type";

    private String type;

    public static CommonFragment newInstance(String type) {

        Bundle args = new Bundle();

        CommonFragment fragment = new CommonFragment();
        args.putString(ARG_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_test;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void lazyFetchData() {

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null)
            type = getArguments().getString(ARG_TYPE);
        TextView textView = view.findViewById(R.id.text);
//        textView.setText(type);
        SpanUtils.with(textView)
                .appendLine("SpanUtils").setBackgroundColor(Color.LTGRAY).setBold().setForegroundColor(Color.YELLOW).setHorizontalAlign(Layout.Alignment.ALIGN_CENTER)
                .appendLine("前景色").setForegroundColor(Color.GREEN)
                .appendLine("背景色").setBackgroundColor(Color.LTGRAY)
//                .appendLine("行高居中对齐").setLineHeight(2 * lineHeight, SpanUtils.ALIGN_CENTER).setBackgroundColor(Color.LTGRAY)
//                .appendLine("行高底部对齐").setLineHeight(2 * lineHeight, SpanUtils.ALIGN_BOTTOM).setBackgroundColor(Color.GREEN)
//                .appendLine("测试段落缩，首行缩进两字，其他行不缩进").setLeadingMargin(textSize.toInt() * 2, 10).setBackgroundColor(Color.GREEN)
                .appendLine("测试引用，后面的字是为了凑到两行的效果").setQuoteColor(Color.GREEN, 10, 10).setBackgroundColor(Color.LTGRAY)
                .appendLine("测试列表项，后面的字是为了凑到两行的效果").setBullet(Color.GREEN, 20, 10).setBackgroundColor(Color.LTGRAY).setBackgroundColor(Color.GREEN)
                .appendLine("32dp 字体").setFontSize(32, true)
                .appendLine("2 倍字体").setFontProportion(2f)
                .appendLine("横向 2 倍字体").setFontXProportion(1.5f)
                .appendLine("删除线").setStrikethrough()
                .appendLine("下划线").setUnderline()
                .append("测试").appendLine("上标").setSuperscript()
                .append("测试").appendLine("下标").setSubscript()
                .appendLine("粗体").setBold()
                .appendLine("斜体").setItalic()
                .appendLine("粗斜体").setBoldItalic()
                .appendLine("monospace 字体").setFontFamily("monospace")
//                .appendLine("自定义字体").setTypeface(Typeface.createFromAsset(assets, "fonts/dnmbhs.ttf"))
                .appendLine("相反对齐").setHorizontalAlign(Layout.Alignment.ALIGN_OPPOSITE)
                .appendLine("居中对齐").setHorizontalAlign(Layout.Alignment.ALIGN_CENTER)
                .appendLine("正常对齐").setHorizontalAlign(Layout.Alignment.ALIGN_NORMAL)
                .append("测试").appendLine("点击事件").setClickSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                ToastUtils.showShort("点击事件");
            }
        })
                .append("测试").appendLine("Url").setUrl("https://github.com/Blankj/AndroidUtilCode")
                .append("测试").appendLine("模糊").setBlur(3f, BlurMaskFilter.Blur.NORMAL)
//                .appendLine("颜色渐变").setShader(LinearGradient(0f, 0f, 64f * density * 4f, 0f, resources.getIntArray(R.array.rainbow), null, Shader.TileMode.REPEAT)).setFontSize(64, true)
//                .appendLine("图片着色").setFontSize(64, true).setShader(BitmapShader(BitmapFactory.decodeResource(resources, R.drawable.span_cheetah), Shader.TileMode.REPEAT, Shader.TileMode.REPEAT))
                .appendLine("阴影效果").setFontSize(64, true).setBackgroundColor(Color.BLACK).setShadow(24f, 8f, 8f, Color.WHITE)

                .appendLine("小图").setBackgroundColor(Color.GREEN)
                .appendImage(R.drawable.span_shape_block_low, SpanUtils.ALIGN_TOP)
                .append("顶部").setBackgroundColor(Color.GREEN)
                .appendImage(R.drawable.span_shape_block_low, SpanUtils.ALIGN_CENTER)
                .append("居中").setBackgroundColor(Color.GREEN)
                .appendImage(R.drawable.span_shape_block_low, SpanUtils.ALIGN_BASELINE)
                .append("底部").setBackgroundColor(Color.GREEN)
                .appendImage(R.drawable.span_shape_block_low, SpanUtils.ALIGN_BOTTOM)
                .appendLine("对齐").setBackgroundColor(Color.GREEN)
                .appendImage(R.drawable.span_shape_block_high, SpanUtils.ALIGN_TOP)
                .append("大图").setBackgroundColor(Color.LTGRAY)
                .appendImage(R.drawable.span_shape_block_high, SpanUtils.ALIGN_TOP)
                .append("顶部").setBackgroundColor(Color.LTGRAY)
                .appendImage(R.drawable.span_shape_block_high, SpanUtils.ALIGN_TOP)
                .appendLine("对齐").setBackgroundColor(Color.LTGRAY)

                .appendImage(R.drawable.span_shape_block_high, SpanUtils.ALIGN_CENTER)
                .append("大图").setBackgroundColor(Color.GREEN)
                .appendImage(R.drawable.span_shape_block_high, SpanUtils.ALIGN_CENTER)
                .append("居中").setBackgroundColor(Color.GREEN)
                .appendImage(R.drawable.span_shape_block_high, SpanUtils.ALIGN_CENTER)
                .appendLine("对齐").setBackgroundColor(Color.GREEN)

                .appendImage(R.drawable.span_shape_block_high, SpanUtils.ALIGN_BOTTOM)
                .append("大图").setBackgroundColor(Color.LTGRAY)
                .appendImage(R.drawable.span_shape_block_high, SpanUtils.ALIGN_BOTTOM)
                .append("底部").setBackgroundColor(Color.LTGRAY)
                .appendImage(R.drawable.span_shape_block_high, SpanUtils.ALIGN_BOTTOM)
                .appendLine("对齐").setBackgroundColor(Color.LTGRAY)

                .append("测试空格").appendSpace(30, Color.LTGRAY).appendSpace(50, Color.GREEN).appendSpace(100).appendSpace(30, Color.LTGRAY).appendSpace(50, Color.GREEN)
                .create();

    }
    //    @Override
//    public void fillValue(ViewHolder holder, JHJokeBean resultBean, int position) {
//        TextView text = holder.getView(R.id.text);
//        text.setText(Html.fromHtml("<a href=\""
//                +   "\">"
//                + resultBean.getContent() + "</a>"
//                + "[" + resultBean.getUnixtime() + "]"));
//        text.setMovementMethod(LinkMovementMethod.getInstance());
//    }
//
//    @Override
//    protected String getUrl() {
//        return "http://gank.io/api/data/" + type + "/"
//                + String.valueOf(pageSize) + "/"
//                + String.valueOf(page);
////        return "http://v.juhe.cn/joke/randJoke.php?key=a09ea6e958120265d3c2e90f82d5d469";
//    }


}