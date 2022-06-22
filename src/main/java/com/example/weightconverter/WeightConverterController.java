package com.example.weightconverter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeightConverterController {
    WeightConverter wc = new WeightConverter();

    @RequestMapping("/gram")
    public double ouncetogram(@RequestParam double ounce){
        return wc.ounceToGram(ounce);
    }
    @RequestMapping("/kilogram")
    public double stonetokilogram(@RequestParam double stone){
        return wc.ounceToGram(stone);
    }

}
