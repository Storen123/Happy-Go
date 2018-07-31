package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class kuku2 extends AppCompatActivity {

    ListView movie_list=null;
    private ArrayList<Movie> movies;
    private MovieAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bade3);
        movie_list=findViewById (R.id.movie_list);
        movies = new ArrayList <Movie> ();
        movies.add (new Movie (R.mipmap.kuku1,"福源山步道","電話：無","地址：桃園市龜山區湖山街88巷19號","福源山步道位於桃園龜山鄉福源村\n，早年曾是兔仔坑通往鶯歌的一條\n山路捷徑。" +
                "產業道路開通後，舊路\n荒廢一甲子， 後來在福源村村長\n協商地主同意後，村民共同努力整\n路，歷經三年時間，終於完成這條\n步道。"));

        movies.add (new Movie (R.mipmap.kuku2,"眷村故事館","電話：03-3298852","地址：桃園市龜山區光峰路43號","經舊建築再利用後成為國內首座以\n眷村原建築改成的眷村故事館，直\n至2014年由桃園縣桃籽園文化協會\n創立與經營管理。自2004年成立以\n來，著重在保存這段特殊的歷史，\n以人物為主展示物件為輔，期盼透\n過眷村文化營造的再思考，以回溯\n的姿態面對這一段台灣史，重新定\n義眷村空間，詮釋與說明龜山重要\n的歷史發展故事 "));

        movies.add (new Movie (R.mipmap.kuku3,"國立體育大學","電話：03-3283201","地址：桃園市龜山區文化一路250號","國立體育大學腹地廣大，生態資源\n豐富。湖泊座落校區內，雁鴨悠游\n湖面之上，陣陣魚群穿梭往來，可\n進行餵食相當有趣。沿著湖畔步道\n行走，可享受怡然自然一派悠閒。\n此外還有寬廣的草原，最適合親子\n同遊共享天倫之樂。"));





        adapter = new MovieAdapter  (this,movies);
        movie_list.setAdapter (adapter);
    }
    }

