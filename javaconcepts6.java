public class dsa6 {
    public static <T> void VarargsMethod1(int ...v){
        System.out.println("Number of arguments"+v.length);
        for(int x:v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int x[]={1,3,5,7};
        int y[]={2,4};
        int z[]={};
        VarargsMethod1(x);
        VarargsMethod1(y);
        VarargsMethod1(z);
    }
}

