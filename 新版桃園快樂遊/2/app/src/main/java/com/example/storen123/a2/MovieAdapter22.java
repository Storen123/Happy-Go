package com.example.storen123.a2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter22  extends  BaseAdapter{
    private LayoutInflater inflater;
    private  ArrayList<Movie> movies;

    public MovieAdapter22(Context context, ArrayList <Movie> movies) {
        inflater = (LayoutInflater) context.getSystemService (context.LAYOUT_INFLATER_SERVICE);
        this.movies = movies;
    }

    @Override
    public int getCount() {
        {return movies.size ();}
    }

    @Override
    public Object getItem(int position) {
        {return movies.get (position);}
    }

    @Override
    public long getItemId(int position) {
        {return movies.indexOf (getItem (position));}
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        Movie movie = (Movie) getItem  (position);
        View v =inflater.inflate (R.layout.activity_zonli2,null);
        ImageView pic = v.findViewById (R.id.pic2);
        TextView name =v.findViewById (R.id.name2);
        TextView date =v.findViewById (R.id.date2);
        TextView intro =v.findViewById (R.id.intro2);

        return null;
    }
}
