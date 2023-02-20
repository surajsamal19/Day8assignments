package com.bl.linecomparison;

import com.sun.tools.javac.Main;

public class Comparetwoline {
    public class Line implements Comparable<Line> {
        private double x1, y1, x2, y2;

        public Line(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public double length() {
            double dx = x2 - x1;
            double dy = y2 - y1;
            return Math.sqrt(dx * dx + dy * dy);
        }

        @Override
        public int compareTo(Line other) {
            double diff = this.length() - other.length();
            if (diff < 0) {
                return -1;
            } else if (diff > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    Line line1 = new Line(0, 0, 1, 1);
    Line line2 = new Line(0, 0, 2, 2);
    Line line3 = new Line(0, 0, 1, 2);

System.out.println(line1.compareTo(line2)); // -1
System.out.println(line2.compareTo(line1)); // 1
System.out.println(line1.compareTo(line3)); // -1
System.out.println(line3.compareTo(line1)); // 1
System.out.println(line1.compareTo(line1)); // 0

    public static void main(String[] args) {

    }
}
