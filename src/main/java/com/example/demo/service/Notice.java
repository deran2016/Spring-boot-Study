package com.example.demo.service;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Builder
@Getter
public class Notice {
    private int no;

    private String title;

    private String date;

    private int views;

    private String href;
}
