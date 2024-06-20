package crud.demo.controller.responceForm;

import lombok.Getter;

import java.util.List;

@Getter
public class BoardListResponceForm {
    private List<BoardResponceForm> boardListResponceForm;

    public BoardListResponceForm(List<BoardResponceForm> boardListResponceForm) {
        this.boardListResponceForm = boardListResponceForm;
    }
}
