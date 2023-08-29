package com.hanghae.springsollevel1.dto;

import com.hanghae.springsollevel1.entity.LevelOneData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LevelOneDataResponseSolTwoDto {
    private String title;
    private String author;
    private String contents;
    private String nowTime;

    public LevelOneDataResponseSolTwoDto(String title, String author, String contents, String nowTime) {
        this.title = title;
        this.author = author;
        this.contents = contents;
        this.nowTime = nowTime;
    }


}