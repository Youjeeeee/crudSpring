package crud.demo.controller;

import crud.demo.controller.requstForm.CreateForm;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {
    private static final Logger log = LoggerFactory.getLogger(CrudController.class);

    @PostMapping("/create")
    public void create(CreateForm createForm){

        log.info(createForm.getTitle());
        log.info(createForm.getContent());
        log.info(createForm.getContent());

    }

}
