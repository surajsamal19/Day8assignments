package com.bl.linecomparison;

public class Linecomparison {
    private double x1, y1, x2, y2;

    public Linecomparison(double x, double y, double x1, double y1) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1;
        this.y2 = y1;
    }

    public double length() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static void main(String[] args) {

    }
}
