package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {//x and y are different from this its a method
        return (Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2)));
    }

    public double distance(Point point) {
        return distance(point.x,point.y);
    }

    public double distance() {
        return (Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2)));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
