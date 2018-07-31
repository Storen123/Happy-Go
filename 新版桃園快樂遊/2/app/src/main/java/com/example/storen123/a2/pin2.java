package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class pin2 extends AppCompatActivity {


    ListView movie_list=null;
    private ArrayList<Movie> movies;
    private MovieAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bade3);
        movie_list=findViewById (R.id.movie_list);
        movies = new ArrayList <Movie> ();
        movies.add (new Movie (R.mipmap.pin1,"新勢公園","電話： 03-4571976","地址：桃園市平鎮區延平路一段168號","新勢公園位於桃園市平鎮區，佔地\n超過4.6公頃的超大範圍，是擁有多\n項遊樂設施、籃球場、生態池、滑\n板場、大草皮、空中慢跑道、體健\n區、礫間區、瞭望台等的休閒園區\n，另外還有極限運動場、兒童攀岩\n場、槌球場等特殊遊憩設施，適合\n老中青三代同樂，一同揮灑汗水的\n絕佳場地。"));

        movies.add (new Movie (R.mipmap.pin2,"忠貞商圈","電話：無","地址：由龍岡圓環南路延伸至新生路","1950年代撤退來台的滇緬軍民在龍\n岡地區落地生根，為了生計，許多\n滇緬移民賣起了家鄉味，香腸臘肉\n、醬菜、雲南米干、雲南豌豆粉、\n涼拌青木瓜絲，及雲南大薄片等，\n飄洋過海後發揚光大，成了當地最\n具特色的美食料理。 "));

        movies.add (new Movie (R.mipmap.pin3,"源友咖啡文化園區","電話：03-4697387","地址：桃園市平鎮區工五路8號","國內最大連鎖通路咖啡烘焙豆供應\n商－源友咖啡，專營咖啡豆炒焙研\n磨萃取、穀物類炒焙研磨萃取、烘\n焙原料，許多國內連鎖超商與連鎖\n咖啡廳原料皆是出自於源友。平鎮\n工業區中，這棟有著大片玻璃帷幕\n、咖啡杯造型的建築物即是【源友\n咖啡文化館】"));




        adapter = new MovieAdapter  (this,movies);
        movie_list.setAdapter (adapter);
    }
}
