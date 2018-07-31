package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;


public class dac3 extends AppCompatActivity {
        ListView movie_list=null;
        private ArrayList<Movie>movies;
        private MovieAdapter adapter = null;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate (savedInstanceState);
            setContentView (R.layout.activity_dac3);

            movie_list=findViewById (R.id.movie_list);
            movies = new ArrayList <Movie> ();
            movies.add (new Movie (R.mipmap.dac1, "大溪橋", "電話：無", "地址：桃園市大西區中正公園下方", "橫跨大漢溪的大溪橋，就位於中正\n公園的下方，串連了大漢溪左岸自\n行車道，提供行人徒步與自行車使\n用，除了纜索線燈在夜晚開啟的設\n計，" +
                    "美化了大漢溪河岸夜景，橋身\n採用與大溪老街相仿的巴洛克建築\n風格，橋的兩端連接了大溪瑞安路\n一段與大溪老街，可趁著週休二日\n來一場文化美食輕旅行。"));
            movies.add (new Movie (R.mipmap.dac2, "兩蔣文化園區", "電話：03-3884437", "地址：桃園市大溪區復興路一段1097號", " 素有「總統鎮」之稱的桃園大溪，\n命名與三位總統有關，包括兩位長\n眠在此的蔣中正、蔣經國，還有卸\n任後定居大溪的李登輝前總統，大\n溪，可說是總統們最愛的第二故鄉\n。2011年出版的米其林旅遊指南將\n其評鑑為2顆星推薦景點。 "));

            movies.add (new Movie (R.mipmap.dac3, "東和音樂體驗館", "電話：03-3882215", "地址：桃園市大西區信義路266號", "在籌畫期間，本公司的籌畫小組參\n觀過日本及德國的音樂校外教學設\n施，" +
                    "覺得國外的設施強調互動及體\n驗式的教學，我們決定取名為東和\n音樂”體驗館”，取代”博物館”或”展覽\n館”，讓你動手操作每個模型，從操作的\n過程中，了解樂器的發聲原理及音樂\n知識。"));




            adapter = new MovieAdapter  (this,movies);
            movie_list.setAdapter (adapter);
        }

        }




