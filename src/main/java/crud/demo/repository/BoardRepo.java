package crud.demo.repository;

import crud.demo.controller.responceForm.BoardResponceForm;
import crud.demo.entity.Board;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BoardRepo {

    private static final Logger log = LoggerFactory.getLogger(BoardRepo.class);


    Map<Long, Board> boardStop = new HashMap<>();


    private Long id = 0L;

    public void save(Board board){
        log.info("repo save start"+board.toString());
        boardStop.put(id, board);
        id++;
    }

    public List<BoardResponceForm> listInRepo() {

        List<Long> idlist = new ArrayList<>(boardStop.keySet());
        List<Board> boardList = new ArrayList<>(boardStop.values());

        List<BoardResponceForm> boardResponceFormList = new ArrayList<>();

        for (int i = 0; i < idlist.size() ; i++) {

            Long id = idlist.get(i);
            Board board = boardList.get(i);

            BoardResponceForm boardResponceForm = new BoardResponceForm(id,board);

            boardResponceFormList.add(boardResponceForm);

        }


        return boardResponceFormList;
    }

    public Board boardFindById(Long boardId) {

        Board board = boardStop.get(boardId);

        return board;
    }
}
