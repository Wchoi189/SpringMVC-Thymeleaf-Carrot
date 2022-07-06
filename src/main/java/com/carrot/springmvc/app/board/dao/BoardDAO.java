package com.carrot.springmvc.app.board.dao;



import com.carrot.springmvc.app.board.model.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


@Mapper
public interface BoardDAO {
    public List<BoardDTO> getBoardList();
    public void insertBoard (BoardDTO theBoard);
    public BoardDTO readBoardById(String board_Id);
    public void updateBoardById(BoardDTO theBoard);
    public void deleteBoardById(String board_Id);

}
