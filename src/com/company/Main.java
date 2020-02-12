package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicode = '\u0044';
        System.out.println(myChar+" - --- "+myUnicode);
        char myCopyRightChar = '\u00A9';
        System.out.println(myCopyRightChar);
        boolean myTrue = true;
        boolean myFalse = false;
        boolean isCustomerOverTwentyOne = true;
        System.out.println(myTrue+" ---- " + myFalse+" ----- "+isCustomerOverTwentyOne);
    }
}
