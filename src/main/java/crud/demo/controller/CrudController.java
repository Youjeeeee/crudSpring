package crud.demo.controller;

import crud.demo.controller.requstForm.CreateForm;
import crud.demo.controller.responceForm.BoardListResponceForm;
import crud.demo.controller.responceForm.BoardResponceForm;
import crud.demo.entity.Board;
import crud.demo.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrudController {
    private static final Logger log = LoggerFactory.getLogger(CrudController.class);

    @Autowired
    private BoardService boardService;

    @PostMapping("/create")
    public void create(@RequestBody CreateForm createForm){

        log.info("save start");
        boardService.save(createForm);
        log.info("save end");
    }

    @GetMapping("/List")
    public BoardListResponceForm responceList(){

        log.info("ListResponceStart");

        List<BoardResponceForm> boardResponceFormList = boardService.list();
        BoardListResponceForm boardListResponceForm = new BoardListResponceForm(boardResponceFormList);

        log.info("ListResponceEnd");
        return boardListResponceForm;
    }

    //상세페이지관련

    @GetMapping("/read/{boardId}")
    public Board readBoard (@PathVariable("boardId") Long boardId){
        log.info("read start");

        Board board = boardService.read(boardId);

        log.info("read end");

        return board;
    }

}
