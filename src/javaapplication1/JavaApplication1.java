package javaapplication1;

import java.util.HashMap;

public class JavaApplication1 {

    public static void main(String[] args) {
        int[] vector = {1,4,7,1,1,8,4,1,4,9,100,-4};
        Histogram histo = new Histogram(vector);
        
        HashMap<Integer, Integer> histogram = histo.getHistograma(vector);
        System.out.println(histogram);
    }
}