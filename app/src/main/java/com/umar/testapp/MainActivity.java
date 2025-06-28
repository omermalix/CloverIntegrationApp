package com.umar.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyExternalApp";
    // Define the custom action string, must match what's in register_metadata.xml
    private static final String ACTION_LAUNCH_FROM_REGISTER = "com.umar.cloverapp.action.LAUNCH_FROM_REGISTER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity); // Your app's main layout

        Intent intent = getIntent();
        if (intent != null && ACTION_LAUNCH_FROM_REGISTER.equals(intent.getAction())) {
            // Your app was launched from the Clover Register app's button!
            Log.d(TAG, "Launched from Clover Register button!");
            Toast.makeText(this, "Hello from Clover Register!", Toast.LENGTH_LONG).show();

            // You can now implement your app's specific logic here.
            // For example, if Clover passed any extras, you can retrieve them:
            // String someData = intent.getStringExtra("some_key");
        } else if (intent != null && Intent.ACTION_MAIN.equals(intent.getAction()) && intent.hasCategory(Intent.CATEGORY_LAUNCHER)) {
            // Your app was launched normally from the device's home screen/launcher
            Log.d(TAG, "Launched normally from launcher.");
            Toast.makeText(this, "Launched from launcher.", Toast.LENGTH_SHORT).show();
        } else {
            // Launched by some other unexpected intent
            Log.d(TAG, "Launched by unexpected intent: " + intent.getAction());
            Toast.makeText(this, "Unexpected launch!", Toast.LENGTH_SHORT).show();
        }

//        Intent intentRegister = new Intent(Intents.ACTION_START_REGISTER);
//        intentRegister.putExtra(Intents.EXTRA_ORDER_ID, "MYZ1A7J7HA15J");
//        startActivity(intentRegister);
        // Add the rest of your MainActivity's setup here
        // ...
    }
}