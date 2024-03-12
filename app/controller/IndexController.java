package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model,@RequestParam String nome) {
        String mensagem = "Bom dia!!!" + nome + "!!!";
        model.addAttribute("msg", mensagem);
        return "/index.jsp";
    }    
}
