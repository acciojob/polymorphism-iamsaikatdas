package com.driver;

public class Main {
    public  static  void  main(String [] args){
        Product p = new Product();
        System.out.println(p.product(4, 5));
    }
}
class Product{
    public int product(int x, int y) {
        return x + y;
    }
}