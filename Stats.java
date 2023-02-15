public class Stats {
    public static void main(String args[]) {
        double product = 1.0;
        double sum = 0.0;
        for(int i = 1; i < args.length; i++) {
            if (args[0].equals("--product")) {product = product * Double.parseDouble(args[i]); if(i == args.length - 1) {System.out.println(product);}}
                
            else if(args[0].equals("--mean")) {sum += Double.parseDouble(args[i]); if(i == args.length - 1) {System.out.println(sum / (args.length - 1));}}
                
            else if (args[0].equals("--total")) {sum += Double.parseDouble(args[i]); if(i == args.length - 1) {System.out.println(sum);}}
                
            else if (args[0].equals("--max")) {if(Double.parseDouble(args[i]) >= sum) {sum = Double.parseDouble(args[i]);} if(i == args.length - 1) {System.out.println(sum);}}
                
            else if (args[0].equals("--min")) {if(Double.parseDouble(args[i]) <= sum) {sum = Double.parseDouble(args[i]);} if(i == args.length - 1) {System.out.println(sum);}}
                
            else {System.out.println("Bad option " + args[0]); break;}
        }
    }
}
