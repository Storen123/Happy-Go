package com.example.storen123.a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        setTitle("桃園快樂遊");
        ListView listview = (ListView) findViewById (R.id.listview);


        String[] str = {"桃園區", "八德區", "中壢區", "大溪區", "龍潭區", "平鎮區", "龜山區", "蘆竹區", "大園區", "觀音區"
                , "新屋區", "楊梅區", "復興區"};
        ArrayAdapter adapter = new ArrayAdapter (this, android.R.layout.simple_expandable_list_item_1, str);
        listview.setAdapter (adapter);

        Button button = (Button) findViewById (R.id.button15);
        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ();
                intent.setClass (MainActivity.this,Yaya.class);
                startActivity (intent);


                        Button button = (Button) findViewById (R.id.button16);
                button.setOnClickListener (new View.OnClickListener () {
                                               @Override
                                               public void onClick(View view) {

                                                   Intent intent = new Intent ();
                                                   intent.setClass (MainActivity.this,Bade.class);
                                                   startActivity (intent);


                                                   Button button = (Button) findViewById (R.id.button17);
                                                   button.setOnClickListener (new View.OnClickListener () {
                                                                                  @Override
                                                                                  public void onClick(View view) {

                                                                                      Intent intent = new Intent ();
                                                                                      intent.setClass (MainActivity.this,Lieutenant.class);
                                                                                      startActivity (intent);

                                                                                      Button button = (Button) findViewById (R.id.button18);
                                                                                      button.setOnClickListener (new View.OnClickListener () {
                                                                                                                     @Override
                                                                                                                     public void onClick(View view) {

                                                                                                                         Intent intent = new Intent ();
                                                                                                                         intent.setClass (MainActivity.this,Dac.class);
                                                                                                                         startActivity (intent);

                                                                                                                         Button button = (Button) findViewById (R.id.button19);
                                                                                                                         button.setOnClickListener (new View.OnClickListener () {
                                                                                                                                                        @Override
                                                                                                                                                        public void onClick(View view) {

                                                                                                                                                            Intent intent = new Intent ();
                                                                                                                                                            intent.setClass (MainActivity.this,Lonton.class);
                                                                                                                                                            startActivity (intent);

                                                                                                                                                            Button button = (Button) findViewById (R.id.button20);
                                                                                                                                                            button.setOnClickListener (new View.OnClickListener () {
                                                                                                                                                                                           @Override
                                                                                                                                                                                           public void onClick(View view) {

                                                                                                                                                                                               Intent intent = new Intent ();
                                                                                                                                                                                               intent.setClass (MainActivity.this,Pin.class);
                                                                                                                                                                                               startActivity (intent);

                                                                                                                                                                                               Button button = (Button) findViewById (R.id.button21);
                                                                                                                                                                                               button.setOnClickListener (new View.OnClickListener () {
                                                                                                                                                                                                                              @Override
                                                                                                                                                                                                                              public void onClick(View view) {

                                                                                                                                                                                                                                  Intent intent = new Intent ();
                                                                                                                                                                                                                                  intent.setClass (MainActivity.this,Kuku.class);
                                                                                                                                                                                                                                  startActivity (intent);

                                                                                                                                                                                                                                  Button button = (Button) findViewById (R.id.button22);
                                                                                                                                                                                                                                  button.setOnClickListener (new View.OnClickListener () {
                                                                                                                                                                                                                                                                 @Override
                                                                                                                                                                                                                                                                 public void onClick(View view) {

                                                                                                                                                                                                                                                                     Intent intent = new Intent ();
                                                                                                                                                                                                                                                                     intent.setClass (MainActivity.this,Lusu.class);
                                                                                                                                                                                                                                                                     startActivity (intent);

                                                                                                                                                                                                                                                                     Button button = (Button) findViewById (R.id.button23);
                                                                                                                                                                                                                                                                     button.setOnClickListener (new View.OnClickListener () {
                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                    public void onClick(View view) {

                                                                                                                                                                                                                                                                                                        Intent intent = new Intent ();
                                                                                                                                                                                                                                                                                                        intent.setClass (MainActivity.this,Dayuan.class);
                                                                                                                                                                                                                                                                                                        startActivity (intent);

                                                                                                                                                                                                                                                                                                        Button button = (Button) findViewById (R.id.button24);
                                                                                                                                                                                                                                                                                                        button.setOnClickListener (new View.OnClickListener () {
                                                                                                                                                                                                                                                                                                                                       @Override
                                                                                                                                                                                                                                                                                                                                       public void onClick(View view) {

                                                                                                                                                                                                                                                                                                                                           Intent intent = new Intent ();
                                                                                                                                                                                                                                                                                                                                           intent.setClass (MainActivity.this,Kunin.class);
                                                                                                                                                                                                                                                                                                                                           startActivity (intent);

                                                                                                                                                                                                                                                                                                                                           Button button = (Button) findViewById (R.id.button25);
                                                                                                                                                                                                                                                                                                                                           button.setOnClickListener (new View.OnClickListener () {
                                                                                                                                                                                                                                                                                                                                                                          @Override
                                                                                                                                                                                                                                                                                                                                                                          public void onClick(View view) {

                                                                                                                                                                                                                                                                                                                                                                              Intent intent = new Intent ();
                                                                                                                                                                                                                                                                                                                                                                              intent.setClass (MainActivity.this,Xinwu.class);
                                                                                                                                                                                                                                                                                                                                                                              startActivity (intent);

                                                                                                                                                                                                                                                                                                                                                                              Button button = (Button) findViewById (R.id.button26);
                                                                                                                                                                                                                                                                                                                                                                              button.setOnClickListener (new View.OnClickListener () {
                                                                                                                                                                                                                                                                                                                                                                                                             @Override
                                                                                                                                                                                                                                                                                                                                                                                                             public void onClick(View view) {

                                                                                                                                                                                                                                                                                                                                                                                                                 Intent intent = new Intent ();
                                                                                                                                                                                                                                                                                                                                                                                                                 intent.setClass (MainActivity.this,Younmai.class);
                                                                                                                                                                                                                                                                                                                                                                                                                 startActivity (intent);

                                                                                                                                                                                                                                                                                                                                                                                                                 Button button = (Button) findViewById (R.id.button27);
                                                                                                                                                                                                                                                                                                                                                                                                                 button.setOnClickListener (new View.OnClickListener () {
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override
                                                                                                                                                                                                                                                                                                                                                                                                                                                public void onClick(View view) {

                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Intent intent = new Intent ();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    intent.setClass (MainActivity.this,Fuxin.class);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    startActivity (intent);




                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                                                                                                                                                                                 );


                                                                                                                                                                                                                                                                                                                                                                                                             }
                                                                                                                                                                                                                                                                                                                                                                                                         }


                                                                                                                                                                                                                                                                                                                                                                              );


                                                                                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                                                                                      }


                                                                                                                                                                                                                                                                                                                                           );


                                                                                                                                                                                                                                                                                                                                       }
                                                                                                                                                                                                                                                                                                                                   }


                                                                                                                                                                                                                                                                                                        );


                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }


                                                                                                                                                                                                                                                                     );


                                                                                                                                                                                                                                                                 }
                                                                                                                                                                                                                                                             }


                                                                                                                                                                                                                                  );


                                                                                                                                                                                                                              }
                                                                                                                                                                                                                          }


                                                                                                                                                                                               );


                                                                                                                                                                                           }
                                                                                                                                                                                       }


                                                                                                                                                            );


                                                                                                                                                        }
                                                                                                                                                    }


                                                                                                                         );


                                                                                                                     }
                                                                                                                 }


                                                                                      );


                                                                                  }
                                                                              }


                                                   );


                                               }
                                           }


                );
            }


            }

        );
    }






        public void onClick(View view) {
    }
}
