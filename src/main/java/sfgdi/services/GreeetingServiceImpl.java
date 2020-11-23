package sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreeetingServiceImpl implements GreetingService{


    @Override
    public String sayGreeeting() {
        return "Hello World";
    }
}
