package com.company;

public class Time {
    private int hour;
    private int mineta;
    private int second;

    public Time(int sec,int min,int hour)
    {
        if(IsNormal(sec,min,hour)) {
            second = sec;
            mineta = min;
            this.hour = hour;
        }
    }

    public Time()
    {}

    public void setTime(int sec,int min,int hour)
    {
        if(IsNormal(sec,min,hour)) {
            second = sec;
            mineta = min;
            this.hour = hour;
        }
    }

    public Boolean IsNormal(int sec,int min,int hour)
    {
        if(sec > 59 || min > 59 || hour > 23 || sec < 0 || min < 0 || hour < 0) {
            System.out.println("Error.");
            return false;
        }
        else
            return true;
    }

    public String toString()
    {
        return String.format("%02d:%02d:%02d",hour,mineta,second);
    }
}
