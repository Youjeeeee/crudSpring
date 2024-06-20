package crud.demo.controller.responceForm;

import crud.demo.entity.Board;

public class BoardResponceForm {
    //글 순번이랑 제목
    private Long id;
    private Board board;

    public BoardResponceForm(Long id, Board board) {
        this.id = id;
        this.board = board;
    }
}
