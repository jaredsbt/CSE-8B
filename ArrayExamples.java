import tester.*;

class Pair {
    int a;
    int b;

    Pair(int a, int b){this.a = a; this.b = b;}
}

class ArrayExamples {
    public static void main(String [] args) { }

    String joinWith(String[] args, String seperator) {
        String joined = String.join(seperator, args);
        return joined; 
    }

    boolean allTrue(boolean[] args) {
        // int truths = 0;
        for(int i = 0; i < args.length; i++) {
            if(args[i] == false) {return false;}
        }
        return true;
    }

    boolean allWithinRange(Double[] nums, Double low, Double high) {
        if(nums.length == 0) {return true;}
        else {for(int i = 0; i < nums.length; i++) {if(nums[i] <= low || nums[i] >= high) {return false;}}
        }
        return true;
    }

    Pair maxmin(int[] nums) {
        int a = nums[0];
        int b = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < a) {a = nums[i];}
            if(nums[i] > b) {b = nums[i];}
        }
        return new Pair(a, b);
    }

    String earliest(String[] strs) {
        String letter = strs[0];
        for(int i = 1; i < strs.length; i++) {
            if(strs[i].compareTo(letter) < 0) {letter = strs[i];}
        }
        return letter;
    }

    int lookup(String[] keys, int[] values, String key) {
        for(int i = 0; i < keys.length; i++) {
            if(key.equals(keys[i])) {return values[i];}
        }
        return -1;
    }

    String[] join1 = {"a","b","c"};
    String[] join2 = {"1", "2", "3"};
    String[] join3 = {"C", "S", "E"};

    boolean testjoinWith(Tester t) {
        return t.checkExpect(this.joinWith(join1, ":"), "a:b:c") &&
               t.checkExpect(this.joinWith(join2, "."), "1.2.3") &&
               t.checkExpect(this.joinWith(join3, "-"), "C-S-E");
    }

    boolean[] truths = {true, true, true};
    boolean[] lies = {false, false, false};
    boolean[] hiddenLies = {true, false, true};

    boolean testallTrue(Tester t) {
        return t.checkExpect(this.allTrue(truths), true) &&
               t.checkExpect(this.allTrue(lies), false) &&
               t.checkExpect(this.allTrue(hiddenLies), false);
    }

    Double[] dbls1 = {2.0, 3.0, 4.0};
    Double[] dbls2 = {0.0, 3.0, 8.0};
    Double[] dbls3 = {20.0, 10.0, 1.0};

    boolean testallWithinRange(Tester t) {
        return t.checkExpect(this.allWithinRange(dbls1, 1.0, 5.0), true) &&
               t.checkExpect(this.allWithinRange(dbls2, 1.0, 10.0), false) &&
               t.checkExpect(this.allWithinRange(dbls3, 1.0, 10.0), false);
    }

    int[] nums1 = {1, 2, 3, 4, 5};
    int[] nums2 = {20, 40, 60};
    int[] nums3 = {0, 20, 3};

    Pair one = new Pair(1,5);
    Pair two = new Pair(20, 60);
    Pair three = new Pair(0,20);

    boolean testmaxmin(Tester t) {
        return t.checkExpect((this.maxmin(nums1)), one) &&
               t.checkExpect((this.maxmin(nums2)), two) &&
               t.checkExpect(this.maxmin(nums3), three);
    }

    String[] letters1 = {"b", "z", "a"};
    String[] letters2 = {"r", "c", "b"};
    String[] letters3 = {"l", "a", "b"};

    boolean testEarliest(Tester t) {
        return t.checkExpect(this.earliest(letters1), "a") &&
               t.checkExpect(this.earliest(letters2), "b") &&
               t.checkExpect(this.earliest(letters3), "a");
    }

    String[] keys1 = {"UCSD", "UCI", "UCLA"};
    String[] keys2 = {"Cookies", "Pizza", "IceCream"};
    String[] keys3 = {"La Jolla", "San Bernardino"};

    int[] values1 = {123, 333, 222};
    int[] values2 = {3, 5, 7};
    int[] values3 = {92093, 92346};

    boolean testlookup(Tester t) {
        return t.checkExpect(this.lookup(keys1, values1, "UCSD"), 123) &&
               t.checkExpect(this.lookup(keys2, values2, "Pizza"), 5) &&
               t.checkExpect(this.lookup(keys3, values3, "San Bernardino"), 92346);
    }

}
