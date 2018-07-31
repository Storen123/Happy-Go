package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class yaya4 extends AppCompatActivity {
    ListView movie_list =null;
    private ArrayList<Movie>movies;
    private MovieAdapter adapter = null ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yaya4);
        movie_list = findViewById(R.id.movie_list);
        movies = new ArrayList<Movie>();
        movies.add(new Movie(R.mipmap.hu,"桃園虎頭山環保公園" ,"電話03-3354757",
                "地址：桃園市桃園區成功路三段"," 虎頭山環保公園原是桃園市的舊垃\n圾掩埋場，佔地2.5公頃，經規劃\n後打造成一座綠地公園，園區內設\n有景觀涼亭、望遠鏡，大草坪體能\n等設施，一旁有露天式咖啡可以坐\n著享用，是大桃園地區欣賞黃昏落\n日及夜景相當受歡迎的好去處，尤\n其擁有絕佳夜色美景，故有著「星\n星公園」的別稱。"));
        movies.add(new Movie(R.mipmap.peace1,"桃園忠烈祠暨神社文化園區" ,"電話03-3325215",
                "地址：桃園市桃園區成功路三段200號"," 座落於虎頭山上的桃園市忠烈祠，\n前身為日本人所建造的「桃園神社\n」，是臺灣保存最為完整的日治時\n代神社，建築風格融合了中國古代\n唐風、" +
                "日本風及臺灣近代風，採用\n上等台灣檜木構築，並已在民國八\n十三年經公告正式被列為國家三級\n古蹟。"));
        movies.add(new Movie(R.mipmap.article,"桃園藝文展演中心" ,"電話03-3170511",
                "地址：桃園市桃園區中正路1188號"," 2010年落成的桃園展演中心兼\n具表演藝術、展覽、娛樂等多元功\n能之現代環保綠建築，由綠野國際\n建築師事務所的許伯元建築師所設\n計，該建築曾榮獲內政部「100年公\n共建築物無障礙優良作品優等獎」。"));


        adapter = new MovieAdapter(this ,movies);
        movie_list.setAdapter(adapter);




    }
}
