package com.company;

import java.util.Scanner;

public class ProgrammerDay {

    public String result(){
        Scanner scanner = new Scanner(System.in);
        String output;

        int year = scanner.nextInt();

        if  (year>=1700 && year<=1917 ){
            if (year%4==0){
                output="12.09."+year;
            }else {
                output="13.09."+year;

            }
        }else if (year==1918) {
            output="26.09."+year;
        }else{
            if ((year%4==0&&year%100!=0)||(year%400==0)){
                output="12.09."+year;
            }else {
                output="13.09."+year;
            }
        }

        return output;
    }
}
