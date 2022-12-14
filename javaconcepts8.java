class specificArrayInt{
    int a[];
    specificArrayInt(int a[]){
        this.a=a;
    }
    void printInt(){
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    void reverseInt(){
        int j=a.length-1;
        for(int i=0;i<j;i++){
            int temp;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
    }
}

public class dsa8 {
    public static void main(String[] args){
        int ar[]={1,2,3,4};
        specificArrayInt aobj=new specificArrayInt(ar);
        aobj.printInt();
        aobj.reverseInt();
        aobj.printInt();
    }   
}
