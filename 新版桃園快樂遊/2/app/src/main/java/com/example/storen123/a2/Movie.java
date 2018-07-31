package com.example.storen123.a2;

import org.w3c.dom.Text;

public class Movie {
  public int pic;
    public String name;
    public String date;
    public String lbldate;
    public String intro;


    public Movie(int pic,String name,String date,String intro,String lbldate)   {
        this.pic = pic;
        this.name = name;
        this.date = date;
        this.intro = intro;
        this.lbldate = lbldate;
    }

    public int getPic() {

        return pic;
    }

    public void setPic(int pic) {

        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getLbldate() {return  lbldate;}

    public void setLbldate(String lbldate) {this.lbldate = lbldate;}



    }



