package lk.ac.mrt.fit.library_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentationController {

    @GetMapping("/")
    public String openSwaggerUi() {
        return "redirect:/swagger-ui.html";
    }
}
