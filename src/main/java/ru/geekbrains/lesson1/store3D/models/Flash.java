package ru.geekbrains.lesson1.store3D.models;

public class Flash {
    private Point3D point3D;
    private double angle3D;
    private String color;
    private String power;

    public Flash(Point3D point3D, double angle3D, String color, String power) {
        this.point3D = point3D;
        this.angle3D = angle3D;
        this.color = color;
        this.power = power;
    }

    public Point3D getPoint3D() {
        return point3D;
    }

    public double getAngle3D() {
        return angle3D;
    }

    public void Rotate(double angle3D){
        this.angle3D = angle3D;
    }


    public void Move(Point3D point3D){
        this.point3D = point3D;
    }

}
