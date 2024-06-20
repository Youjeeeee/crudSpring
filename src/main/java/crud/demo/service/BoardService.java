package crud.demo.service;

import crud.demo.controller.requstForm.CreateForm;
import crud.demo.controller.responceForm.BoardResponceForm;
import crud.demo.entity.Board;

import java.util.List;

public interface BoardService {
    void save(CreateForm createForm);

    List<BoardResponceForm> list();

    Board read(Long boardId);
}
