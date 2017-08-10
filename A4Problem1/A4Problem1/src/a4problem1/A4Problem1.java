/**
 * *******************************************************************
 * Purpose/Description: a radix sort of an array and using arrayLists for 
 * the buckets
 * Author’s Panther ID: 2056125
 * Certification:
 * I hereby certify that this work is my own and none of it is the work of
 * any other person.
 *******************************************************************
 */
package a4problem1;

import java.util.ArrayList;

/**
 *
 * @author Ace
 */
public class A4Problem1 {

    public static void radixSort(int arr[]) {
        int numElement = arr.length;
        int m = 10;
        int n = 1;
        int sigfig = 0;
        int bigNum = 0;
        int count = 0;

        ArrayList<Integer> toSort = new ArrayList<>();

        for (int i = 0; i < numElement; i++) {
            toSort.add(arr[i]);
        }

        for (int i = 0; i < numElement; i++) {
            if (arr[i] > bigNum) {
                bigNum = arr[i];
            }
        }

        for (int i = 0; i < bigNum;) {
            bigNum = bigNum / 10;
            sigfig = sigfig + 1;
        }

        ArrayList<Integer> bucket0 = new ArrayList<>();
        ArrayList<Integer> bucket1 = new ArrayList<>();
        ArrayList<Integer> bucket2 = new ArrayList<>();
        ArrayList<Integer> bucket3 = new ArrayList<>();
        ArrayList<Integer> bucket4 = new ArrayList<>();
        ArrayList<Integer> bucket5 = new ArrayList<>();
        ArrayList<Integer> bucket6 = new ArrayList<>();
        ArrayList<Integer> bucket7 = new ArrayList<>();
        ArrayList<Integer> bucket8 = new ArrayList<>();
        ArrayList<Integer> bucket9 = new ArrayList<>();

        int test;

        while (count < sigfig) {
            for (int a = 0; a < toSort.size(); a++) {

                test = toSort.get(a) % m;
                
                test = test / n;

                if (test == 0) {
                    bucket0.add(toSort.get(a));
                }
                if (test == 1) {
                    bucket1.add(toSort.get(a));
                }
                if (test == 2) {
                    bucket2.add(toSort.get(a));
                }
                if (test == 3) {
                    bucket3.add(toSort.get(a));
                }
                if (test == 4) {
                    bucket4.add(toSort.get(a));
                }
                if (test == 5) {
                    bucket5.add(toSort.get(a));
                }
                if (test == 6) {
                    bucket6.add(toSort.get(a));
                }
                if (test == 7) {
                    bucket7.add(toSort.get(a));
                }
                if (test == 8) {
                    bucket8.add(toSort.get(a));
                }
                if (test == 9) {
                    bucket9.add(toSort.get(a));
                }
            }
            

            toSort.clear();

            for (int i = 0; i < bucket0.size(); i++) {
                toSort.add(bucket0.get(i));

            }
            for (int i = 0; i < bucket1.size(); i++) {
                toSort.add(bucket1.get(i));
            }
            for (int i = 0; i < bucket2.size(); i++) {
                toSort.add(bucket2.get(i));
            }
            for (int i = 0; i < bucket3.size(); i++) {
                toSort.add(bucket3.get(i));
            }
            for (int i = 0; i < bucket4.size(); i++) {
                toSort.add(bucket4.get(i));
            }
            for (int i = 0; i < bucket5.size(); i++) {
                toSort.add(bucket5.get(i));
            }
            for (int i = 0; i < bucket6.size(); i++) {
                toSort.add(bucket6.get(i));
            }
            for (int i = 0; i < bucket7.size(); i++) {
                toSort.add(bucket7.get(i));
            }
            for (int i = 0; i < bucket8.size(); i++) {
                toSort.add(bucket8.get(i));
            }
            for (int i = 0; i < bucket9.size(); i++) {
                toSort.add(bucket9.get(i));
            }

            for (int i = 0; i < toSort.size(); i++) {
                bucket0.clear();
            }
            bucket1.clear();
            bucket2.clear();
            bucket3.clear();
            bucket4.clear();
            bucket5.clear();
            bucket6.clear();
            bucket7.clear();
            bucket8.clear();
            bucket9.clear();
            
            m = m * 10;
            n = n * 10;
            count = count + 1;

        }
        
        for (int i = 0; i < toSort.size(); i++)
        {
            arr[i] = toSort.get(i);
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{101,12,39,25,7,1};

        printArr(arr);
        System.out.println("test");

        radixSort(arr);

        printArr(arr);

    }

}
