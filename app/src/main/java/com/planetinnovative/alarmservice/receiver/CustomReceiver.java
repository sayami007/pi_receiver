package com.planetinnovative.alarmservice.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Custom Receiver Message", Toast.LENGTH_SHORT).show();
    }
}
