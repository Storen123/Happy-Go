package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Bade3 extends AppCompatActivity {
  ListView movie_list=null;
  private ArrayList<Movie>movies;
  private MovieAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bade3);
        movie_list=findViewById (R.id.movie_list);
        movies = new ArrayList <Movie> ();
        movies.add (new Movie (R.mipmap.pika,"八德埤塘自然生態公園","電話：03-3657929","地址：桃園市八德區興豐路1315號","桃園八德親子踏親好去處，" +
                "有大\n草皮可野餐、埤塘生態豐富，可\n看烏龜、鴨子、水鳥，環湖步道\n好美，" +
                "有如花蓮雲山水般的埤塘\n美景出現在桃園，超適合親子同\n遊。"));
        movies.add (new Movie (R.mipmap.choo,"巧克力共和國","電話：03-3656555","地址：桃園市八德區巧克力街底","宏亞巧克力共和國，" +
                "是老牌子「七\n七乳加」、" +
                "「新貴派」等巧克力\n食品的觀光工廠，" +
                "DIY 教室、\n美食餐廳，戶外還有戲水池、" +
                "扭\n扭車尬車場～是個好吃又好玩的\n觀光工廠。"));

        movies.add (new Movie (R.mipmap.nan,"桃園假日農業創意市集","電話：03-2868833","地址：桃園市八德區介壽路一段547號旁","桃園在地小農將地方優質農產在市\n集販賣，該市集不僅提供當地農友\n直銷管道，直接與消費民眾面對面\n接觸，相互溝通經驗、農業理念的\n傳達，這是超市、量販店所作不到\n的人與人最親近的交流，歡迎\n民眾有空來逛逛市集，支持在地農\n產品。" +
                "除了可買到正宗原產地的各\n式農產品、農產加工品、手創商品\n。"));




        adapter = new MovieAdapter  (this,movies);
        movie_list.setAdapter (adapter);
    }

}


