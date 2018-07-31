package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Zonli3 extends AppCompatActivity {
    ListView movie_list = null;
    private ArrayList <Movie> movies;
    private MovieAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_zonli3);
        movie_list = findViewById (R.id.movie_list);
        movies = new ArrayList <Movie> ();
        movies.add (new Movie (R.mipmap.zonli1, "金車咖啡文教館", "電話：03-4651121", "地址：桃園市中壢區榮民南路412號", "台灣本土飲料老牌子「金車飲料」\n在中壢有開放參觀囉！「Mr. Br\nown～咖啡～」每當這耳熟能響的\n廣告曲在耳畔響起，想必大家的腦\n海中就會浮現出一位穿著白色西裝\n、留著濃密大鬍子、一手拿著咖啡\n、一手比著讚的伯朗大叔，他就是\n金車公司旗下伯朗咖啡的商標，也\n是台灣罐裝咖啡的代表品牌之一。"));

        movies.add (new Movie (R.mipmap.zonli2, "中平商圈", "電話：無", "地址：桃園市中壢區中平路", " 有「桃園西門町」之稱的中壢火車\n站前商圈─中平商圈，位於中壢火車\n站站前出口處，步行1分鐘內即可\n抵達，是當地逛街購物的首選。" +
                "早期\n的中平商圈地板是柏油路，後來才\n重新整修成為人行步道，為全長近\n700公尺寬15公尺的徒步商圈，讓原\n本就已經相當熱鬧的中平商圈變得\n更適合逛街。"));

        movies.add (new Movie (R.mipmap.zonli3, "中壢觀光夜市", "電話： 03-4948816", "地址：桃園市中壢區新民路中央西路口", "以新明路為主的中壢觀光夜市，分\n為百貨、小吃、水果三大屬性，在\n此設攤的幾乎都是老字號，包括各\n式小吃及男女服飾、五金百貨、生\n活日用品、精美飾品、飲料冰品等\n吃喝玩樂應有盡有，前半段以港韓\n服飾、生活日用品、休閒娛樂等居\n多；後半段則是美食的天堂" ));


        adapter = new MovieAdapter (this, movies);
        movie_list.setAdapter (adapter);
    }


}
