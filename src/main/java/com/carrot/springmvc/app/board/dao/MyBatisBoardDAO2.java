package com.carrot.springmvc.app.board.dao;

import com.carrot.springmvc.app.board.model.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MyBatisBoardDAO2 extends SqlSessionDaoSupport implements BoardDAO {
    @Autowired
    private SqlSession sqlSession;
    String namespace = "com.board.dao.BoardDAO";
    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


    @Override
    public List<BoardDTO> getBoardList() {
        List<BoardDTO> boardList = getSqlSession().selectList(namespace+".getBoardList");
        return boardList;
    }

    @Override
    public void insertBoard(BoardDTO theBoard) {

    }

    @Override
    public BoardDTO readBoardById(String board_Id) {
        return null;
    }

    @Override
    public void updateBoardById(BoardDTO theBoard) {

    }

    @Override
    public void deleteBoardById(String board_Id) {

    }
}




