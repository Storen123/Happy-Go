package com.example.storen123.a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Yaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yaya);
      Button button =(Button)findViewById(R.id.button4);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent();
              intent.setClass(Yaya.this,yaya4.class);
              startActivity(intent);
          }
      });
    }


}





