package com.example.android.store;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyNDK myNDK = new MyNDK();

        Toast.makeText(this, myNDK.getMyString(), Toast.LENGTH_SHORT).show();
    }
}
