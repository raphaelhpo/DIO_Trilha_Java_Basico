package dio.my_first_web_api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WealcomeControler{
    @GetMapping("/welcome")
    public String wealcome(){
        return "Welcome to my springBoot web API";
    }
}
