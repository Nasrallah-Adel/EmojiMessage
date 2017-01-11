package com.example.nasrallah.emojimessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                intent.putExtra("EXTRA_SESSION_ID", "1");
                startActivity(intent);}

        }); ImageView image2 = (ImageView) findViewById(R.id.imageView2);
        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                intent.putExtra("EXTRA_SESSION_ID", "2");
                startActivity(intent);
            }

        }); ImageView image3 = (ImageView) findViewById(R.id.imageView3);
        image3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                intent.putExtra("EXTRA_SESSION_ID", "3");
                startActivity(intent);}

        }); ImageView image4 = (ImageView) findViewById(R.id.imageView4);
        image4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                intent.putExtra("EXTRA_SESSION_ID", "4");
                startActivity(intent);}

        });
    }
}
