package sinosoftsh.provider.app.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sinosoftsh.provider.api.CalculateApi;

import java.math.BigDecimal;


@RestController
@RequestMapping("/api")
public class CalculateController implements CalculateApi{

    @Override
    public Integer add(@RequestParam Integer a,@RequestParam Integer b){
        return a+b;
    }

    @Override
    public Integer subtract(@RequestParam Integer a,@RequestParam Integer b){
        return a-b;
    }

}
