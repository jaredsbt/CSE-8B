public class AveragePositive {
    public static void main(String args[]) {
        if(args.length == 0) {System.out.println(0);}
        double sum = 0.0;
        double totalPositives = 0.0;
        for(int i = 0; i < args.length; i++) {
            if(Double.parseDouble(args[i]) > 0.0) {
                sum = sum + Double.parseDouble(args[i]);
                totalPositives = totalPositives + 1.0;
            } 
        }
        if(args.length > 0 && totalPositives == 0.0) {System.out.println(0);}
        if(totalPositives > 0.0) {
            double average = sum / totalPositives;     
            System.out.println(average);   
        }
    }
}

