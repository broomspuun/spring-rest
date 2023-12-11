package com.nikitasokolov.spring.rest.exception_handling;

public class EmployeeIncorrectData {
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;

    public EmployeeIncorrectData() {
    }
}
