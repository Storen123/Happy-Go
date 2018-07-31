package com.example.storen123.a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lieutenant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_lieutenant);

        Button button = (Button)findViewById (R.id.button2);
        button.setOnClickListener (new View.OnClickListener () {

            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent ();
                intent1.setClass (Lieutenant.this,Zonli3.class);
                startActivity (intent1);

            }
        });
    }
}
