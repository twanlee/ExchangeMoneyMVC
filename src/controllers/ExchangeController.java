package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeController {
    @GetMapping("/exchange")
    public String exchangeForm(){
        return "exchange";
    }
    @PostMapping("/exchange")
    public String exchange(
        @RequestParam
        Float usd ,
        Float rate,
        Float result,
        Model model
    ){
        result = usd*rate;
        model.addAttribute("result",result);
        return "/result";
    }
}
