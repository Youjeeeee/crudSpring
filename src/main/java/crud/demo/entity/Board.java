package crud.demo.entity;

import lombok.Getter;

@Getter
public class Board {
    private String title;
    private String password;
    private String content;

    public Board(String title, String password, String content) {
        this.title = title;
        this.password = password;
        this.content = content;
    }
}
