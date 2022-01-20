package com.company;

public class Main {

    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle(4);
        Circle x = new Circle(3.5,"red");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(x.toString());
        System.out.println(x.getArea());
        System.out.println("Изменяем радиус и цвет x круга");
        x.setColor("ЧЕРНЫЙ");
        x.setRadius(100);
        System.out.println(x.getColor());
        System.out.println(x.getRadius());
        System.out.println(x.getDiametr());
        System.out.println(x.getArea());
        Time VLG = new Time(12,24,20);
        System.out.println(VLG);
        VLG.setTime(14,124,224);
    }
}
