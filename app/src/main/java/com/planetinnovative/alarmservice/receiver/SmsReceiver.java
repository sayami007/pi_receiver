package com.planetinnovative.alarmservice.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.planetinnovative.alarmservice.activity.SmsActivity;

import java.util.Set;

public class SmsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent mainIntent = new Intent(context, SmsActivity.class);
        context.startActivity(mainIntent);
        Toast.makeText(context, "SMS Receiver", Toast.LENGTH_SHORT).show();
    }
}
