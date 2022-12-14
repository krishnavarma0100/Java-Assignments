public class dsa2 {
    static <T> void genericPrint(T t){
        System.out.println(t);
    }
    public static void main(String[] args){
        genericPrint(103);
        genericPrint("Joy with Java");
        genericPrint(1.141234);
    }
}
