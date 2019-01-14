package crud_group.crud_artifact;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           @RequestParam(name="age", required=false, defaultValue="0") int age,
                           Model model) {

        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "greeting2";
    }


}
