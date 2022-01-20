package com.company;

public class Circle {
    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "Красный";
    public static final double DEFAULT_DIAMETR = 2.0;

    private double radius;
    private String color;
    private double diametr;

    {
        diametr = radius * 2;
    }

    public Circle()
    {
        radius = DEFAULT_RADIUS;
        color = DEFAULT_COLOR;
        diametr = DEFAULT_DIAMETR;
    }
    public Circle(double radius)
    {
        this.radius = radius;
        color = DEFAULT_COLOR;
        diametr = radius*2;
    }
    public Circle(double radius,String color)
    {
        this.radius = radius;
        this.color = color;
        diametr = radius*2;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String toString()
    {
        return "Круг радиуса = " + radius + " и цвета " + color + ", диаметром " + diametr;
    }
    public double getArea()
    {
        return radius*radius*Math.PI;
    }
    public double getDiametr()
    {
        return radius*2;
    }
}
