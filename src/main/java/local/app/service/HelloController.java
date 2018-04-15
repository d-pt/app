package local.app.service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/service")
    public String index() {
        return "Bon Jour,<br/><p> This is Dia PATEL </p>";
    }

}