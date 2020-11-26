package sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeeting() {
        return "Hola World in Spanish";
    }
}
