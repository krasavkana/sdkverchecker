package com.krasavkana.android.sdkverchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StringBuilder sb = new StringBuilder();
        sb.append("BASE OS: " + Build.VERSION.BASE_OS);
        sb.append("\nSDK_INT: " + Build.VERSION.SDK_INT);
        sb.append("\nCODENAME: " + Build.VERSION.CODENAME);
        sb.append("\nINCREMENTAL: " + Build.VERSION.INCREMENTAL);
        sb.append("\nRELEASE: " + Build.VERSION.RELEASE);
//        sb.append("\nSECURITY_PATCH: " + Build.VERSION.SECURITY_PATCH);
        sb.append("\nPREVIEW_SDK_INT: " + Build.VERSION.PREVIEW_SDK_INT);
        ((TextView) findViewById(R.id.text)).setText(sb);
//        Toast toast = Toast.makeText(this, "SDK Version: " + Build.VERSION.SDK_INT, Toast.LENGTH_LONG);
//        toast.getView().setBackgroundColor(Color.GREEN);
//        toast.show();
    }


    @Override
    protected void onPause() {
        super.onPause();
//        ActivityManager activityManager = (ActivityManager) getApplicationContext()
//                .getSystemService(Context.ACTIVITY_SERVICE);
//        activityManager.moveTaskToFront(getTaskId(), 0);
    }

    /**
     //https://stackoverflow.com/questions/9162705/android-how-to-listen-for-volume-button-events
     // The last line should be "return super.onKeyDown(keyCode, event);" instead of "return true". – Alex Vang May 9 '14 at 15:31
     *
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        Log.v("KeyDown", "KeyCode=" + keyCode);
        return true;// Volume操作できない！
        //return false;// Volume操作できる
        //return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        Log.v("KeyUp", "KeyCode=" + keyCode);
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        // TODO Auto-generated method stub
        String action = "";

        switch (event.getAction()) {
            case KeyEvent.ACTION_DOWN:
                action = "Key Down";
                break;
            case KeyEvent.ACTION_UP:
                action = "Key Up";
                break;
            case KeyEvent.ACTION_MULTIPLE:
                action = "Key Multiple";
                break;
        }
        Log.v("KeyEvent", action + ": KeyCode=" + event.getKeyCode());
        return super.dispatchKeyEvent(event);

    }
}
