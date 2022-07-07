package com.carrot.springmvc.app.board.dao;

import com.carrot.springmvc.app.board.model.BoardDTO;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MyBatisBoardDAO extends SqlSessionDaoSupport implements BoardDAO {





    //Autowired는 메로리에 이 객체의 매게변수-타입의 존재 여부를 확인 하고 대입 한다


    String namespace = "com.carrot.springmvc.app.board.dao.BoardDAO";



    public List<BoardDTO> getBoardList() {
        return getSqlSession().selectList(namespace+ ".getBoardList");
    }


    public void insertBoard(BoardDTO theBoard) {
        getSqlSession().insert(namespace + ".insert", theBoard);
    }


    public BoardDTO readBoardById(String board_Id) {
        return getSqlSession().selectOne(namespace + ".select", board_Id);
    }


    public void updateBoardById(BoardDTO theBoard) {
        getSqlSession().update(namespace + ".update", theBoard);
    }


    public void deleteBoardById(String board_Id) { getSqlSession().delete(namespace+".delete", board_Id);
    }
}




