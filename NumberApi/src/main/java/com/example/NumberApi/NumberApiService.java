package com.example.NumberApi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumberApiService {

    public boolean isPrime(int num){
        if(num <= 1) return false;
        for (int i =2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public boolean isPerfect(int num){
        int sum = 0;
        for(int i =1; i < num; i++){
            if(num % i == 0){
                sum+= i;
            }
        }
        return sum == num;
    }

    public boolean isArmStrong(int num){
        int sum = 0;
        int temp = num;
        int digits = (int) Math.log10(num) + 1;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == num;
    }

    public int sumOfNumber(int num){
        int sum = 0;
        while(num != 0){
            sum += (num % 10);
            num = num / 10;
        }
        return sum;
    }

    public String funFact(int num){
        if(isArmStrong(num)){
            return num + "is an Armstrong number because 3^3 + 7^3 + 1^3 = 371";
        }
        else {
            return "not an Armstrong";
        }
    }

    public List<String> getProperties(int num){
        List<String> properties = new ArrayList<>();
        if(isArmStrong(num)){
            properties.add("armstrong");
        }
        if (num % 2 == 0){
            properties.add("even");
        }
        else {
            properties.add("odd");
        }
        return properties;
    }
}
