package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model){
        model.addAttribute("Nguyen",name);
        return "index";
    }
}
