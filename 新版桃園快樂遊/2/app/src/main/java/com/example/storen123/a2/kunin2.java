package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class kunin2 extends AppCompatActivity {
    ListView movie_list=null;
    private ArrayList<Movie>movies;
    private MovieAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_bade3);
        movie_list=findViewById (R.id.movie_list);
        movies = new ArrayList<Movie> ();
        movies.add (new Movie (R.mipmap.kunin1,"林家古厝休閒農場","電話：03-4985703","地址：桃園市觀音區221號","園內有面積約7甲的蓮花田、休憩\n區、瓜棚及古厝，以賞蓮及販售\n相關產品為主，在6～10月的花季\n還有向日葵、野薑花可供觀賞。" +
                "林\n家古厝，為百年歷史以上的一進四\n護龍古建物，讓人忍不住被這古色\n古香所吸引"));

        movies.add (new Movie (R.mipmap.kunin2,"觀新藻礁野生動物保護區","電話：03-3322101","地址：桃園市觀音區保生里至新屋區永興里沿海","市府農業局委託台灣溼地學會研究\n至今共發現10類大型藻類、12\n9種動物，其中大潭電廠具有最高\n的物種豐富度，新屋溪口次之，樹\n林子海濱最低。樹林子海濱兩樣區\n的大型藻類覆蓋率低，物種豐富度\n及動物豐度也較低，尤其以樹林子\n海濱所調查到的物種最少，在此樣\n區完全沒有大型藻類覆蓋 "));

        movies.add (new Movie (R.mipmap.kunin3,"觀音自行車道","電話：無","地址：桃園市觀音區大湖路二段","觀音區的自行車道主要是在大堀與\n藍埔等村的休閒觀光蓮園附近，每\n到蓮花季，踩著鐵馬而行，穿梭於\n蓮花田間，就能親近清新脫俗的好\n景致。" +
                "觀音的自行車道分為兩條，\n分別為北環埤塘之旅(6km)和南環蓮園\n之旅 (7.5 km)，全程共約 13.5 公里。"));



        adapter = new MovieAdapter  (this,movies);
        movie_list.setAdapter (adapter);

    }
}
