package exercise8;

import java.util.Scanner;

public class Point {
    double x,y;

    public Point() { 
        x = 0;
        y = 0;
    }

    public Point(double a, double b) { 
        x = a;
        y = b;
    }

    public Point(Point otherPoint) {
        x = otherPoint.x;
        y = otherPoint.x;
    }

    public void initialize() { 
        Scanner input = new Scanner(System.in);
        x = Utils.INPUT.nextDouble();
        y = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) { 
        x = x + xDelta;
        y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) { 
        Point a = new Point();
        double newX = xDelta + x;
        double newY = yDelta + y;
        Point a = new Point(newX, newY);
        return a;
    }

    public boolean equals(Point otherPoint) { 
        boolean xEqual =Utils.equals(x,otherPoint.x);
        boolean yEqual =Utils.equals(y,otherPoint.y);
        return xEqual && yEqual;
    }

    public String toString() {  
        return "(" + x + ", " + y + ")";
    }
}
