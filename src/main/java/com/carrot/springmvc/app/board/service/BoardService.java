package com.carrot.springmvc.app.board.service;

import com.carrot.springmvc.app.board.model.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
List<BoardDTO> getBoardList();
void insertBoard (BoardDTO theBoard);
BoardDTO readBoardById(int board_id);
void updateBoard(BoardDTO theBoard);
void deleteBoardById(int board_id);

}
