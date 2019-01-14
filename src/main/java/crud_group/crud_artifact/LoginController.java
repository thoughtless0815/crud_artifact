package crud_group.crud_artifact;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {
    @GetMapping(value = "/")
    public String index(Model u) {
        System.out.println("JJJJ");
        u.addAttribute("u", new User());
        return "login";
    }
    @PostMapping(value = "/login")
    public String check(@ModelAttribute User u, Model model) {
        System.out.println(u.name);
        model.addAttribute("user", u);
        return "greeting";
    }

    @GetMapping(value = "/register")
    public String register( Model model){

        model.addAttribute("user",new User());
        return "register";
    }



}
