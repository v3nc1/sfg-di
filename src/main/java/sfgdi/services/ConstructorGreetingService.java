package sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class ConstructorGreetingService implements GreetingService{

    @Qualifier("constructorGreetingService")
    @Override
    public String sayGreeeting() {
        return "Hello World from Constructor";
    }
}
