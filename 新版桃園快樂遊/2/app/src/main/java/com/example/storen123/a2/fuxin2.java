package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class fuxin2 extends AppCompatActivity {
    ListView movie_list=null;
    private ArrayList<Movie> movies;
    private MovieAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_bade3);
        movie_list=findViewById (R.id.movie_list);
        movies = new ArrayList<Movie> ();
        movies.add (new Movie (R.mipmap.fuxin1,"角板山行館園區","桃園市政府風景區管理處電話： 03-3821678 北橫管理站電話：03-3821678 ","地址：桃園市復興區中正路133-1號","角板山行館園區包含戰備隧道、蔣\n公行館、雕塑公園、樟腦收納所等\n多個特色景點。角板山戰備隧道建\n於民國52年，用於戰事爆發時保\n護國家元首安危，並對外下達作戰\n指令，如今隨著軍事色彩淡去，成\n為遊客遙想當年戰地風光的好去處。" ));

        movies.add (new Movie (R.mipmap.fuxin2,"奎輝國小嘎色鬧獵人學校","電話：03-3822177 ","地址：桃園市復興區奎輝里3鄰25號","斑駁的操場、空蕩的校舍，這裡是\n桃園市復興區的奎輝國小嘎色鬧分\n校，多年來早已併校，閒置的校舍\n看來相當可惜。桃園市復興區是著\n名的觀光景點，因此桃園市教育局\n跟觀光旅遊局，將考慮開放校舍，\n做為背包客或露營遊客的休閒住宿\n場所。部落族人聽到消息，期盼能\n帶動部落觀光發展。"));

        movies.add (new Movie (R.mipmap.fuxin3,"桃源仙谷","電話：03-3822661","地址：桃園市復興區上高遶8鄰5號之1號","佔地兩百公頃的桃源仙谷位於桃園\n復興鄉，是一處擁有多種花草樹木\n的休閒園區。桃源仙谷保留原始山\n林，並且種植許多山櫻花、梅花以\n及多種的草本植物，其中又以各式\n品種的鬱金香花海最為著名，每當\n冬春兩季鬱金香花海盛開美不勝收\n，吸引大批民眾前往賞花。"));


        adapter = new MovieAdapter  (this,movies);
        movie_list.setAdapter (adapter);

    }
}