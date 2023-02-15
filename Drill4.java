class Drill4 {

    String phaseOfWater(int temperature) {
        if(temperature >= 100){
            return "vapor";
        } else if((temperature < 100) && (temperature > 0)) {
            return "liquid";
        } else {
            return "solid";
        }
    }

    int maxDifference(int x, int y, int z) { // -1, 5, -2 expected 7 result was 6
        // if (x <= 0 || y <= 0 || z <0) {
        //     if (x <= 0 && y >= z) {
        //         return y - x;
        //     } else if (x <= 0 && y <= z) {
        //         return z - x;
        //     } else if (y <= 0 && x >= z) {
        //         return x - y;
        //     } else if (y <= 0 && x <= z) {
        //         return z - y;
        //     } else if (z <= 0 && y >= x) {
        //         return y - z;
        //     } else if (z <= 0 && y <= x) {
        //         return x - z;
        //     }
        // }
        int diff1 = x - y; // - 4      x = -5; y = -1; z = 4
        int diff2 = x - z; // -9
        int diff3 = y - x; // 4
        int diff4 = y - z; // -1
        int diff5 = z - x; // 2
        int diff6 = z - y; // 1

        if(diff1 >= diff2 && diff1 >= diff3 && diff1 >= diff4 && diff1 >= diff5 && diff1 >= diff6) {
            return diff1;
        } else if (diff2 >= diff1 && diff2 >= diff3 && diff2 >= diff4 && diff2 >= diff5 && diff2 >= diff6) {
            return diff2;
        } else if (diff3 >= diff1 && diff3 >= diff2 && diff3 >= diff4 && diff3 >= diff5 && diff3 >= diff6) {
            return diff3;
        } else if (diff4 >= diff2 && diff4 >= diff3 && diff4 >= diff1 && diff4 >= diff5 && diff4 >= diff6) {
            return diff4;
        } else if (diff5 >= diff2 && diff5 >= diff3 && diff5 >= diff1 && diff5 >= diff4 && diff5 >= diff6) {
            return diff5;  
        } else {return diff6;}
        
        // if ((x >= y) && (y >= z)) {
        //     int diference = x - y;
        //     return diference;
        // } else if((x >= z) && (z >= y)) {
        //     int diference = x - z;
        //     return diference;
        // } else if ((y >= x) && (x >= z)) {
        //     int diference = y - x;
        //     return diference;
        // } else if ((y >= z) && (z >= x)) {
        //     return y - z;
        // } else if ((z >= x) && (x >= y)) {
        //     return z - x;
        // } else {
        //     return z - y;
        // }
    }

    double ringArea(double radius1, double radius2) {
        double innerCircle = Math.PI * (radius1 * radius1);
        double outterCircle = Math.PI * (radius2 * radius2);
        if(innerCircle > outterCircle) {
            return innerCircle - outterCircle;
        } else {
            return outterCircle - innerCircle;
        }
    }

    String phase1 = this.phaseOfWater(-34); // solid
    String phase2 = this.phaseOfWater(50); // liquid
    String phase3 = this.phaseOfWater(101); // vapor

    int difference1 = this.maxDifference(-6,-5, 5);  // 11
    int difference2 = this.maxDifference(5,6, 7); // 2
    int difference3 = this.maxDifference(-3,-3, 4); // 7
    int difference4 = this.maxDifference(-1,5, -2);

    double area1 = this.ringArea(25, 3); // 1935
    double area2 = this.ringArea(-77, 0); // 1826
    double area3 = this.ringArea(100, 100); // 0
}