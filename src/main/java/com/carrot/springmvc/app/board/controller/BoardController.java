package com.carrot.springmvc.app.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {


    @GetMapping("/")
    public String boardList() {
        System.out.println("board_index.html");
        return "board_index";
    }

    @GetMapping("/boardInsert")
    public String boardInsert() {
        System.out.println("/insert");
        return "board_insert";
    }
}
