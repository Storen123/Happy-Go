package com.example.storen123.a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_dac);
        Button button = (Button)findViewById (R.id.button10);
        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent ();
                intent1.setClass (Dac.this, dac3.class);
                startActivity (intent1);
            }
        });
    }

    public static class Bass {
    }
}
