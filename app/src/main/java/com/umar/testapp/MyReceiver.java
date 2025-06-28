package com.umar.testapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.clover.sdk.v1.Intents;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(Intents.ACTION_ORDER_CREATED)) {
            String orderId = intent.getStringExtra(Intents.EXTRA_CLOVER_ORDER_ID);
        }
    }
}