/* *** This file is given as part of the programming assignment. *** */

public class Main {

    public static void main(String [] args) {

        // instantiate some elements
 For r1 = new For(1, 4, 1);
        For r2 = new For(1, 4, -1);
        For r3 = new For(21, 23, 1);
        For r4 = new For(25, 21, -2);
        For r5 = new For(21, 26, 2);
        For r6 = new For(28, 26, 0);
        For r7 = new For(28, 31, 1);
        For r8 = new For(31, 28, -1);
        Fib b1 = new Fib(2, 3, 10);
        Fib b2 = new Fib(0, 1, 10);
        Fib b3 = new Fib(2, 2, 10);
        Fib b4 = new Fib(2, 2, 0);
        Fib b5 = new Fib(0, -1, -10);
        Fib b6 = new Fib(-2, -3, -10);

        countOut();
        // do everything twice just to double check
        for( int i = 0; i < 2; i++) {
            
             System.out.print( "r1" + ":"); 
             System.out.print(r1); 
             System.out.println(":"); 
             System.out.println( "(Seq)r1 instanceof For" + ":" + ((Seq)r1 instanceof For) + ":"); 
             System.out.println( "(Seq)r1 instanceof Fib" + ":" + ((Seq)r1 instanceof Fib) + ":"); 
             System.out.println( "r1.upperBound()" + ":" + (r1.upperBound()) + ":");
            
             System.out.print( "r2" + ":"); 
             System.out.print(r2); 
             System.out.println(":"); 
             System.out.println( "(Seq)r2 instanceof For" + ":" + ((Seq)r2 instanceof For) + ":"); 
             System.out.println( "(Seq)r2 instanceof Fib" + ":" + ((Seq)r2 instanceof Fib) + ":"); 
             System.out.println( "r2.upperBound()" + ":" + (r2.upperBound()) + ":");
            
             System.out.print( "r3" + ":"); 
             System.out.print(r3); 
             System.out.println(":"); 
             System.out.println( "(Seq)r3 instanceof For" + ":" + ((Seq)r3 instanceof For) + ":"); 
             System.out.println( "(Seq)r3 instanceof Fib" + ":" + ((Seq)r3 instanceof Fib) + ":"); 
             System.out.println( "r3.upperBound()" + ":" + (r3.upperBound()) + ":");
            
             System.out.print( "r4" + ":"); 
             System.out.print(r4); 
             System.out.println(":"); 
             System.out.println( "(Seq)r4 instanceof For" + ":" + ((Seq)r4 instanceof For) + ":"); 
             System.out.println( "(Seq)r4 instanceof Fib" + ":" + ((Seq)r4 instanceof Fib) + ":"); 
             System.out.println( "r4.upperBound()" + ":" + (r4.upperBound()) + ":");
            
             System.out.print( "r5" + ":"); 
             System.out.print(r5); 
             System.out.println(":"); 
             System.out.println( "(Seq)r5 instanceof For" + ":" + ((Seq)r5 instanceof For) + ":"); 
             System.out.println( "(Seq)r5 instanceof Fib" + ":" + ((Seq)r5 instanceof Fib) + ":"); 
             System.out.println( "r5.upperBound()" + ":" + (r5.upperBound()) + ":");
            
             System.out.print( "r6" + ":"); 
             System.out.print(r6); 
             System.out.println(":"); 
             System.out.println( "(Seq)r6 instanceof For" + ":" + ((Seq)r6 instanceof For) + ":"); 
             System.out.println( "(Seq)r6 instanceof Fib" + ":" + ((Seq)r6 instanceof Fib) + ":"); 
             System.out.println( "r6.upperBound()" + ":" + (r6.upperBound()) + ":");
            
             System.out.print( "r7" + ":"); 
             System.out.print(r7); 
             System.out.println(":"); 
             System.out.println( "(Seq)r7 instanceof For" + ":" + ((Seq)r7 instanceof For) + ":"); 
             System.out.println( "(Seq)r7 instanceof Fib" + ":" + ((Seq)r7 instanceof Fib) + ":"); 
             System.out.println( "r7.upperBound()" + ":" + (r7.upperBound()) + ":");
            
             System.out.print( "r8" + ":"); 
             System.out.print(r8); 
             System.out.println(":"); 
             System.out.println( "(Seq)r8 instanceof For" + ":" + ((Seq)r8 instanceof For) + ":"); 
             System.out.println( "(Seq)r8 instanceof Fib" + ":" + ((Seq)r8 instanceof Fib) + ":"); 
             System.out.println( "r8.upperBound()" + ":" + (r8.upperBound()) + ":");
            
             System.out.print( "b1" + ":"); 
             System.out.print(b1); 
             System.out.println(":"); 
             System.out.println( "(Seq)b1 instanceof For" + ":" + ((Seq)b1 instanceof For) + ":"); 
             System.out.println( "(Seq)b1 instanceof Fib" + ":" + ((Seq)b1 instanceof Fib) + ":"); 
             System.out.println( "b1.upperBound()" + ":" + (b1.upperBound()) + ":");
            
             System.out.print( "b2" + ":"); 
             System.out.print(b2); 
             System.out.println(":"); 
             System.out.println( "(Seq)b2 instanceof For" + ":" + ((Seq)b2 instanceof For) + ":"); 
             System.out.println( "(Seq)b2 instanceof Fib" + ":" + ((Seq)b2 instanceof Fib) + ":"); 
             System.out.println( "b2.upperBound()" + ":" + (b2.upperBound()) + ":");
            
             System.out.print( "b3" + ":"); 
             System.out.print(b3); 
             System.out.println(":"); 
             System.out.println( "(Seq)b3 instanceof For" + ":" + ((Seq)b3 instanceof For) + ":"); 
             System.out.println( "(Seq)b3 instanceof Fib" + ":" + ((Seq)b3 instanceof Fib) + ":"); 
             System.out.println( "b3.upperBound()" + ":" + (b3.upperBound()) + ":");
            
             System.out.print( "b4" + ":"); 
             System.out.print(b4); 
             System.out.println(":"); 
             System.out.println( "(Seq)b4 instanceof For" + ":" + ((Seq)b4 instanceof For) + ":"); 
             System.out.println( "(Seq)b4 instanceof Fib" + ":" + ((Seq)b4 instanceof Fib) + ":"); 
             System.out.println( "b4.upperBound()" + ":" + (b4.upperBound()) + ":");
            
             System.out.print( "b5" + ":"); 
             System.out.print(b5); 
             System.out.println(":"); 
             System.out.println( "(Seq)b5 instanceof For" + ":" + ((Seq)b5 instanceof For) + ":"); 
             System.out.println( "(Seq)b5 instanceof Fib" + ":" + ((Seq)b5 instanceof Fib) + ":"); 
             System.out.println( "b5.upperBound()" + ":" + (b5.upperBound()) + ":");
            
             System.out.print( "b6" + ":"); 
             System.out.print(b6); 
             System.out.println(":"); 
             System.out.println( "(Seq)b6 instanceof For" + ":" + ((Seq)b6 instanceof For) + ":"); 
             System.out.println( "(Seq)b6 instanceof Fib" + ":" + ((Seq)b6 instanceof Fib) + ":"); 
             System.out.println( "b6.upperBound()" + ":" + (b6.upperBound()) + ":");
        }
        //check a bit more
        Seq x;
        x = b3;
        
             System.out.print( "x" + ":"); 
             System.out.print(x); 
             System.out.println(":"); 
             System.out.println( "(Seq)x instanceof For" + ":" + ((Seq)x instanceof For) + ":"); 
             System.out.println( "(Seq)x instanceof Fib" + ":" + ((Seq)x instanceof Fib) + ":"); 
             System.out.println( "x.upperBound()" + ":" + (x.upperBound()) + ":");
        x = r4;
        
             System.out.print( "x" + ":"); 
             System.out.print(x); 
             System.out.println(":"); 
             System.out.println( "(Seq)x instanceof For" + ":" + ((Seq)x instanceof For) + ":"); 
             System.out.println( "(Seq)x instanceof Fib" + ":" + ((Seq)x instanceof Fib) + ":"); 
             System.out.println( "x.upperBound()" + ":" + (x.upperBound()) + ":");
        countOut();
        System.exit(0);
    }
    private static void countOut() {
        System.out.println( "created " + Seq.getCount() + " Seq");
        System.out.println( "created " + For.getCount() + " For");
        System.out.println( "created " + Fib.getCount() + " Fib");
    }
}
