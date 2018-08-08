package com.example.bomi.miinsu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;


public class smileDiary extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_WRITE_EXT_STORAGE = 123;
    private static final int MY_PERMISSIONS_REQUEST_READ_EXT_STORAGE = 122;
    private static final String TAG ="emotion:";
    private GridView gridView;
    smileAdapter smileAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smile_diary);

        GridView gv = (GridView)findViewById(R.id.gridView);
        smileAdapter=new smileAdapter(getApplicationContext());
        gv.setAdapter(smileAdapter);

    }
}

