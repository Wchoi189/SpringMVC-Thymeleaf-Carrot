package com.carrot.springmvc.app.board.service;

import com.carrot.springmvc.app.board.model.BoardDTO;

import java.util.List;

public interface BoardService {
    public List<BoardDTO> getBoardList();
    public void insertBoard (BoardDTO theBoard);
    public BoardDTO readBoardById(String board_Id);
    public void updateBoardById(BoardDTO theBoard);
    public void deleteBoardById(String board_Id);
}
