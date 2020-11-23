package sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfgdi.services.GreeetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller=new PropertyInjectedController();

        controller.greetingService=new GreeetingServiceImpl();

    }
    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}