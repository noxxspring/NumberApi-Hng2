package com.example.NumberApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NumberApiController {
    @Autowired
    private NumberApiService numberApiService;

    @GetMapping("/classify-number")
    public Object classifyName(@RequestParam("number") String number) {
        if (!isValidInteger(number)) {
            // If it's not a valid integer, return a 400 error response
            return new ErrorResponse(number,"Invalid number format");
        }
        try {
            int num = Integer.parseInt(number);

            if(num < 0){
                return new NumberFeatures(number,true,"negative number");
            }

            NumberFeatures features = new NumberFeatures();
            features.setNumber(num);
            features.setIs_prime(numberApiService.isPrime(num));
            features.setIs_perfect(numberApiService.isPerfect(num));
            features.setProperties(numberApiService.getProperties(num));
            features.setClass_sum(numberApiService.sumOfNumber(num));
            features.setFun_fact(numberApiService.funFact(num));
            return features;

        } catch (NumberFormatException e){
            return new ErrorResponse("An error occurred while processing the number", number);
        }

    }
    private boolean isValidInteger(String str) {
        try {
            // Attempt to parse the string into an integer
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            // If a NumberFormatException occurs, it's not a valid integer
            return false;
        }
    }
}
