package com.carrot.springmvc.mapper;

import com.carrot.springmvc.app.board.model.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapperJava {
    List<BoardDTO> getBoardList();
    void insertBoard (BoardDTO theBoard);
    BoardDTO readBoardById(String board_Id);
    void updateBoardById(BoardDTO theBoard);
    void deleteBoardById(String board_Id);
}
