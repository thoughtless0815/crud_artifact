package crud_group.crud_artifact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserPageController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/users/{id}")
    public
    String viewUserPage(@PathVariable int id, Model model, HttpSession httpSession) {
        if(httpSession.getAttribute("user") == null){
            return  "redirect:/";
        }
        model.addAttribute("id", id);
        //httpSession.setAttribute("id", id);
        //httpSession.setAttribute("user", new User("djkashfj", "jkasfhjk"));
        return "user_page";
    }




}
