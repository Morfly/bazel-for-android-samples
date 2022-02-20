package io.morfly.bfa;

import android.content.Context;


public class MyFeatureWithRes {

    public String getInfo(Context context) {
        return context.getString(R.string.my_android_feature_info);
    }
}