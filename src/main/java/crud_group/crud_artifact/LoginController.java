package crud_group.crud_artifact;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/")
    public String index(Model u, HttpSession httpSession) {
        if(httpSession.getAttribute("user") != null){
            User temp = (User) httpSession.getAttribute("user");
            return  "redirect:/users/" +temp.getId();
        }
        System.out.println("JJJJ");
        u.addAttribute("u", new User());
        return "login";
    }
    @PostMapping(value = "/login")
    public String check(@ModelAttribute User a, Model model, HttpSession httpSession) {
        if(httpSession.getAttribute("user") != null){
            User temp = (User) httpSession.getAttribute("user");
            return  "redirect:/users/" +temp.getId();
        }
        System.out.println(a.name);
        User u = userRepository.findByName(a.name);
        if(!u.password.equals(a.password)){
            return "redirect:/";
        }
        if(u != null){
            //model.addAttribute("user", u);

            httpSession.setAttribute("user",u);

           // return "user_page";
            return  "redirect:/users/" + u.getId();
        }
        return "redirect:/";
    }

    @GetMapping(value = "/register")
    public String register( Model model){

        model.addAttribute("user",new User());
        return "user/register";
    }



}
