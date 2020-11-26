package sfgdi.services;

import jdk.jfr.SettingDefinition;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

    @Override
    public String sayGreeeting() {
        return "Hello World from Setter";
    }
}
