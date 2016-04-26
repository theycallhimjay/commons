package com.hamster.wheel.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason on 4/23/2016.
 */
public class IntersectingDisks {

    public int solution(int[] A) {
        List<Circle> circles = new ArrayList<Circle>();
        int count = 0;
        for(int i = 0 ; i<A.length; i++){
            Point p = new Point(i, 0);
            Circle circle = new Circle(p, A[i]);
            circles.add(circle);
        }
        for(int i=0; i< circles.size(); i++){
            for(int j=0; j< circles.size(); j++){
                if(i!=j){
                    Circle a = circles.get(i);
                    Circle b = circles.get(j);
                    List<Point> intersections = a.getIntersections(b);
                    if(!intersections.isEmpty()){
                        System.out.println(circles.indexOf(a) + " intersects with " + circles.indexOf(b));
                        count++;
                    }
                }
            }
        }
        count ++;
        if(count > 10000000){
            return -1;
        }
        return count;
    }

    private class Circle{
        private Point center;
        private long radius;

        public Circle(Point center, long radius) {
            this.center = center;
            this.radius = radius;
        }

        public Point getCenter() {
            return center;
        }

        public void setCenter(Point center) {
            this.center = center;
        }

        public long getRadius() {
            return radius;
        }

        public void setRadius(long radius) {
            this.radius = radius;
        }

        public List<Point> getIntersections(Circle c){
            Point p0 = this.getCenter();
            Point p1 = c.getCenter();
            float d, a, h;
            d = p0.distance(p1);
            a = (radius* radius - c.getRadius() * c.getRadius() + d*d)/(2*d);
            h = (float) Math.sqrt(radius* radius - a* a);
            Point p2 = p1.sub(p0).scale(a/d).add(p0);
            float x3, y3, x4, y4;
            x3 = p2.getX() + h*(p1.y - p0.y)/d;
            y3 = p2.y - h * ( p1.x - p0.x)/d;
            x4 = p2.x - h*(p1.y - p0.y)/d;
            y4 = p2.y + h* (p1.x - p0.x)/d;

            List<Point> intersections = new ArrayList<Point>();
            if(!Float.isNaN(x3) || !Float.isNaN(y3)){
                intersections.add(new Point(x3, y3));

            }
            if(!Float.isNaN(x4) || !Float.isNaN(y4)){
                intersections.add(new Point(x4, y4));
            }
            return intersections;
        }
    }

    private class Point{
        private float x;
        private float y;

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(long x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(long y) {
            this.y = y;
        }

        Point sub(Point p){
            return new Point(this.x - p.getX(), y - p.getY());
        }

        Point add(Point p){
            return new Point(this.x + p.getX(), this.y + p.getY());
        }

        float distance(Point p){
            return (float) Math.sqrt((x-p.getX()) * (x-p.getX()) + (y-p.getY()) * (y-p.getY()));
        }

        Point normal(){
            float length = (float) Math.sqrt(x*x + y*y);
            return new Point(x/length, y/length);
        }

        Point scale(float s){
            return new Point (x*s, y*s);
        }
    }
}
