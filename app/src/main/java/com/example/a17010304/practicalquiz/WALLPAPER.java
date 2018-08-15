package com.example.a17010304.practicalquiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.RadioGroup;
import android.widget.Toast;

public class WALLPAPER extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast my_toast = Toast.makeText(context, "You have changed the wallpaper", Toast.LENGTH_LONG);
        my_toast.show();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        int buttonId = prefs.getInt("id", R.id.radioButtonTaste);
        if (buttonId == R.id.radioButtonTaste){
            Toast.makeText(context,R.string.taste, Toast.LENGTH_LONG ).show();
        }else{
            Toast.makeText(context,R.string.think, Toast.LENGTH_LONG ).show();

        }
    }
}
