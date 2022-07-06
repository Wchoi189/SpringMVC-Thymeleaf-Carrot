package com.carrot.springmvc.app.board.controller;

import com.carrot.springmvc.app.board.dao.BoardDAO;
import com.carrot.springmvc.app.board.dao.MyBatisBoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @Autowired
    MyBatisBoardDAO dao;

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
