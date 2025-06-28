package com.umar.testapp;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


class CloseoutNotificationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
//        if (action.equals(ACTION_BATCH_CLOSED_NOTIFICATION)) {
//            String orderId = intent.getStringExtra(Intents.EXTRA_CLOVER_ORDER_ID);
//        }
    }
}