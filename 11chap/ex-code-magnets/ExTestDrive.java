class MyEx extends Exception{

}

/**
 * The class ExTestDrive is part of an exercise in chap11 of head first java.
 * It illustrates the basics of exception handling.
 * Usage: java  ExTestDrive <yes | or any other string of characters>
*/
public class ExTestDrive {

    static void doRisky(String t) throws MyEx {
        if ("yes".equals(t)) {
            throw new MyEx();
        
        }
        System.out.print("r");
    }
    
    public static void main(String[] args) {
        String test = args[0];
        
        System.out.print("t");
        System.out.print("h");
        try {
            doRisky(test);
            System.out.print("o");
        } catch (MyEx e) {
            System.out.print("a");
        }
        finally {
            System.out.print("w");
            System.out.println("s");
        }
    }
}
