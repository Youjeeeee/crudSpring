package crud.demo.controller.requstForm;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CreateForm {
    private String title;
    private String password;
    private String content;

    public String getTitle() {
        return title;
    }

    public String getPassword() {
        return password;
    }

    public String getContent() {
        return content;
    }
}
