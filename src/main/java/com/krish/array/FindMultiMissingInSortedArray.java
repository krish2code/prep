package com.krish.array;

public class FindMultiMissingInSortedArray {

    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, 2, 3, 4, 5, 6};

        for(int value: findMissing(arr)) {
            System.out.println(value);
        }


    }

    private static final int[] findMissing(int[] data) {
        if (data == null || data.length <= 1) {
            return new int[0];
        }
        int first = data[0];
        int last = data[data.length - 1];
        int[] missing = new int[last - first - data.length + 1];
        int missingCursor = 0;
        int expect = first;
        for (int value : data) {
            while (expect < value) {
                missing[missingCursor] = expect;
                missingCursor++;
                expect++;
            }
            expect++;
        }
        return missing;
    }

}
