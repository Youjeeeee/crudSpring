package crud.demo.service;

import crud.demo.controller.requstForm.CreateForm;
import crud.demo.controller.responceForm.BoardResponceForm;
import crud.demo.entity.Board;
import crud.demo.repository.BoardRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImple implements BoardService {

    private static final Logger log = LoggerFactory.getLogger(BoardServiceImple.class);
    @Autowired
    private BoardRepo boardRepo;

    public void save(CreateForm createForm){

        log.info("service save start" + createForm.toString());
        final String title = createForm.getTitle();
        final String password = createForm.getPassword();
        final String content = createForm.getContent();

        Board board = new Board(title, password, content);

        boardRepo.save(board);

    }

    @Override
    public List<BoardResponceForm> list() {

        List<BoardResponceForm> boardResponceFormList = boardRepo.listInRepo();

        return boardResponceFormList;
    }

    @Override
    public Board read(Long boardId) {

        Board board = boardRepo.boardFindById(boardId);

        return board;
    }

}
