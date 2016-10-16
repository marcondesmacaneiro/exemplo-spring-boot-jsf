package br.com.exemplo.springbootjsf.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author marcondes
 */
@Controller
public class TesteThymeleafController {
    
    @RequestMapping("/testethymeleaf")
    public String teste() {
        return "index";
    }
    
}
