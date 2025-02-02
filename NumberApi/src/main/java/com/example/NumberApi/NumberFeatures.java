package com.example.NumberApi;

import java.util.List;

public class NumberFeatures {
    private int number;
    private boolean is_prime;
    private boolean is_perfect;
    private List<String> properties;
    private int class_sum;
    private String fun_fact;
    private boolean error;
    private String errorMessage;
    
    public NumberFeatures() {}

    public NumberFeatures(String number, boolean error, String errorMessage) {
        this.number = Integer.parseInt(number);
        this.error = error;
        this.errorMessage = errorMessage;

    }



    public int getNumber() {
        return number;
    }

    public boolean isIs_prime() {
        return is_prime;
    }

    public boolean isIs_perfect() {
        return is_perfect;
    }

    public List<String> getProperties() {
        return properties;
    }

    public int getClass_sum() {
        return class_sum;
    }

    public String getFun_fact() {
        return fun_fact;
    }

    public boolean isError() {
        return error;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setIs_prime(boolean is_prime) {
        this.is_prime = is_prime;
    }

    public void setIs_perfect(boolean is_perfect) {
        this.is_perfect = is_perfect;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public void setClass_sum(int class_sum) {
        this.class_sum = class_sum;
    }

    public void setFun_fact(String fun_fact) {
        this.fun_fact = fun_fact;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
