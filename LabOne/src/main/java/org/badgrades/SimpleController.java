package org.badgrades;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ldowell on 6/2/16.
 */
@Controller
public class SimpleController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
