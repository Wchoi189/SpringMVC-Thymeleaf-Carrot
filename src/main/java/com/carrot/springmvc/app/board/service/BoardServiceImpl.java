package com.carrot.springmvc.app.board.service;

import com.carrot.springmvc.app.board.model.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("Service")
public class BoardServiceImpl implements BoardService {

//@Autowired
//    private SqlSession sqlSession;


    private SqlSession sqlSession;
    String namespace = "com.carrot.springmvc.app.board.dao.BoardDAO";

    public BoardServiceImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<BoardDTO> getBoardList() {
    List<BoardDTO> theBoard = sqlSession.selectList(namespace+".getBoardList");
        return theBoard;
    }

    @Override
    public BoardDTO readBoardById(int board_id) {
        BoardDTO boardDTO = sqlSession.selectOne(namespace+".readBoardById", board_id);
        return boardDTO;
    }

    @Override
    public void insertBoard(BoardDTO theBoard) {
            sqlSession.insert(namespace + ".insertBoard", theBoard);
    }


    @Override
    public void updateBoard(BoardDTO theBoard) {
        sqlSession.update(namespace+".updateBoard", theBoard);
    }

    @Override
    public void deleteBoardById(int board_id) {
        sqlSession.delete(namespace+".deleteBoardById", board_id);
    }
}
