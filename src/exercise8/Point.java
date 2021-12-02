package exercise8;

import java.util.Scanner;

public class Point {
    double x,y;

    public Point() { 
        x = 0.0;
        y = 0.0;
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
        x = input.nextDouble();
        y = input.nextDouble();
    }

    public void translate(double xDelta, double yDelta) { 
        x = x + xDelta;
        y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) { 
        Point a = new Point();
        a.x = xDelta + x;
        a.y = yDelta + y;
        return a;
    }

    public boolean equals(Point otherPoint) { 
        if(this.x == otherPoint.x && this.y == otherPoint.y) {
          return true;
        } else {
        return false;
        }
    }

    public String toString() {  
        return "(" + x + ", " + y + ")";
    }
}
