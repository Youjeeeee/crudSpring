package crud.demo.controller.requstForm;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
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
