package com.example.admin.receivebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Admin on 8/15/2017.
 */

public class MyBroadcastReceiver extends BroadcastReceiver{

    TextView tv;

    MyBroadcastReceiver(TextView tv){
        this.tv = tv;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Got Data", Toast.LENGTH_SHORT).show();
        tv.setText(intent.getStringExtra("data"));

    }
}
