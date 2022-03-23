package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {2,6,1,4,7,9,34,57,1,6,-100} ;
        timMax(array);
    }
    static void timMax(int[] arr){
        int max = arr[0];
        for (int i = 1 ;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max == "+ max);
    }
}
