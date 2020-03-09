package com.example.myapplication_assignment_2;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends WearableActivity {


    String[] elements=  {"List", "Progress", "Extra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_layout);

        ListView lst= (ListView) findViewById(R.id.lst1);


        // Enables Always-on
        setAmbientEnabled();
    }
}
