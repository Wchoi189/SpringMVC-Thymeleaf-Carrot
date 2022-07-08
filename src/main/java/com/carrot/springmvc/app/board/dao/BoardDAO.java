package com.carrot.springmvc.app.board.dao;


import com.carrot.springmvc.app.board.model.BoardDTO;

import java.util.List;



public interface BoardDAO {
    public List<BoardDTO> getBoardList();
    public void insertBoard (BoardDTO theBoard);
    public BoardDTO readBoardById(String board_id);
    public void updateBoard(BoardDTO theBoard);
    public void deleteBoardById(String board_id);

}
