package com.example.calculator.logic;

import com.example.calculator.basic.Calculator;

import java.util.Scanner;

public class ConeCalculator implements Calculator
{
    @Override
    public double calculateBaseArea()
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input the cone's base radius: ");
        int r=cin.nextInt();
        return Math.PI*r*r;
    }

    @Override
    public double calculateBasePerimeter()
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input the cone's base radius: ");
        int r=cin.nextInt();
        return Math.PI*2*r;
    }
}
