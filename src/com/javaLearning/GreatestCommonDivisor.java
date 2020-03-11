package com.javaLearning;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        getGreatestCommonDivisor(25,15);
        getGreatestCommonDivisor(12,30);
        getGreatestCommonDivisor(9,18);
        getGreatestCommonDivisor(81,153);
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10) {
            return -1;
        }
        int highestN = first > second ? first : second;
        for (int i = highestN; i >= 1; i-- ) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return -1;
    }
}