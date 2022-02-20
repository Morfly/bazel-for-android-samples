package io.morfly.bfa;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyFeature myFeature = new MyFeature();
        MyFeatureWithRes myFeatureWithRes = new MyFeatureWithRes();

        TextView textView = findViewById(R.id.textView);

        String appInfo = textView.getText()
                + "\n\nEnabled features:\n"
                + myFeature.getInfo()
                + "\n"
                + myFeatureWithRes.getInfo(this);

        textView.setText(appInfo);
    }
}