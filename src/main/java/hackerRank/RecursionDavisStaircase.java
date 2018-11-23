package hackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Problems: https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=recursion-backtracking
//Explain: https://www.youtube.com/watch?v=eREiwuvzaUM
public class RecursionDavisStaircase {

        // Complete the stepPerms function below.
        static int stepPerms(int n) {
            if(n<0){
                return 0;
            }
            else if(n==0){
                return 1;
            }
            return stepPerms(n-1)+stepPerms(n-2)+stepPerms(n-3);
        }

        public static void main(String[] args)  {
            System.out.println(RecursionDavisStaircase.stepPerms(10));
        }
    }


