package com.driver;

public class Main {
    public void main(String[] args) {
        Product p = new Product();

        int firstAnsValue = p.product(2, 3);

        int secondAnswerValue = p.product(2, 3, 4);

        double thirdAnswerValue = p.product(2.1, 2.9);

    }
}

    class Product {
        public int product(int x, int y) {
            int ans = x * y;
            return ans;
        }

        public int product(int x, int y, int z) {

            int secondAnswer = x * y * z;
            return secondAnswer;
        }

        public double product(double x, double y) {
            double thirdAnswer = x * y;
            return thirdAnswer;
        }
    }


//    public static void main(String[] args) {
//        Product p = new Product();
//        int ansValue = p.product(2, 3);
//        int secondAnsValue = p.product(2, 3, 4);
//        double thirdAnsValue = p.product(2.1, 2.2);
//    }
//}
//class Product{
//
//    public int product(int x, int y) {
//        int ans = x * y;
//        return ans;
//    }
//    public int product(int x, int y, int z) {
//        int secondAns = x * y * z;
//        return secondAns;
//    }
//    public double product(double x, double y) {
//        double thirdAns = x * y;
//        return thirdAns;
//    }
//}