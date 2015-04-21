package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	//Por default responde a un GET.
	//El @ResponseBody sirve para retornar el mensaje directamente en la response HTTP
    @RequestMapping("/")
    public @ResponseBody String index() {
        return "Welcome to the home page!";
    }
}
