package javaapplication1;

import java.util.HashMap;

public class JavaApplication1 {

    public static void main(String[] args) {
        Integer[] vector = {1,4,7,1,1,8,4,1,4,9,100,-4};
        String[] vector1 = {"Ana", "Juan", "Pedro", "Ana", "Pedro"};
        Histogram <String> histogram = CalculaHistograma.calcHisto(vector1);
        for (Object K : histogram.keySet()) {
            System.out.println(K + "->" + histogram.get(K));
        }
    }
}