package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class younmai2 extends AppCompatActivity {
    ListView movie_list=null;
    private ArrayList<Movie> movies;
    private MovieAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_bade3);
        movie_list=findViewById (R.id.movie_list);
        movies = new ArrayList<Movie> ();
        movies.add (new Movie (R.mipmap.younmai1,"郭元益糕餅博物館","電話： 03-4962201 分機1(DIY課程請先預約)","地址：桃園市楊梅區幼獅工業區青年路9巷1號","傳承百餘年的郭元益，2001年成立\n郭元益糕餅博物館楊梅館，亦為全\n台唯一的宮殿式建築優良觀光工廠\n，從優雅的園林景緻中，踏入糕餅\n博物館的餅食天地，認識珍存之台\n灣餅食文化與本土民俗儀禮" ));

        movies.add (new Movie (R.mipmap.younmai2,"白木屋品牌探索館","電話：03-4965558 (DIY課程請於七天前預約) ","地址：桃園市楊梅區高獅路813巷22弄6號","「白木屋品牌探索館」座落於幼獅\n工業區內，由簡董事長親自設計之\n裝潢與佈置擺設，格調相當高雅，\n遊客們可先至簡報室觀賞關於白木\n屋成長過程的影片簡介，而後沿著\n廊道參觀"));
        movies.add (new Movie (R.mipmap.younmai3,"秀才登山步道","電話：無","地址：桃園市楊梅區秀才路769巷","如果想要登高賞景、享受親近山林\n的暢快，或是帶小孩來個不一樣的\n健走之旅，位於楊梅的秀才登山步\n道，讓你第一次登山就上手！由楊\n梅秀才路上中華汽車廠區大門左轉\n，循著天德堂方向前行，便可看到\n步道入口木造牌樓。"));


        adapter = new MovieAdapter  (this,movies);
        movie_list.setAdapter (adapter);

    }
}