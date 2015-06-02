package br.com.exemplo.springbootjsf.view;

import org.springframework.stereotype.Controller;

/**
 * Created by zozfabio on 02/06/15.
 */
@Controller
public class GreetingController {

    public String getMessage() {
        return "Hello World!!!";
    }
}
