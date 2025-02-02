package com.example.NumberApi;

class ErrorResponse {
    private String number;
    private String error;

    public ErrorResponse(String number, String error) {
        this.number = number;
        this.error = error;
    }
    public String getNumber() {
        return number;
    }
    public String getError() {
        return error;
    }
}
