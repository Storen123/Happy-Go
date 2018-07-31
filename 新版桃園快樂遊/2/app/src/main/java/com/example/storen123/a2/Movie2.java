package com.example.storen123.a2;

public class Movie2 {
    public class Movie {
        public int pic2;
        public String name2;
        public String date2;
        public String lbldate2;
        public String intro2;


        public Movie(int pic2, String name2, String date2, String intro2, String lbldate2) {
            this.pic2 = pic2;
            this.name2 = name2;
            this.date2 = date2;
            this.intro2 = intro2;
            this.lbldate2 = lbldate2;
        }

        public int getPic() {

            return pic2;
        }

        public void setPic(int pic) {

            this.pic2 = pic2;
        }

        public String getName() {
            return name2;
        }

        public void setName(String name) {
            this.name2 = name2;
        }

        public String getDate() {
            return date2;
        }

        public void setDate(String date2) {
            this.date2 = date2;
        }

        public String getIntro() {
            return intro2;
        }

        public void setIntro(String intro2) {
            this.intro2 = intro2;
        }

        public String getLbldate() {return  lbldate2;}

        public void setLbldate(String lbldate2) {this.lbldate2 = lbldate2;}



    }


}


