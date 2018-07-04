package test.somerestservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPoint {

    @GetMapping
    public String some(){
        return "OK";
    }
}
