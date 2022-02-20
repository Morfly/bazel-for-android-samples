package io.morfly.bfa;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAndroidFeature myAndroidFeature = new MyAndroidFeature();
        MyAndroidFeatureWithRes myAndroidFeatureWithRes = new MyAndroidFeatureWithRes();
        MyJvmFeature myJvmFeature = new MyJvmFeature();

        TextView textView = findViewById(R.id.textView);

        String appInfo = textView.getText()
                + "\n\nEnabled features:\n"
                + myAndroidFeature.getInfo()
                + "\n"
                + myAndroidFeatureWithRes.getInfo(this)
                + "\n"
                + myJvmFeature.getInfo();

        textView.setText(appInfo);
    }
}