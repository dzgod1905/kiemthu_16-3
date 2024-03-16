package com.example;

public class App {
    private double calDistance(int Ox, int Oy, int x, int y) {
        double res = 0.0;
        double val1 = (Ox - x) * (Ox - x);
        double val2 = (Oy - y) * (Oy - y);
        res = Math.sqrt(val1 + val2);
        return res;
    }

    public String checkPoint(int Ox, int Oy, int R, int x, int y) {
        double D = calDistance(Ox, Oy, x, y);
        double tmp = R;
        if (Double.compare(D, tmp) < 0)
            return "Điểm cho trước nằm trong đường tròn";
        if (Double.compare(D, tmp) == 0)
            return "Điểm cho trước nằm trên đường tròn";
        return "Điểm cho trước nằm ngoài đường tròn";
    }
}
