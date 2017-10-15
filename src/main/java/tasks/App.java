package tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */

@Controller
@EnableAutoConfiguration
public class App
{
    @RequestMapping("/")
    @ResponseBody
    String home() {

        return "<h1>Дратути!</h1>";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }



}

