package com.example.storen123.a2;

public class Movie1 {

    public  int pic1;
    public String name1;
    public String date1;
    public String lbldate1;
    public String intro1;
    public Movie1(int pic1,String name1 ,String date1,String intro1,String lbldate1) {
        this.name1 = name1;
        this.date1 = date1;
        this.lbldate1 = lbldate1;
        this.intro1 = intro1;
     }
        public int getPic1 () {
            return pic1;
        }

        public void setPic1 ( int pic1){
            this.pic1 = pic1;
        }

        public String getName1 () {
            return name1;
        }

        public void setName1 (String name1){
            this.name1 = name1;
        }

        public String getDate1 () {
            return date1;
        }

        public void setDate1 (String date1){
            this.date1 = date1;
        }

        public String getLbldate1 () {
            return lbldate1;
        }

        public void setLbldate1 (String lbldate1){
            this.lbldate1 = lbldate1;
        }

        public String getIntro1 () {
            return intro1;
        }

        public void setIntro1 (String intro1){
            this.intro1 = intro1;
        }
    }


