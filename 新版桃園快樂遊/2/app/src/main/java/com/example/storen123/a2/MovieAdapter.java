package com.example.storen123.a2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;
import com.example.storen123.a2.R;


public class MovieAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Movie> movies;

    public MovieAdapter(Context context,ArrayList<Movie> movies) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return movies.indexOf(getItem(position));
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        Movie movie = (Movie)getItem(position);
        View v = inflater.inflate(R.layout.activity_yaya3,null);
        ImageView pic =(ImageView)v.findViewById(R.id.pic);
        TextView lbldate =(TextView)v.findViewById(R.id.lbldate);
        TextView name =(TextView)v.findViewById(R.id.name);
        TextView date =(TextView)v.findViewById(R.id.date);
        TextView intro =(TextView)v.findViewById(R.id.intro);
        pic.setImageResource(movie.pic);
        lbldate.setText((movie.lbldate));
        name.setText(movie.name);
        date.setText(movie.date);
        intro.setText(movie.intro);
        return v;
    }
}

