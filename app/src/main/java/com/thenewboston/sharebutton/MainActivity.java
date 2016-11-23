package com.thenewboston.sharebutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your Body here!";
                String shareSub = "Your Subject here!";
                myIntent.putExtra(Intent.EXTRA_SUBJECT , shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT , shareBody);
                startActivity(Intent.createChooser(myIntent , "SHARE USING"));
            }
        });
    }
}
