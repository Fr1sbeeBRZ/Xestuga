package fr1sbee.dev.xestuga.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    private final Logger LOGGER = LogManager.getLogger(LoginController.class);


    @GetMapping("")
    public String index(){
        LOGGER.info("Accediendo al login ");
        return "/home";
    }
}
