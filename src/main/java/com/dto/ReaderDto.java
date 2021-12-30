package com.dto;

import java.io.Serializable;

public class ReaderDto implements Serializable {

    private int init;
    private String title;
    private String today;
    private String writer;
    private String article;
    private String twit;

    public ReaderDto(int init, String title, String today, String writer, String article, String twit) {
        this.init = init;
        this.title = title;
        this.today = today;
        this.writer = writer;
        this.article = article;
        this.twit = twit;
    }

    public int getInit() {
        return init;
    }

    public void setInit(int init) {
        this.init = init;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getTwit() {
        return twit;
    }

    public void setTwit(String twit) {
        this.twit = twit;
    }

    @Override
    public String toString() {
        return "ReaderDto{" +
            "init=" + init +
            ", title='" + title + '\'' +
            ", today='" + today + '\'' +
            ", writer='" + writer + '\'' +
            ", article='" + article + '\'' +
            ", twit='" + twit + '\'' +
            '}';
    }
}
