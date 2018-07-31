package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class lonton2 extends AppCompatActivity {

        ListView movie_list=null;
        private ArrayList<Movie>movies;
        private MovieAdapter adapter = null;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bade3);
            movie_list=findViewById (R.id.movie_list);
            movies = new ArrayList <Movie> ();
            movies.add (new Movie (R.mipmap.lonton1,"石門水庫","電話：03-4712001","地址：桃園市龍潭區佳安路2號","石門水庫的水壩位於大漢溪中游，\n水壩高度約有133公尺，溢洪道\n共有6座閘門並有後池堰、發電廠\n、石門大圳和環湖道路等設施，從\n壩底公路即可到達石門水庫大壩區\n，石門水庫水壩是大雨後遊客欣賞\n洩洪壯麗景觀的最佳去處；石門水\n庫大壩對岸的旅遊景觀亦十分豐富\n，石門勝景碑、依山閣、梅園和楓\n林步道等等都是石門水庫的特色。"));

            movies.add (new Movie (R.mipmap.lonton2,"桃園市客家文化館","電話：03-4096682","地址：桃園市龍潭區中正路三林段500號","桃園市為全國客家第一大縣，龍潭\n更是重要的客家聚落，在此建立客\n家文化館別具意義，本文化館位於\n龍潭陸軍司令部對面，是民國96\n年新完工的建築，館內主要呈現客\n家文化及古文物展覽，以及各項客\n家活動介紹。 "));

            movies.add (new Movie (R.mipmap.lonton3,"龍潭聖蹟亭","電話：無","地址：桃園市龍潭區竹窩子段20地號","龍潭聖蹟亭始建於清光緒元年，由\n監生古象賢、楊鳳翔、庠生鄧觀奇\n、貢生鄧逢熙、廩生楊鳳池、士紳\n黃龍蟠等人發起集資，並分別由楊\n鳳池，黃龍蟠等人合力完成，現存\n的聖蹟亭於光緒18年、民國14年、\n68年皆曾整修，建築保留清代3進式\n規制，為全臺灣面積最大、規畫最\n完整的惜字亭，已列為市定古蹟。"));




            adapter = new MovieAdapter  (this,movies);
            movie_list.setAdapter (adapter);
        }

    }
