/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication12;

/**
 *
 * @author ппп
 */
public class Model {

    public double calculation(double a, double b, String operator){
        switch (operator){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) return 0;
                return a / b;
        }
        System.out.println("Unknown operator type" + operator);
        return 0;
    }
}
