package com.appexample.hazard_01;


public class Main2Activity {
    private String author;
    private String title;
    private String description;
    private String url;
    private String imgurl;
    private String published;
    private String img1;
    private String img2;
    private String text1;

    public Main2Activity(String author, String title, String description, String url, String imageURL, String published) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.imgurl = imageURL;
        this.published = published;
    }

    public Main2Activity(String author, String title, String description, String url, String imageURL, String published, String img1, String img2, String text1) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.imgurl = imageURL;
        this.published = published;
        this.text1 = text1;
        this.img1 = img1;
        this.img2 = img2;
    }



    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getImgurl() {
        return imgurl;
    }

    public String getPublished(){
        return published;
    }

    public String getText1(){return text1;}

    public String getImg1(){return getText1();}

    public String getImg2(){return getImg2();}
}
