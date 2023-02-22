import java.util.ArrayList;
import java.util.List;
import tester.*;

class LongStrings {
    String[] longString(String[] args, int n) {
        if(args.length == 0 || n <= 0) {return new String[] {" "};}
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < args.length; i++) {
            if(args[i].length() >= n) {
                list.add(args[i]);
            }
        }
        String[] strs = new String[ list.size() ];
        list.toArray( strs );
        return strs;
    }

    String[] test1 = {"hello," ,"a" ,"my name" ,"not","is Jar","ed","ed how about yours?"};
    String[] test2 = {"what" ,"are", "20", "are you doing?"};
    String[] test3 = {"sdasdads", "asdasdj", "adadj"};
    String[] test4 = {};

    boolean testlongString(Tester t) {
        return t.checkExpect(this.longString(test1, 4), new String[] {"hello,", "my name", "is Jar", "ed how about yours?"}) &&
               t.checkExpect(this.longString(test2, 4), new String[] {"what", "are you doing?"}) &&
               t.checkExpect(this.longString(test3, 0), new String[] {" "}) &&
               t.checkExpect(this.longString(test4, 5), new String[] {" "});


    }
}



