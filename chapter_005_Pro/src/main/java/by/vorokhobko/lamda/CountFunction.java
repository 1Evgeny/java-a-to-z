package by.vorokhobko.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class CountFunction {

    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(function.apply((double)i));
        }
        return list;
    }
}
