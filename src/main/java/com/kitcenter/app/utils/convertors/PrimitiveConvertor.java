package com.kitcenter.app.utils.convertors;

public class PrimitiveConvertor {
    public char floatToChar (float float1){
        char char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
        return char1;
    }

    public char intToChar (int int1){
        char char1 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
        return char1;
    }

    public char charToInt (char char3){
        int int2 = (int) char3;
        System.out.println("Input char value is " + char3 + ". Output int value is " + int2);
        return char3;
    }

}

