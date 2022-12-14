class GenericArray<T>{
    T a[];
    GenericArray(T x[]){
        a=x;
    }
    // T getData(int i){
    //     return a[i];
    // }
    void printData(){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    void reverseArray(){
        int front=0,rear=a.length-1;
        T temp;
        while(front<rear){
            temp=a[rear];
            a[rear]=a[front];
            a[front]=temp;
            front++;
            rear--;
        }
    }
}

public class dsa10 {
    public static void main(String[] args) {
        Integer x[]={10,20,30,40,50};
        GenericArray<Integer> aInt=new GenericArray<Integer> (x);
        aInt.printData();
        aInt.reverseArray();
        aInt.printData();
    }
}
