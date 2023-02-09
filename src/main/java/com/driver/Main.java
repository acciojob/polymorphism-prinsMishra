package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x;

        }
        public int product(int x, int y, int z) {
            return y;

        }
        public double product(double x, double y) {
            return y;

        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(3,4);
        p.product(3,4,5);
        p.product(4.5,6.5);

    }

}