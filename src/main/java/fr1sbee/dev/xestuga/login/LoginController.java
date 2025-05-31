package fr1sbee.dev.xestuga.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
    private final Logger LOGGER = LogManager.getLogger(LoginController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("")
    @ResponseBody
    public String testConnection() {
        try {
            LOGGER.info("dentro del test");
            Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            return "Conexión exitosa: Resultado = " + result;
        } catch (Exception e) {
            return "Error de conexión: " + e.getMessage();
        }
    }
}
