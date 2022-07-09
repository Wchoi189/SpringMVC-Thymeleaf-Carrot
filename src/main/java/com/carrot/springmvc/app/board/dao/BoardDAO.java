package com.carrot.springmvc.app.board.dao;


import com.carrot.springmvc.app.board.model.BoardDTO;

import java.util.List;



public interface BoardDAO {
    List<BoardDTO> getBoardList();
    void insertBoard (BoardDTO theBoard);
    BoardDTO readBoardById(String board_id);
    void updateBoard(BoardDTO theBoard);
    void deleteBoardById(String board_id);

}
