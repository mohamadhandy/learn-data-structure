package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] newArrays = {1, 2, 3, 4, 5, 10};
        System.out.println(newArrays[1]);
        newArrays[1] = -990;
        int target = 11000;
        System.out.println(newArrays[1]);
        for (int i = 0; i < newArrays.length; i++) {
            if (newArrays[i] == target) {
                System.out.println(i);
                break;
            }
        }
        int index5 = Arrays.binarySearch(newArrays, target);
        System.out.println("hasil index5 " + index5);
        int[] sampleArray = {100, 121, 12313, 1, 123103, 33};
        int[] newSampleArray = {17, 11, 10, 6, 7, 12, 90};
        int[] failedSampleArray = {17, 11, 9, 20, 12, 10, 13};
        int[] newArrangeArr = {3, 2, 7, 10, 12, 5, 6, 8};
        System.out.println(findMaximum(sampleArray));
        System.out.println(findMinimum(sampleArray));
        System.out.println(findPlusArray(newSampleArray));
        System.out.println(findPlusArray(failedSampleArray));
        System.out.println(findAverage(failedSampleArray));
        findEvenElements(sampleArray);
        findEvenElements(newSampleArray);
        rearrangeArray(newArrangeArr);
        System.out.println();
        rearrangeArray(new int[]{1, 2, 3, 4, 5});
        System.out.println();
        rearrangeArray(new int[]{2, 4, 6, 8, 10});
        System.out.println();
        rearrangeArray(new int[]{1, 3, 5, 7, 9});
        System.out.println();
        rearrangeArray(new int[]{6, 7, 8, 9, 10});
        System.out.println();
        rearrangeArray(new int[]{3, 2, 7, 9, 11, 10, 12, 5, 6, 8});
        System.out.println();
        System.out.println(fastestWaySecondSmallestElementFromArray(new int[]{3, 2, 7, 9, 11, 10, 12, 5, 6, 8}));
        System.out.println(hardWaySecondSmallestElementFromArray(new int[]{3, 2, 7, 9, 11, 10, 12, 5, 6, 8}));
        // soal karyawan UTS filkom
        Karyawan karyawan1 = new Karyawan("0001", "muhlis", "veteran", "direktur");
        Karyawan karyawan2 = new Karyawan("0002", "dian", "tangerang", "sekretaris");
        Karyawan[] daftarKaryawan = new Karyawan[2];
        daftarKaryawan[0] = karyawan1;
        daftarKaryawan[1] = karyawan2;
        for (Karyawan j: daftarKaryawan) {
            j.getProfil();
        }
        System.out.println(fakeBinary("1234566"));
        System.out.println(Codewars.sentenceSmash("hello!!@!", "world", "this!!", "is", "great"));
    }

    public static int findMaximum(int[] sampleArray) {
        int result = -1;
        for (int j : sampleArray) {
            if (j > result) {
                result = j;
            }
        }
        return result;
    }

    public static int findMinimum(int[] sampleArray) {
        int result = sampleArray[0];
        for (int i = sampleArray.length - 1; i >=0; i--) {
            if (result > sampleArray[i]) {
                result = sampleArray[i];
            }
        }
        return result;
    }

    public static String findPlusArray(int[] sampleArray) {
        String resultString = "";
        int target = sampleArray[0];
        for (int i = 1; i < sampleArray.length - 1; i++) {
            for (int j = i + 1; j < sampleArray.length - 1; j++) {
                if (target == sampleArray[i] + sampleArray[j]) {
                    resultString += sampleArray[i] + "," + sampleArray[j] + " ";
                }
            }
        }
        if (resultString.equals("")) {
            return "-1";
        }
        return resultString;
    }

    public static double findAverage(int[] sampleArray) {
        double result = 0;
        for (int j : sampleArray) {
            result += j;
        }
        result /= sampleArray.length;
        return result;
    }

    public static void findEvenElements(int[] sampleArray) {
        int counter = 0;
        for (int i = sampleArray.length - 1; i >= 0; i --) {
            if (sampleArray[i] % 2 == 0) {
                counter ++;
                System.out.print(sampleArray[i] + ", ");
            }
        }
        System.out.println("Total even number: " + counter);
    }

    public static void rearrangeArray(int[] sampleArray) {
        int evenPointer = 0;
        for (int i = 0; i < sampleArray.length; i++) {
            if (sampleArray[i] % 2 == 0) {
                int temp = sampleArray[i];
                for (int j = i; j > evenPointer; j--) {
                    sampleArray[j] = sampleArray[j-1];
                }
                sampleArray[evenPointer] = temp;
                evenPointer++;
            }
        }
        for (int j : sampleArray) {
            System.out.print(j + ", ");
        }
    }

    public static int fastestWaySecondSmallestElementFromArray(int[] sampleArray) {
        Arrays.sort(sampleArray);
        return sampleArray[1];
    }
    public static int hardWaySecondSmallestElementFromArray(int[] sampleArray) {
        for (int i = 0; i < sampleArray.length; i++) {
            for (int j = i; j < sampleArray.length; j++) {
                if (sampleArray[i] > sampleArray[j]) {
                    int temporaryVal = sampleArray[i];
                    sampleArray[i] = sampleArray[j];
                    sampleArray[j] = temporaryVal;
                }
            }
        }
        for (int j : sampleArray) {
            System.out.print(j);
        }
        System.out.println();
        return sampleArray[1];
    }

    // codewars
    public static String fakeBinary(String numberString) {
        String result = "";
        for (int i = 0; i < numberString.length(); i++) {
            switch(numberString.charAt(i)) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                    result += "0";
                    break;
                default:
                    result += "1";
            }
        }
        return result;
    }
}