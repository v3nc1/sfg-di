package sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfgdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;


    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){

        //System.out.println("Hello World!!");

        return greetingService.sayGreeeting();
    }
}
