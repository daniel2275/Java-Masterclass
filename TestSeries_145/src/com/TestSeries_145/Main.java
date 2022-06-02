package com.TestSeries_145;

import com.danielradonic.Series;

public class Main {

    public static void main(String[] args) {
                Series g = new Series();
                for (int n = 0; n <= 10; n++)
                    System.out.println(g.nSum(n));

                System.out.println();

                for (int n = 0; n <= 10; n++)
                    System.out.println(g.factorial(n));

                System.out.println();

                for (int n = 0; n <= 10; n++)
                    System.out.println(g.fibonacci(n));
            }


    }
