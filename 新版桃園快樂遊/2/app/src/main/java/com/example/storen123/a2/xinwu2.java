package com.example.storen123.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class xinwu2 extends AppCompatActivity {
    ListView movie_list=null;
    private ArrayList<Movie> movies;
    private MovieAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_bade3);
        movie_list=findViewById (R.id.movie_list);
        movies = new ArrayList<Movie> ();
        movies.add (new Movie (R.mipmap.xinwu1,"桃園市保護教育園區","電話： 03-4861760","地址：327桃園市新屋區永興里三鄰大牛欄117號","開發人員私心推薦，如果想要認養\n狗狗的話是個不錯的好地方，我家\n的狗狗以前就住在那邊w，是帶小\n孩見習了解生命，愛護生命的好景\n點w，而且會定時舉辦狗狗回娘家\n活動" ));

        movies.add (new Movie (R.mipmap.xinwu2,"太平洋自行車博物館","電話：03-4861231 ","地址：桃園市新屋區永福路686號","博物館不以蒐集古董車為要，而是\n展現當代世界自行車科技縮影，因\n此除有世界自行車科技發展史外，\n亦有許多珍貴的自行車典藏品及復\n刻版，而最受歡迎「體驗區」，則\n可以試乘不少太平洋自行車最夯的\n車款。 "));

        movies.add (new Movie (R.mipmap.xinwu3,"永安漁港","電話：03-486 1017","地址：桃園市新屋區中山西路三段1165號","永安漁港位於社子溪出海口，原名\n崁頭屋港，是親子們一起騎車啖海\n鮮美食的好去處，離綠色隧道不遠\n的路程就可以輕鬆騎到，是全家人\n休閒娛樂的好去處。" ));



        adapter = new MovieAdapter  (this,movies);
        movie_list.setAdapter (adapter);

    }
}

