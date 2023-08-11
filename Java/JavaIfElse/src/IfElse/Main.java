package IfElse;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(N%2==1)
            System.out.println("Weird");
        else if(N<=5&&N>=2)
            System.out.println("Not Weird");
        else if(N<=20&&N>=6)
            System.out.println("Weird");
        else if(N>20)
            System.out.println("Not Weird");

        bufferedReader.close();
    }
}
