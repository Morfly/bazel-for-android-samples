package io.morfly.bfa.myfeature;

import android.content.Context;

public class MyAndroidFeatureWithRes {

    public String getInfo(Context context) {
        return context.getString(R.string.my_android_feature_info);
    }
}