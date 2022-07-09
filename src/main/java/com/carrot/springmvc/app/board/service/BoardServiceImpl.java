package com.carrot.springmvc.app.board.service;


import com.carrot.springmvc.app.board.mapper.BoardMapperJava;
import com.carrot.springmvc.app.board.model.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("boardService")
//@Repository
public class BoardServiceImpl implements IBoardService {

    @Autowired
    private  BoardMapperJava mapper;
    //No Qualifying type of Bean found. ???

    @Override
    public List<BoardDTO> getBoardList() {
    List<BoardDTO> theBoard = mapper.getBoardList();
        return theBoard;
    }

    @Override
    public BoardDTO readBoardById(int board_id) {
        BoardDTO boardDTO = mapper.getBoardById(board_id);
        return boardDTO;
    }

    @Override
    public void insertBoard(BoardDTO theBoard) {
            mapper.insertBoard(theBoard);
    }


    @Override
    public void updateBoard(BoardDTO theBoard) {
        mapper.updateBoard(theBoard);
    }

    @Override
    public void deleteBoardById(int board_id) {
        mapper.deleteBoardById(board_id);
    }
}
