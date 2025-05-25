package fr1sbee.dev.xestuga.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    private final Logger LOGGER = LogManager.getLogger(LoginController.class);


    @RequestMapping("")
    public String index(){
        LOGGER.info("Accediste al login ");
        return "login.html";
    }
}
