package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int ansValue = p.product(2, 3);
        int secondAnsValue = p.product(2, 3, 4);
        double thirdAnsValue = p.product(2.1, 2.2);
    }
}
class Product{

    public int product(int x, int y) {
        int ans = x + y;
        return ans;
    }
    public int product(int x, int y, int z) {
        int secondAns = x + y + z;
        return secondAns;
    }
    public double product(double x, double y) {
        double thirdans = x + y;
        return thirdans;
    }
}