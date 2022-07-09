package com.carrot.springmvc.app.board.mapper;

import com.carrot.springmvc.app.board.model.BoardDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapperJava {
    @Select("SELECT * FROM board")
    List<BoardDTO> getBoardList();

    @Select("SELECT * FROM board WHERE board_id = #{boardId}")
    BoardDTO getBoardById(int boardId);

    @Insert("INSERT INTO board (title, file_name, save_path, reg_date) VALUES (#{title}, #{file_name}, #{save_path}, #{reg_date})")
    @Options(useGeneratedKeys=true, keyProperty="board_id")
    void insertBoard(BoardDTO theBoard);

    @Update("UPDATE board SET title = #{title}, file_name = #{file_name}, save_path = #{save_path}, reg_date = #{reg_date} WHERE board_id = #{boardId}")
    void updateBoard(BoardDTO theBoard);
    @Delete("DELETE FROM board WHERE board_id = #{boardId}")
    void deleteBoardById(int id);



}
