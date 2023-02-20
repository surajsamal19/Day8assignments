package com.bl.linecomparison;

public class Lineequality {
    private double x1, y1, x2, y2;

    public Lineequality(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Lineequality line = (Lineequality) other;
        return Double.compare(line.x1, x1) == 0 &&
                Double.compare(line.y1, y1) == 0 &&
                Double.compare(line.x2, x2) == 0 &&
                Double.compare(line.y2, y2) == 0;
        Lineequality line1 = new Lineequality(0, 0, 1, 1);
        Lineequality line2 = new Lineequality(0, 0, 2, 2);
        Lineequality line3 = new Lineequality(0,0,2,2)

        System.out.println(line1.equals(line2)); // true
        System.out.println(line1.equals(line3)); // false

    }

    public static void main(String[] args) {

    }
}
