package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class dayuan2 extends AppCompatActivity {
    ListView movie_list=null;
    private ArrayList<Movie> movies;
    private MovieAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_bade3);
        movie_list=findViewById (R.id.movie_list);
        movies = new ArrayList<Movie> ();
        movies.add (new Movie (R.mipmap.dayuan1,"桃園航空城願景館","電話：03-3816700","地址：桃園市大園區大成路2段126號","館外雄渾有勁的書法字體，為名藝\n術家高國堂老師受邀為桃園航空城\n願景館之題字，寫意、奔放的線條\n帶出航空城開創國際視野的宏觀之\n氣。而一旁的綠化造景則柔化了鋼\n構建築的堅硬線條，也為建築物大\n面積留白增添幾許活力。"));

        movies.add (new Movie (R.mipmap.dayuan2,"溪海花卉園區","電話：無","地址：桃園市大園區溪海里","連全台三大主要花市虎尾、內湖、\n建國的切花供應產區也都是從溪海\n花卉園區而來！大多數人對於大園\n的印象不外乎是竹圍吃海產、或是\n返抵國門的過境之地，卻不知這裡\n不僅是台灣花卉重要生產區，還是\n花市批發的大本營。 "));

        movies.add (new Movie (R.mipmap.dayuan3,"光泉牛奶園地","電話：03-3865185 分機111","地址：桃園市大園區大觀路1249號","「校外教學」課程，希望透過課程\n的設計，讓小朋友們親自走一趟生\n產鮮乳的工廠，把書本上的飲食知\n識轉變成為生活中的美好體驗，再\n配合學校的日常宣導，以循序漸進\n的方式塑造正確健康的飲食習慣。"));



        adapter = new MovieAdapter  (this,movies);
        movie_list.setAdapter (adapter);

    }
}

