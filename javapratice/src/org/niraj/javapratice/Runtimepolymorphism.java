
package org.niraj.javapratice;

 abstract class Shape{
    int d1,d2;
    public Shape(int d1, int d2)
    {
        this.d1=d1;
        this.d2=d2;
    }
    public abstract int getArea();   
}
class Triangle extends Shape
{
    public Triangle(int a,int b)
    {
        super(a,b);
    }
    public int getArea()
    {
        return d1*d2/2;
    }
}

    class Rectangle extends Shape
            
    {
       public Rectangle(int a,int b)
        {
           super(a,b); 
        }
        public int getArea()
        {
            return d1*d2;
        }
    }

class Demo
{
    public static void main(String[] args) {
        Shape s=new Triangle(10,20);
        System.out.println(s.getArea());
        Shape s1=new Rectangle(2,4);
        System.out.println(s1.getArea());
    }
}