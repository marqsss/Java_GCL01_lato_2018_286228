package com.example.calculator.logic;

import com.example.calculator.basic.ExtendedCalculator;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ExtendedTetrahedronCalculator extends TetrahedronCalculator implements ExtendedCalculator
{
    @Override
    public void calculateArea() throws Exception
    {
        Scanner cin = new Scanner(System.in);
        System.out.println("The regular tetrahedron's total area = "+ super.calculateBaseArea()*4);
    }

    @Override
    public void calculateVolume() throws Exception
    {
        Scanner cin = new Scanner(System.in);
        double a=super.calculateBaseArea();
        System.out.println("The regular tetrahedron's total volume = "+a* sqrt(8*a/27/sqrt(3)));
    }
}
