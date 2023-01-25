package org.example;

public class Triangle {

    public static double sTriangle(double a, double b, double c) throws TriangleExeption {
        if (a <= 0 | c <= 0 | b <= 0) {
            throw new TriangleExeption("Труегольник не существет");
        }
        if (c > a + b | a > c + b | b > a + b) {
            throw new TriangleExeption("Труегольник не существет");
        } else {
            double p = 0.5 * (a + b + c);
            double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return result;
        }
    }


}
