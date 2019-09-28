package com.krasavkana.android.sdkverchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

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
}
