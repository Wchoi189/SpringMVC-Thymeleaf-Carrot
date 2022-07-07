package com.carrot.springmvc.app.board.dao;

import com.carrot.springmvc.app.board.model.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MyBatisBoardDAO implements BoardDAO {
@Autowired
    private SqlSession sqlSession;
    String namespace = "com.carrot.springmvc.app.board.dao.BoardDAO";
    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


    @Override
    public List<BoardDTO> getBoardList() {
        return sqlSession.selectList(namespace+ ".getBoardList");
    }

    @Override
    public void insertBoard(BoardDTO theBoard) {
        sqlSession.insert(namespace + ".insert", theBoard);
    }

    @Override
    public BoardDTO readBoardById(String board_Id) {
        return sqlSession.selectOne(namespace + ".select", board_Id);
    }

    @Override
    public void updateBoardById(BoardDTO theBoard) {
        sqlSession.update(namespace + ".update", theBoard);
    }

    @Override
    public void deleteBoardById(String board_Id) {
        sqlSession.delete(namespace+".delete", board_Id);
    }
}




