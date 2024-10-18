package com.selenium;

public class DayCheck {
    private String day;
    public String check(String day){
        if(this.day.equals(day)){
            return "Yes";
        }
        else{
            return "Nope";
        }
    }

    public void setDay(String day){
        this.day=day;
    }
}
