
/***
 * # Top 10 Exception
 * 1. NullPointerException
 * 2. ArrayIndexOutOfBoundException
 * 3. StackOverFlowException
 * 4. ClassCastException
 * 5. IllegalArgumentException
 * 6. NumberFormatException
 * 7. IllegalStateException
 * 8. NoClassDefFoundException
 * 9. AssertException
 * 10. ArithmaticException
 *
 */


public class Type1ex {
    public static void main(String[] args) throws Exception {
//        try {
//            doSomething();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        doSomething();
    }

    public static void doSomething() throws Exception {
//        try {
//            doSomethingElse();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        doSomethingElse();
    }

    private static void doSomethingElse() throws Exception {
        doSomethingSomethingElse();
    }

    private static void doSomethingSomethingElse() throws Exception {
        throw new Exception();
    }


}
