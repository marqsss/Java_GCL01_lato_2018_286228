package com.example.calculator.logic;

import com.example.calculator.basic.ExtendedCalculator;

import java.util.Scanner;

public class ExtendedConeCalculator extends ConeCalculator implements ExtendedCalculator
{
    @Override
    public void calculateArea() throws Exception
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input the cone's slant height (tworz\u0105ca): ");
        int l=cin.nextInt();
        System.out.println("The cone's total area = "+ super.calculateBasePerimeter()*l/2);
    }

    @Override
    public void calculateVolume() throws Exception
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input the cone's height: ");
        int h=cin.nextInt();
        System.out.println("The cone's total volume = "+ super.calculateBaseArea()*h/3);
    }
}
