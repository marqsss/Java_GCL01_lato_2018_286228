package com.example.calculator.ui;

import com.example.calculator.logic.ConeCalculator;
import com.example.calculator.logic.ExtendedConeCalculator;
import com.example.calculator.logic.ExtendedTetrahedronCalculator;
import com.example.calculator.logic.TetrahedronCalculator;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ConeCalculator coneCalc=new ConeCalculator();
        TetrahedronCalculator tetraCalc=new TetrahedronCalculator();
        ExtendedConeCalculator extConeCalc=new ExtendedConeCalculator();
        ExtendedTetrahedronCalculator extTetraCalc=new ExtendedTetrahedronCalculator();

        Scanner cin = new Scanner(System.in);
        int mode=1;
        while(mode!=0)
        {
            System.out.println("1. Cone / 2. Tetrahedron + 1. Base / 2. Whole figure +" +
                    " 1. Area / 2. Perimeter or volume, eg 111 = cone base area. 0 to exit");
            mode = cin.nextInt();

            switch (mode) {
                case 0:
                    continue;
                case 111:
                    System.out.println(coneCalc.calculateBaseArea());
                    break;
                case 112:
                    System.out.println(coneCalc.calculateBasePerimeter());
                    break;
                case 121:
                    try {
                        extConeCalc.calculateArea();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 122:
                    try {
                        extConeCalc.calculateVolume();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 211:
                    System.out.println(tetraCalc.calculateBaseArea());
                    break;
                case 212:
                    System.out.println(tetraCalc.calculateBasePerimeter());
                    break;
                case 221:
                    try {
                        extTetraCalc.calculateArea();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 222:
                    try {
                        extTetraCalc.calculateVolume();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }
}

