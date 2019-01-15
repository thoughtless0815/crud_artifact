package crud_group.crud_artifact;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public @ResponseBody
    String handleError() {
        //do something like logging
        return "<h1>Error: 404 Page Not Found</h1>";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
