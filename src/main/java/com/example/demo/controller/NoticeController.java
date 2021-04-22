package com.example.demo.controller;

import com.example.demo.service.Notice;
import com.example.demo.service.NoticeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/notice/{page}")
public class NoticeController {
    @GetMapping
    public List<Notice> Notice(@PathVariable int page) throws IOException {
        return NoticeService.getNotice(page);
    }
}
