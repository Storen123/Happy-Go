package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class lusu2 extends AppCompatActivity {
    ListView movie_list=null;
    private ArrayList<Movie> movies;
    private MovieAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_bade3);
        movie_list=findViewById (R.id.movie_list);
        movies = new ArrayList<Movie> ();
        movies.add (new Movie (R.mipmap.lusu1,"麗嬰房采衣館","電話：03-3544417","地址：桃園市蘆竹區海山中街8號","麗嬰房集團創立於1971年，本著「\n孩子是我們一輩子的事業」的經營\n理念，不斷開創婦幼食衣育樂的各\n項需求產業，並持續拓展多角化的\n婦幼通路經營。「采衣館」以小象\n為吉祥物，做為主題造景，搭配導\n覽解說和商品販售，另有提供小象\n布偶DIY體驗，帶給孩童和家長\n滿滿的歡樂。"));

        movies.add (new Movie (R.mipmap.lusu2,"大古山步道","電話：03-3322101","地址：桃園市蘆竹區泉州路","此區因無高山阻擋，即使海拔不高\n，仍可遠眺機場、高鐵、竹圍漁港\n等，甚至最遠可見到淡水八里及觀\n音山，是相當受歡迎的賞夜景地點\n之一。 "));

        movies.add (new Movie (R.mipmap.lusu3,"卡司‧蒂菈樂園(金格食品)","電話：03-2551999","地址：桃園市蘆竹區大竹北路90之66號","以長崎蛋糕起家的金格長崎蛋糕觀\n光工廠，擁有個夢幻的名字─「卡\n司．蒂菈樂園」，在樂園裡，遊客\n除了可以看到最完整的長崎蛋糕製\n作過程，了解金格對食品的堅持外\n，還可以動手體驗好吃又好玩的D\nIY課程，或是享受悠閒午茶的時\n光。"));



        adapter = new MovieAdapter  (this,movies);
        movie_list.setAdapter (adapter);

    }
}
