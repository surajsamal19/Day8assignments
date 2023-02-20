package com.bl.linecomparison;

public class Point {
    private double x;
    private double y;

    public static void main(String[] args) {

    public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
        }public class Line implements Comparable<Point.Line> {
            private Point point1;
            private Point point2;

            public Line(Point point1, Point point2) {
                this.point1 = point1;
                this.point2 = point2;
            }

            public Point getPoint1() {
                return point1;
            }

            public Point getPoint2() {
                return point2;
            }

            public void setPoint1(Point point1) {
                this.point1 = point1;
            }

            public void setPoint2(Point point2) {
                this.point2 = point2;
            }

            public double length() {
                double dx = point2.getX() - point1.getX();
                double dy = point2.getY() - point1.getY();
                return Math.sqrt(dx * dx + dy * dy);
            }

            @Override
            public int compareTo(Point.Line o) {
                if (this.length() < o.length()) {
                    return -1;
                } else if (this.length() > o.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        Point.Line line1 = new Point.Line(point1, point2);

        Point point3 = new Point(0, 0);
        Point point4 = new Point(5, 12);
        Point.Line line2 = new Point.Line(point3, point4);

        System.out.println(line1.compareTo(line2)); // -1
        System.out.println(line2.compareTo(line1)); // 1
        System.out.println(line1.compareTo(line1)); // 0


    }
}
