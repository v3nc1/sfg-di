package sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{


    @Override
    public String sayGreeeting() {
        return "Hello World from Property";
    }
}
