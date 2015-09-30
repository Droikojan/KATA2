package javaapplication1;

import java.util.HashMap;

public class Histogram <T> {

    private final T[] vector;

    public Histogram(T[] vector) {
        this.vector = vector;
    }


    
    public HashMap<T, Integer> getHistograma(){
        HashMap<T, Integer> histograma = new HashMap<>();
        for (int i = 0; i < vector.length; i++) {
            if(!histograma.containsKey(vector[i])){
                histograma.put(vector[i], 0);
            }
            histograma.put(vector[i], histograma.get(vector[i]) + 1);
        }
        return histograma;
    }
}
