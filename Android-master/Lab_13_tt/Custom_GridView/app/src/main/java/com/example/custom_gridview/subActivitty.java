package com.example.custom_gridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class subActivitty extends Activity {
    TextView txtname2;
    ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.childlayout);

        txtname2 = findViewById(R.id.textView2);
        img2 = findViewById(R.id.imageView2);

        Bundle extra = getIntent().getExtras();
        int position = extra.getInt("TITLE");

        txtname2.setText(MainActivity.arrayName[position]);
        img2.setImageResource(MainActivity.imageName[position]);
    }
}
