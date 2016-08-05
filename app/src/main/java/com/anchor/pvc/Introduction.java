package com.anchor.pvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Introduction extends AppCompatActivity {

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        textView1= (TextView) findViewById(R.id.tv1);
        textView1.setMovementMethod(new ScrollingMovementMethod());
    }
}
