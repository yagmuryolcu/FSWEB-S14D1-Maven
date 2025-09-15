package com.workintech.cylinder;

public class Circle {
    private double radius;
    //Sınıfın bir tane constructor metodu olmalı ve içerisinde radius değişkeninin değerini değiştirebilmeli.
    // Radius bir şekilde 0'dan küçük belirtilirse radius 0'a eşitlenmeli.
    public  Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }

    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return  radius * radius * Math.PI;
    }

}
