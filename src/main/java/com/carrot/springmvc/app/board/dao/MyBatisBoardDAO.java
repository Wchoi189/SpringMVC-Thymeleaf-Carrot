package com.carrot.springmvc.app.board.dao;

import com.carrot.springmvc.app.board.model.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("BoardDAO")
public class MyBatisBoardDAO implements BoardDAO {

    //Autowired는 메로리에 이 객체의 매게변수-타입의 존재 여부를 확인 하고 대입 한다
//    @Autowired
//    private SqlSession session;
//    @Autowired
    private SqlSession session;

////    @Autowired
////    private JdbcTemplate template;
    String namespace = "com.carrot.springmvc.app.board.dao.BoardDAO";


    public List<BoardDTO> getBoardList() {
       List<BoardDTO> dto = session.selectList(namespace+ ".getBoardList");
        return dto;
    }

    public void insertBoard(BoardDTO theBoard) {
        session.insert(namespace + ".insertBoard", theBoard);
    }

    public BoardDTO readBoardById(String board_id) {
        BoardDTO dto = session.selectOne(namespace + ".select", board_id);
        return dto;
    }

    public void updateBoard(BoardDTO theBoard) {
        session.update(namespace + ".update", theBoard);
    }


    public void deleteBoardById(String board_Id) { session.delete(namespace+".delete", board_Id);
    }
}




