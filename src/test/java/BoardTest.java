import com.carrot.springmvc.app.board.dao.BoardDAO;
import com.carrot.springmvc.app.board.model.BoardDTO;
import com.carrot.springmvc.app.board.service.IBoardService;
import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:mybatis/mybatis-context.xml")
public class BoardTest {
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    private IBoardService IBoardService;

    @Autowired
    private BoardDAO dao;

    @Test
    public void configTest() {
        SqlSession session = applicationContext.getBean("sqlSession", SqlSession.class);
        System.out.println(session.getClass().getName());
    }

    @Test
    public void listBoard () {
        List<BoardDTO> boardList = IBoardService.getBoardList();
        for(BoardDTO boardDTO : boardList){
            System.out.println(boardDTO);
        }
    }
    @Test @Ignore
    public void boardRead () {
        BoardDTO boardDTO = IBoardService.readBoardById(1);
        System.out.println(boardDTO);
    }

    @Test @Ignore
    public void insert (){
        BoardDTO dto=new BoardDTO();
        dto.setTitle("Junit insert");
        dto.setFile_name("Junit file");
        dto.setSave_path("c:/drive");
        dto.setReg_date(new Date());
        IBoardService.insertBoard(dto);
    }

    @Test
    public void deleteBoard () {
        IBoardService.deleteBoardById(5);
        System.out.println("check delete results.. ");

    }

    @Test
    public void updateBoard () {
        BoardDTO boardDTO = new BoardDTO ();
        boardDTO.setBoard_id(3);
        boardDTO.setTitle("Update test");
        boardDTO.setFile_name("update file name.jpg");
        boardDTO.setSave_path("D:/DRIVE");
        boardDTO.setReg_date(new Date(1999-01-01));
        IBoardService.updateBoard(boardDTO);
    }

}
