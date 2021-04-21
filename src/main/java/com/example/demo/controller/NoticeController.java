package com.example.demo.controller;

import com.example.demo.service.Notice;
import com.example.demo.service.NoticeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @GetMapping
    public List<Notice> Notice() throws IOException {
        return NoticeService.getNotice();
    }
}
