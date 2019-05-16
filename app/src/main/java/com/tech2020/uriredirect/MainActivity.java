package com.tech2020.uriredirect;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="flow";
    TextView argsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        argsView= findViewById(R.id.id_args);

        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();

        if(data!=null) {
            Log.i(TAG, "onCreate: intent data " + data.getPath() + "query: " + data.getQuery());
            argsView.setText(data.getPath() + "/" + data.getQuery());
        }
    }
}
