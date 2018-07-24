package com.Bike.core;


import java.util.Stack;


public class BaseballGame {
    public static void main(String[] args ) throws Exception {

        String[] input = {"5","-2","4","C","D","9","+","+"};
        Stack<Integer> stackOfValues = new Stack<>();
        Stack<Integer> stackOfSum = new Stack<>();

        int switchValue=0;
        String inputString;
        int sum=0;

        for (int i = 0; i < input.length; i++) {
            switch (input[i]){
                case "C":
                    stackOfValues.pop();
                    System.out.println("stackOfValues C: "+ stackOfValues);
                    int removeValue = stackOfSum.pop();
                    sum-=removeValue;
                    System.out.println("stackOfSum  C: "+ stackOfSum);
                    break;

                case "D":
                    int d=Integer.valueOf(stackOfValues.peek())*2;
                    stackOfValues.push(d);
                    System.out.println("stackOfValues D: "+ stackOfValues);
                    sum=d+stackOfSum.peek();
                    stackOfSum.push(sum);
                    System.out.println("stackOfSum  D: "+ stackOfSum);
                    break;
                case "+":
                    int lastRound = stackOfValues.pop();
                    int last2Round = stackOfValues.pop();
                    stackOfValues.push(last2Round);
                    stackOfValues.push(lastRound);
                    int plusValue = last2Round+lastRound;
                    stackOfValues.push(plusValue);
                    sum+=plusValue;
                    stackOfSum.push(sum);
                    break;
                default:
                    stackOfValues.push(Integer.valueOf(input[i]));
                    System.out.println("stackOfValues: "+ stackOfValues);
                    sum+=Integer.valueOf(stackOfValues.peek());
                    stackOfSum.push(sum);
                    System.out.println("stackOfSum: "+ stackOfSum);
                    break;
            }
        }
        System.out.println("final sum result: "+ sum);
    }
}
