package io.morfly.bfa;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    // Instaitiate features.
    MyFeature myFeature = new MyFeature();
    MyFeatureWithRes myFeatureWithRes = new MyFeatureWithRes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        // Display info about included features.
        String appInfo = textView.getText()
                + "\n\nIncluded features:\n"
                + myFeature.getInfo()
                + "\n"
                + myFeatureWithRes.getInfo(this);

        textView.setText(appInfo);
    }
}