package com.hanghae.springsollevel1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LevelOneDataRequestPullDto {

    private String title;
    private String author;
    private String contents;
    private String pw;

    public LevelOneDataRequestPullDto(String title, String author, String contents, String pw) {
        this.title = title;
        this.author = author;
        this.pw = pw;
        this.contents = contents;
    }


}