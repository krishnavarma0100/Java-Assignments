public class javaconcepts{
    public static void main(String[] args){
        System.out.println("Let's study some java concepts");

        // Data Types in Java
        String language="Java";
        int word=4;
        float val=4.0f;
        char firstChar='J';
        boolean javac=true;
        System.out.println(language+" "+word+" "+val+" "+firstChar+" "+javac);


        // Type Casting
        int intCast1=4;
        double dobCast1=intCast1;
        System.out.println(intCast1+" "+dobCast1);

        double dobCast2=10.99d;
        int intCast2=(int) dobCast2;
        System.out.println(intCast2+" "+dobCast2);


        // Java Operators
        int a=100+40;
        int b=a+10;
        b+=50;
        b--;
        System.out.println(a+" "+b+" "+(a>=b)+" "+(a!=b)+" "+(a<b || 200<b)+" "+(a<b && 200<b));


        // Java Strings
        String lang="Java";
        System.out.println("The String is of length :"+lang.length());
        System.out.println("The String is UPPERCASE :"+lang.toUpperCase());
        System.out.println("The String is lowercase :"+lang.toLowerCase());
        System.out.println("Index of 'v' in Java :"+lang.indexOf('a'));

        String last="Programming";
        System.out.println(lang.concat(last));


        // Java Maths
        int minval=Math.min(5,10);
        int maxval=Math.max(5,10);
        float sqroot=(float) Math.sqrt(66);
        float value=(float) Math.abs(-4.6);
        int random=(int) (Math.random()*100);
        System.out.println(sqroot+" "+value+" "+random);


        // Java Conditions
        char first_Char='b';
        char second_Char='a';
        System.out.println(a>b?"a is greater than b":"b is greater than a");

        char third_Char='c';
        if(first_Char>second_Char && first_Char>third_Char){
            System.out.println("b is greater than a and c");
        }
        else if(second_Char>first_Char && second_Char>third_Char){
            System.out.println("a is greater than b and c");
        }
        else{
            System.out.println("c is greater than a and b");
        }

        switch(first_Char){
            case 'a':
                System.out.println("first_Char : "+first_Char);
                break;
            case 'b':
                System.out.println("first_Char : "+first_Char);
                break;
            case 'c':
                System.out.println("first_Char : "+first_Char);
                break;
            default:
                System.out.println("first_Char value is other than cases");
        }


        // Java Loops
        int i=0;
        while(i<5){
            System.out.print(i+" ");
            i++;
        }
        System.out.println(" : while loop");

        for(i=0;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println(" : for loop");


        // Java Arrays
        String[] languages={"Java","C","C++","React","Spring"};
        for (String it:languages){
            System.out.print(it+" ");
        }
        System.out.println(" : Programming Languages");
        System.out.println(languages[0]);


        // Java break and continue
        for (i=0;i<10;i++){
            if(i==3){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println(" : break statement in use");

        for (i=0;i<10;i++){
            if(i==3){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println(" : continue statement in use");

    }
}