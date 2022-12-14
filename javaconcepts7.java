public class dsa7 {
    public static <T> void VarargsMethod1(Object ...v){
        System.out.println("Number of arguments"+v.length);
        for(Object x:v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        VarargsMethod1(1,"String",5.5,true);
        VarargsMethod1(2,4);
        VarargsMethod1();
    }
}