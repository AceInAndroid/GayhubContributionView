package com.example.zhangbing.gayhubcontributionview.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by zhangbing on 2017/2/6.
 */
public class UI {

    public static int dp2px(Context context, int i) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, i, context.getResources().getDisplayMetrics());
    }

    public static int dp2sp(Context context, int i) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, i, context.getResources().getDisplayMetrics());
    }

}