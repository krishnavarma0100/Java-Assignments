class dsa1<T>{
    void genericPrint(T t){
        System.out.println(t);
    }
    public static void main(String[] args){
        dsa1 aobj=new dsa1();
        aobj.genericPrint(103);
        aobj.genericPrint("Joy with Java");
        aobj.genericPrint(1.141234);
    }
}