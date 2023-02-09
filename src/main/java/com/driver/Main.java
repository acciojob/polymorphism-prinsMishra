package com.driver;

 public class Main {
       public class Product{
        public int product(int x, int y) {
             return 1;
        }
        public int product(int x, int y, int z) {
            return 5;

        }
        public double product(double x, double y) {
             return 5.4;

        }
    }

     public  void main(String[] args) {
        Product p = new Product();
        p.product(3,4);
        p.product(3,4,5);
        p.product(4,6);

    }

}