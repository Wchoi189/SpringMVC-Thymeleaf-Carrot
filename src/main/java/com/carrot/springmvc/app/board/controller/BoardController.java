package com.carrot.springmvc.app.board.controller;

import com.carrot.springmvc.app.board.dao.BoardDAO;
import com.carrot.springmvc.app.board.model.BoardDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BoardController {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());




    BoardDAO boardDAO;

    @GetMapping("/")
    public String boardHome (Model theModel1) {
        System.out.println("board_index.html");
        List<BoardDTO> theBoard = boardDAO.getBoardList();
        theModel1.addAttribute("boardList", theBoard);
        return "board_index";
    }

    @GetMapping("/boardList")
    public String boardList (Model theModel) {
        List<BoardDTO> theBoard = boardDAO.getBoardList();
        theModel.addAttribute("boardList", theBoard);
        System.out.println("list:" + theBoard);
        return "board_list";
    }

    @PostMapping ( "/boardInsert")
    public String boardInsert(@RequestBody BoardDTO theBoard, Model theModel) {
        boardDAO.insertBoard(theBoard);
        System.out.println("/insert");
        return "board_insert";
    }
}
