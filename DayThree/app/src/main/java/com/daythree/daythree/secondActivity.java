package com.daythree.daythree;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class secondActivity extends ActionBarActivity {
    TextView tvResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResponse = (TextView) findViewById(R.id.tv_result);
        tvResponse.setText(getIntent().getStringExtra("key"));
    }
}
