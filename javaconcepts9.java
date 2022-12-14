class GenericClass<T>{
    private T x;
    GenericClass(T t){
        x=t;
    }
    void printData(){
        System.out.println(x);
    }
}

public class dsa9 {
    public static void main(String[] args){
        GenericClass<String> a=new GenericClass<String> ("Java");
        a.printData();
        GenericClass<Integer> b=new GenericClass<Integer> (172);
        b.printData();
        GenericClass<Double> c=new GenericClass<Double> (7.142);
        c.printData();
    } 
}
