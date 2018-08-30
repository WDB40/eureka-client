package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/request")
public class testRequest {

    @RequestMapping(path ="/worked")
    public String testReturn() {
        return "This worked.";
    }
}
