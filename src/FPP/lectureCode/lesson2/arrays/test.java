package FPP.lectureCode.lesson2.arrays;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] smallPrimes = {7,11,5,2,3};
        int[] smallPrimesCopy = Arrays.copyOf(smallPrimes, smallPrimes.length);
        System.out.println(smallPrimes == smallPrimesCopy);
        System.out.println(Arrays.equals(smallPrimes, smallPrimesCopy));
        System.out.println(smallPrimesCopy);
        System.out.println(Arrays.toString(smallPrimes));

        Arrays.sort(smallPrimes);
        System.out.println(Arrays.toString(smallPrimes));

        int[][] mat = new int[3][];

        mat[0] = new int[2];
        mat[1] = new int[3];
        mat[2] = new int[5];

        for(int[] a: mat){
            for(int b: a){
                System.out.println(b + " :: ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(mat));
    }
}
