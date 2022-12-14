class Person{
    String name;
    int marks;
    Person(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}

public class dsa4{
    public static <T> void swap(Object x,Object y) {
        System.out.println(x);
        Object temp=x;
        x=y;
        y=temp;
    }
    public static void main(String[] args) {
        Person p1=new Person("Summit",99);
        Person p2=new Person("Rahul",66);
        System.out.println("x="+p1.marks+" "+"y="+p2.marks);
        swap(p1,p2);
        System.out.println("x="+p1.marks+" "+"y="+p2.marks);
    }
}
