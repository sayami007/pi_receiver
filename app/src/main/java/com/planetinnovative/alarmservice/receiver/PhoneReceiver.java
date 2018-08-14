package com.planetinnovative.alarmservice.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PhoneReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        for (String key : intent.getExtras().keySet())
            System.out.println(key);
        System.out.println(intent.getExtras().get("incoming_number"));
        Toast.makeText(context, "Phone is ringing", Toast.LENGTH_SHORT).show();
    }
}
