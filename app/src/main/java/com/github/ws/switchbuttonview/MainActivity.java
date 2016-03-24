package com.github.ws.switchbuttonview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.ws.switchbuttonview.widget.SwitchButtonView;

public class MainActivity extends AppCompatActivity {

    private SwitchButtonView mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwitch= (SwitchButtonView) findViewById(R.id.sbv);
        mSwitch.setOnSwitchListener(new SwitchButtonView.onSwitchListener() {
            @Override
            public void onSwitchChanged(boolean isCheck) {
            }
        });
    }
}
