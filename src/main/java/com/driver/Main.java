package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
       int a = p.Product(2,3);
       int b = p.Product(2,3,4);
       double c = p.Product(4,3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class Product{
   public int Product(int x, int y){
            return x+y;
    }

   public int Product(int x,int y, int z){
            return x+y+z;
    }

    public double Product(double x, double y){
            return x+y;
    }
}