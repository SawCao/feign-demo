package sinosoftsh.provider.app.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sinosoftsh.provider.api.CalculateApi;

import javax.annotation.Resource;


@RestController
@RequestMapping("/api2")
public class Calculate2Controller implements CalculateApi{
    @Resource
    CalculateApi calculateApi;

    @PostMapping("/add")
    @Override
    public Integer add(@RequestParam Integer a,@RequestParam Integer b){
        return calculateApi.add(a, b);
    }

    @PostMapping("/subtract")
    @Override
    public Integer subtract(@RequestParam Integer a,@RequestParam Integer b){
        return calculateApi.subtract(a, b);
    }

}
