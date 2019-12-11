package sinosoftsh.provider.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "calculate",path = "/api2")
public interface CalculateApi {

    @PostMapping(path = "/add")
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

    @PostMapping(path = "/subtract")
    Integer subtract(@RequestParam("a") Integer a,@RequestParam("b") Integer b);

}
