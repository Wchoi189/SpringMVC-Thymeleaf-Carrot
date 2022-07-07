package com.carrot.springmvc.app.board.service;

import com.carrot.springmvc.app.board.dao.MyBatisBoardDAO;
import com.carrot.springmvc.app.board.model.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Autowired
    private MyBatisBoardDAO boardDAO;

    public BoardServiceImpl () {

    }

    @Override
    public List<BoardDTO> getBoardList() {
        List<BoardDTO> boardList = boardDAO.getBoardList();
        return boardList;
    }

    @Override
    public void insertBoard(BoardDTO theBoard) {

    }

    @Override
    public BoardDTO readBoardById(String board_Id) {
        return null;
    }

    @Override
    public void updateBoardById(BoardDTO theBoard) {

    }

    @Override
    public void deleteBoardById(String board_Id) {

    }
}
