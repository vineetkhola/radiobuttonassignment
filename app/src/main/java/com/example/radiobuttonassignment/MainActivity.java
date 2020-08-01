package com.example.radiobuttonassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button yl,gr,bl,vlt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yl=(Button)findViewById(R.id.ylw);
        gr=(Button)findViewById(R.id.grn);
        bl=(Button)findViewById(R.id.blk);
        vlt=(Button)findViewById(R.id.vlt);
      yl.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(MainActivity.this,"Yellow color selected",Toast.LENGTH_LONG).show();
          }
      });
        gr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Green color selected",Toast.LENGTH_LONG).show();
            }
        });
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Black color selected",Toast.LENGTH_LONG).show();
            }
        });
        vlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Violet color selected",Toast.LENGTH_LONG).show();
            }
        });

    }
}
