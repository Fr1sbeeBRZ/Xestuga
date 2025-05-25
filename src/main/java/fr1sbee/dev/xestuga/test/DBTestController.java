package fr1sbee.dev.xestuga.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBTestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/dbtest")
    public String testConnection() {
        try {
            Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            return "Conexión exitosa: Resultado = " + result;
        } catch (Exception e) {
            return "Error de conexión: " + e.getMessage();
        }
    }
}
