package com.Bike.core;

import java.util.Arrays;

public class HammingDistance {
    public static  void main(String[] args){
        int x=1,y=4;

        int n = x ^ y;


        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);//remove the rightmost bit 1, until n it is 0; 
        }
        System.out.println(count);

}
}
