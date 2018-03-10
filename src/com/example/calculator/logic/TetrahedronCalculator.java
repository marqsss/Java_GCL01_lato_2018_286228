package com.example.calculator.logic;

import com.example.calculator.basic.Calculator;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TetrahedronCalculator implements Calculator
{

    @Override
    public double calculateBaseArea() {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input the tetrahedron's edge length: ");
        int l=cin.nextInt();
        return sqrt(3)*l*l/4;
    }

    @Override
    public double calculateBasePerimeter() {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input the tetrahedron's edge length: ");
        int l=cin.nextInt();
        return 3*l;
    }
}
