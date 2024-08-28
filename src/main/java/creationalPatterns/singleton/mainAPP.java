package creationalPatterns.singleton;

public class mainAPP {
    public static void main(String args[]){
        Logger logger = Logger.getInstnace();
        Logger logger2 = Logger.getInstnace();
        System.out.println("logger created");
        System.out.println(logger.equals(logger2));
    }
}
