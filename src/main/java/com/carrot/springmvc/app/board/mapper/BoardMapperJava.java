package com.carrot.springmvc.app.board.mapper;

import com.carrot.springmvc.app.board.model.BoardDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface BoardMapperJava {
    @Select("SELECT * FROM board")
    public List<BoardDTO> getBoardList();

    @Select("SELECT * FROM board WHERE board_id = #{boardId}")
    public BoardDTO getBoardById(int boardId);

    @Insert("INSERT INTO board (title, file_name, save_path, reg_date) VALUES (#{title}, #{file_name}, #{save_path}, #{reg_date})")
    @Options(useGeneratedKeys=true, keyProperty="board_id")
    public void insertBoard(BoardDTO theBoard);

    @Update("UPDATE board SET title = #{title}, file_name = #{file_name}, save_path = #{save_path}, reg_date = #{reg_date} WHERE board_id = #{boardId}")
    public void updateBoard(BoardDTO theBoard);
    @Delete("DELETE FROM board WHERE board_id = #{boardId}")
    public void deleteBoardById(int id);



}
