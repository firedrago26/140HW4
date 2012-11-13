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
        For s6 = new For(21, 26, 0);
        For s7 = new For(26, 26, 1);
        Fib b1 = new Fib(2, 3, 10);
        Fib b2 = new Fib(0, 1, 10);
        Fib b3 = new Fib(2, 2, 10);
        Fib b4 = new Fib(2, 2, 0);
        Fib b5 = new Fib(0, -1, -10);
        Fib b6 = new Fib(-2, -3, -10);
        Fib b7 = new Fib(2, -2, 3);
        Fib b8 = new Fib(0, 1, 21);
        Fib b9 = new Fib(2, -1, 10);
        Fib c1 = new Fib(0, -1, 10);
        Fib c2 = new Fib(0, 0, 10);
        Fib c3 = new Fib(0, 0, -10);
        Fib c4 = new Fib(0, 0, 0);
        Fib c5 = new Fib(0, 1, 0);
        Fib c6 = new Fib(0, -1, 0);
        Fib c7 = new Fib(1, 0, 10);
        Fib c8 = new Fib(-1, 0, 10);
        Fib c9 = new Fib(-1, 0, -10);
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
            
             System.out.print( "s6" + ":"); 
             System.out.print(s6); 
             System.out.println(":"); 
             System.out.println( "(Seq)s6 instanceof For" + ":" + ((Seq)s6 instanceof For) + ":"); 
             System.out.println( "(Seq)s6 instanceof Fib" + ":" + ((Seq)s6 instanceof Fib) + ":"); 
             System.out.println( "s6.upperBound()" + ":" + (s6.upperBound()) + ":");
            
             System.out.print( "s7" + ":"); 
             System.out.print(s7); 
             System.out.println(":"); 
             System.out.println( "(Seq)s7 instanceof For" + ":" + ((Seq)s7 instanceof For) + ":"); 
             System.out.println( "(Seq)s7 instanceof Fib" + ":" + ((Seq)s7 instanceof Fib) + ":"); 
             System.out.println( "s7.upperBound()" + ":" + (s7.upperBound()) + ":");
            
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
            
             System.out.print( "b7" + ":"); 
             System.out.print(b7); 
             System.out.println(":"); 
             System.out.println( "(Seq)b7 instanceof For" + ":" + ((Seq)b7 instanceof For) + ":"); 
             System.out.println( "(Seq)b7 instanceof Fib" + ":" + ((Seq)b7 instanceof Fib) + ":"); 
             System.out.println( "b7.upperBound()" + ":" + (b7.upperBound()) + ":");
            
             System.out.print( "b8" + ":"); 
             System.out.print(b8); 
             System.out.println(":"); 
             System.out.println( "(Seq)b8 instanceof For" + ":" + ((Seq)b8 instanceof For) + ":"); 
             System.out.println( "(Seq)b8 instanceof Fib" + ":" + ((Seq)b8 instanceof Fib) + ":"); 
             System.out.println( "b8.upperBound()" + ":" + (b8.upperBound()) + ":");
            
             System.out.print( "b9" + ":"); 
             System.out.print(b9); 
             System.out.println(":"); 
             System.out.println( "(Seq)b9 instanceof For" + ":" + ((Seq)b9 instanceof For) + ":"); 
             System.out.println( "(Seq)b9 instanceof Fib" + ":" + ((Seq)b9 instanceof Fib) + ":"); 
             System.out.println( "b9.upperBound()" + ":" + (b9.upperBound()) + ":");
            
             System.out.print( "c1" + ":"); 
             System.out.print(c1); 
             System.out.println(":"); 
             System.out.println( "(Seq)c1 instanceof For" + ":" + ((Seq)c1 instanceof For) + ":"); 
             System.out.println( "(Seq)c1 instanceof Fib" + ":" + ((Seq)c1 instanceof Fib) + ":"); 
             System.out.println( "c1.upperBound()" + ":" + (c1.upperBound()) + ":");
            
             System.out.print( "c2" + ":"); 
             System.out.print(c2); 
             System.out.println(":"); 
             System.out.println( "(Seq)c2 instanceof For" + ":" + ((Seq)c2 instanceof For) + ":"); 
             System.out.println( "(Seq)c2 instanceof Fib" + ":" + ((Seq)c2 instanceof Fib) + ":"); 
             System.out.println( "c2.upperBound()" + ":" + (c2.upperBound()) + ":");
            
             System.out.print( "c3" + ":"); 
             System.out.print(c3); 
             System.out.println(":"); 
             System.out.println( "(Seq)c3 instanceof For" + ":" + ((Seq)c3 instanceof For) + ":"); 
             System.out.println( "(Seq)c3 instanceof Fib" + ":" + ((Seq)c3 instanceof Fib) + ":"); 
             System.out.println( "c3.upperBound()" + ":" + (c3.upperBound()) + ":");
            
             System.out.print( "c4" + ":"); 
             System.out.print(c4); 
             System.out.println(":"); 
             System.out.println( "(Seq)c4 instanceof For" + ":" + ((Seq)c4 instanceof For) + ":"); 
             System.out.println( "(Seq)c4 instanceof Fib" + ":" + ((Seq)c4 instanceof Fib) + ":"); 
             System.out.println( "c4.upperBound()" + ":" + (c4.upperBound()) + ":");
            
             System.out.print( "c5" + ":"); 
             System.out.print(c5); 
             System.out.println(":"); 
             System.out.println( "(Seq)c5 instanceof For" + ":" + ((Seq)c5 instanceof For) + ":"); 
             System.out.println( "(Seq)c5 instanceof Fib" + ":" + ((Seq)c5 instanceof Fib) + ":"); 
             System.out.println( "c5.upperBound()" + ":" + (c5.upperBound()) + ":");
            
             System.out.print( "c6" + ":"); 
             System.out.print(c6); 
             System.out.println(":"); 
             System.out.println( "(Seq)c6 instanceof For" + ":" + ((Seq)c6 instanceof For) + ":"); 
             System.out.println( "(Seq)c6 instanceof Fib" + ":" + ((Seq)c6 instanceof Fib) + ":"); 
             System.out.println( "c6.upperBound()" + ":" + (c6.upperBound()) + ":");
            
             System.out.print( "c7" + ":"); 
             System.out.print(c7); 
             System.out.println(":"); 
             System.out.println( "(Seq)c7 instanceof For" + ":" + ((Seq)c7 instanceof For) + ":"); 
             System.out.println( "(Seq)c7 instanceof Fib" + ":" + ((Seq)c7 instanceof Fib) + ":"); 
             System.out.println( "c7.upperBound()" + ":" + (c7.upperBound()) + ":");
            
             System.out.print( "c8" + ":"); 
             System.out.print(c8); 
             System.out.println(":"); 
             System.out.println( "(Seq)c8 instanceof For" + ":" + ((Seq)c8 instanceof For) + ":"); 
             System.out.println( "(Seq)c8 instanceof Fib" + ":" + ((Seq)c8 instanceof Fib) + ":"); 
             System.out.println( "c8.upperBound()" + ":" + (c8.upperBound()) + ":");
            
             System.out.print( "c9" + ":"); 
             System.out.print(c9); 
             System.out.println(":"); 
             System.out.println( "(Seq)c9 instanceof For" + ":" + ((Seq)c9 instanceof For) + ":"); 
             System.out.println( "(Seq)c9 instanceof Fib" + ":" + ((Seq)c9 instanceof Fib) + ":"); 
             System.out.println( "c9.upperBound()" + ":" + (c9.upperBound()) + ":");
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
        // iterators
        System.out.print( "myprintr(r1,10)" + ":"); 
             myprintr(r1,10); 
             System.out.println(":");
        System.out.print( "myprintr(r2,10)" + ":"); 
             myprintr(r2,10); 
             System.out.println(":");
        System.out.print( "myprintr(r3,10)" + ":"); 
             myprintr(r3,10); 
             System.out.println(":");
        System.out.print( "myprintr(r4,10)" + ":"); 
             myprintr(r4,10); 
             System.out.println(":");
        System.out.print( "myprintr(r5,10)" + ":"); 
             myprintr(r5,10); 
             System.out.println(":");
        System.out.print( "myprintr(s6,10)" + ":"); 
             myprintr(s6,10); 
             System.out.println(":");
        System.out.print( "myprintr(s7,10)" + ":"); 
             myprintr(s7,10); 
             System.out.println(":");
        System.out.print( "myprintb(b1,10)" + ":"); 
             myprintb(b1,10); 
             System.out.println(":");
        System.out.print( "myprintb(b2,10)" + ":"); 
             myprintb(b2,10); 
             System.out.println(":");
        System.out.print( "myprintb(b3,10)" + ":"); 
             myprintb(b3,10); 
             System.out.println(":");
        System.out.print( "myprintb(b4,10)" + ":"); 
             myprintb(b4,10); 
             System.out.println(":");
        System.out.print( "myprintb(b5,10)" + ":"); 
             myprintb(b5,10); 
             System.out.println(":");
        System.out.print( "myprintb(b6,10)" + ":"); 
             myprintb(b6,10); 
             System.out.println(":");
        System.out.print( "myprintb(b7,10)" + ":"); 
             myprintb(b7,10); 
             System.out.println(":");
        System.out.print( "myprintb(b8,10)" + ":"); 
             myprintb(b8,10); 
             System.out.println(":");
        System.out.print( "myprintb(b9,10)" + ":"); 
             myprintb(b9,10); 
             System.out.println(":");
        System.out.print( "myprintb(c1,10)" + ":"); 
             myprintb(c1,10); 
             System.out.println(":");
        System.out.print( "myprintb(c2,10)" + ":"); 
             myprintb(c2,10); 
             System.out.println(":");
        System.out.print( "myprintb(c3,10)" + ":"); 
             myprintb(c3,10); 
             System.out.println(":");
        System.out.print( "myprintb(c4,10)" + ":"); 
             myprintb(c4,10); 
             System.out.println(":");
        System.out.print( "myprintb(c5,10)" + ":"); 
             myprintb(c5,10); 
             System.out.println(":");
        System.out.print( "myprintb(c6,10)" + ":"); 
             myprintb(c6,10); 
             System.out.println(":");
        System.out.print( "myprintb(c7,10)" + ":"); 
             myprintb(c7,10); 
             System.out.println(":");
        System.out.print( "myprintb(c8,10)" + ":"); 
             myprintb(c8,10); 
             System.out.println(":");
        System.out.print( "myprintb(c9,10)" + ":"); 
             myprintb(c9,10); 
             System.out.println(":");
        System.out.print( "mycrossr(r1,r3)" + ":"); 
             mycrossr(r1,r3); 
             System.out.println(":");
        System.out.print( "mycrossr(r1,r1)" + ":"); 
             mycrossr(r1,r1); 
             System.out.println(":");
        System.out.print( "mycrossr(r3,r3)" + ":"); 
             mycrossr(r3,r3); 
             System.out.println(":");
        System.out.print( "mycrossr(r3,r3)" + ":"); 
             mycrossr(r3,r3); 
             System.out.println(":");
        System.out.print( "mycrossr(r1,r2)" + ":"); 
             mycrossr(r1,r2); 
             System.out.println(":");
        System.out.print( "mycrossr(r2,r2)" + ":"); 
             mycrossr(r2,r2); 
             System.out.println(":");
        System.out.print( "mycrossr(s7,r4)" + ":"); 
             mycrossr(s7,r4); 
             System.out.println(":");
        System.out.print( "mycrossb(b1,b3)" + ":"); 
             mycrossb(b1,b3); 
             System.out.println(":");
        System.out.print( "mycrossb(b3,b1)" + ":"); 
             mycrossb(b3,b1); 
             System.out.println(":");
        System.out.print( "mycrossb(b1,b1)" + ":"); 
             mycrossb(b1,b1); 
             System.out.println(":");
        System.out.print( "mycrossb(b8,b1)" + ":"); 
             mycrossb(b8,b1); 
             System.out.println(":");
        System.out.print( "mycrossb(b1,b8)" + ":"); 
             mycrossb(b1,b8); 
             System.out.println(":");
        System.out.print( "mycrossb(b2,b3)" + ":"); 
             mycrossb(b2,b3); 
             System.out.println(":");
        System.out.print( "mycrossb(b3,b2)" + ":"); 
             mycrossb(b3,b2); 
             System.out.println(":");
        System.out.print( "mycrossb(b1,b5)" + ":"); 
             mycrossb(b1,b5); 
             System.out.println(":");
        System.out.print( "mycrossb(b4,b5)" + ":"); 
             mycrossb(b4,b5); 
             System.out.println(":");
        // test virtualness
 SeqIt si = new FibIt(b1);
 try {
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     si = new ForIt(r1);
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
        }
        catch (UsingIteratorPastEndException e) {
            System.out.println("oops1! caught UsingIteratorPastEndException");
 }
        try {
     System.out.println("test of calling FibIt"
           +" too many times");
         FibIt fi = new FibIt(new Fib(2, 2, 10));
     System.out.println( "fi.next()" + ":" + (fi.next()) + ":");
     System.out.println( "fi.next()" + ":" + (fi.next()) + ":");
     System.out.println( "fi.next()" + ":" + (fi.next()) + ":");
     System.out.println( "fi.next()" + ":" + (fi.next()) + ":");
     System.out.println( "fi.next()" + ":" + (fi.next()) + ":");
     System.out.println( "fi.next()" + ":" + (fi.next()) + ":");
        }
        catch (UsingIteratorPastEndException e) {
            System.out.println("= caught UsingIteratorPastEndException from FibIt");
 }
 try {
     System.out.println("test of calling ForIt"
           +" too many times");
         ForIt fi = new ForIt(new For(3, 8, 2));
     System.out.println( "fi.next()" + ":" + (fi.next()) + ":");
     System.out.println( "fi.next()" + ":" + (fi.next()) + ":");
     System.out.println( "fi.next()" + ":" + (fi.next()) + ":");
     System.out.println( "fi.next()" + ":" + (fi.next()) + ":");
        }
        catch (UsingIteratorPastEndException e) {
            System.out.println("= caught UsingIteratorPastEndException from ForIt");
 }
 System.out.println( "ForUser.sum1(r1)" + ":" + (ForUser.sum1(r1)) + ":");
 System.out.println( "ForUser.sum1(r2)" + ":" + (ForUser.sum1(r2)) + ":");
 System.out.println( "ForUser.sum1(r3)" + ":" + (ForUser.sum1(r3)) + ":");
 System.out.println( "ForUser.sum1(r4)" + ":" + (ForUser.sum1(r4)) + ":");
 System.out.println( "ForUser.sum1(r5)" + ":" + (ForUser.sum1(r5)) + ":");
 System.out.println( "ForUser.sum1(r7)" + ":" + (ForUser.sum1(r7)) + ":");
 System.out.println( "ForUser.sum1(r8)" + ":" + (ForUser.sum1(r8)) + ":");
 System.out.println( "ForUser.sum1(s7)" + ":" + (ForUser.sum1(s7)) + ":");
 System.out.println( "ForUser.sum2(r1)" + ":" + (ForUser.sum2(r1)) + ":");
 System.out.println( "ForUser.sum2(r2)" + ":" + (ForUser.sum2(r2)) + ":");
 System.out.println( "ForUser.sum2(r3)" + ":" + (ForUser.sum2(r3)) + ":");
 System.out.println( "ForUser.sum2(r4)" + ":" + (ForUser.sum2(r4)) + ":");
 System.out.println( "ForUser.sum2(r5)" + ":" + (ForUser.sum2(r5)) + ":");
 System.out.println( "ForUser.sum2(r7)" + ":" + (ForUser.sum2(r7)) + ":");
 System.out.println( "ForUser.sum2(r8)" + ":" + (ForUser.sum2(r8)) + ":");
 System.out.println( "ForUser.sum2(s7)" + ":" + (ForUser.sum2(s7)) + ":");
        // test better way to create iterators and test virtualness
 si = r1.createSeqIt();
 try {
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
 }
        catch (UsingIteratorPastEndException e) {
            System.out.println("oops2! caught UsingIteratorPastEndException");
 }
 si = b3.createSeqIt();
 try {
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
 }
        catch (UsingIteratorPastEndException e) {
            System.out.println("oops3! caught UsingIteratorPastEndException");
 }
        // now to do myprint the right way
        System.out.print( "myprint(r1,10)" + ":"); 
             myprint(r1,10); 
             System.out.println(":");
        System.out.print( "myprint(r2,10)" + ":"); 
             myprint(r2,10); 
             System.out.println(":");
        System.out.print( "myprint(r3,10)" + ":"); 
             myprint(r3,10); 
             System.out.println(":");
        System.out.print( "myprint(r4,10)" + ":"); 
             myprint(r4,10); 
             System.out.println(":");
        System.out.print( "myprint(r5,10)" + ":"); 
             myprint(r5,10); 
             System.out.println(":");
        System.out.print( "myprint(s6,10)" + ":"); 
             myprint(s6,10); 
             System.out.println(":");
        System.out.print( "myprint(s7,10)" + ":"); 
             myprint(s7,10); 
             System.out.println(":");
        System.out.print( "myprint(b1,10)" + ":"); 
             myprint(b1,10); 
             System.out.println(":");
        System.out.print( "myprint(b2,10)" + ":"); 
             myprint(b2,10); 
             System.out.println(":");
        System.out.print( "myprint(b3,10)" + ":"); 
             myprint(b3,10); 
             System.out.println(":");
        System.out.print( "myprint(b4,10)" + ":"); 
             myprint(b4,10); 
             System.out.println(":");
        System.out.print( "myprint(b5,10)" + ":"); 
             myprint(b5,10); 
             System.out.println(":");
        System.out.print( "myprint(b6,10)" + ":"); 
             myprint(b6,10); 
             System.out.println(":");
        System.out.print( "myprint(b7,10)" + ":"); 
             myprint(b7,10); 
             System.out.println(":");
        System.out.print( "myprint(b8,10)" + ":"); 
             myprint(b8,10); 
             System.out.println(":");
        System.out.print( "myprint(b9,10)" + ":"); 
             myprint(b9,10); 
             System.out.println(":");
        // now do mycross the right way
        // same cross tests as above, plus some extra mixed tests
        System.out.print( "mycross(r1,r3)" + ":"); 
             mycross(r1,r3); 
             System.out.println(":");
        System.out.print( "mycross(r1,r1)" + ":"); 
             mycross(r1,r1); 
             System.out.println(":");
        System.out.print( "mycross(r3,r3)" + ":"); 
             mycross(r3,r3); 
             System.out.println(":");
        System.out.print( "mycross(r3,r3)" + ":"); 
             mycross(r3,r3); 
             System.out.println(":");
        System.out.print( "mycross(r1,r2)" + ":"); 
             mycross(r1,r2); 
             System.out.println(":");
        System.out.print( "mycross(r2,r2)" + ":"); 
             mycross(r2,r2); 
             System.out.println(":");
        System.out.print( "mycross(s7,r4)" + ":"); 
             mycross(s7,r4); 
             System.out.println(":");
        System.out.print( "mycross(b1,b3)" + ":"); 
             mycross(b1,b3); 
             System.out.println(":");
        System.out.print( "mycross(b3,b1)" + ":"); 
             mycross(b3,b1); 
             System.out.println(":");
        System.out.print( "mycross(b1,b1)" + ":"); 
             mycross(b1,b1); 
             System.out.println(":");
        System.out.print( "mycross(b8,b1)" + ":"); 
             mycross(b8,b1); 
             System.out.println(":");
        System.out.print( "mycross(b1,b8)" + ":"); 
             mycross(b1,b8); 
             System.out.println(":");
        System.out.print( "mycross(b2,b3)" + ":"); 
             mycross(b2,b3); 
             System.out.println(":");
        System.out.print( "mycross(b3,b2)" + ":"); 
             mycross(b3,b2); 
             System.out.println(":");
        System.out.print( "mycross(b1,b5)" + ":"); 
             mycross(b1,b5); 
             System.out.println(":");
        System.out.print( "mycross(b4,b5)" + ":"); 
             mycross(b4,b5); 
             System.out.println(":");
        // new mixed tests
        System.out.print( "mycross(r1,b1)" + ":"); 
             mycross(r1,b1); 
             System.out.println(":");
        System.out.print( "mycross(b1,r1)" + ":"); 
             mycross(b1,r1); 
             System.out.println(":");
        System.out.print( "mycross(s7,b4)" + ":"); 
             mycross(s7,b4); 
             System.out.println(":");
        System.out.print( "mycross(b4,s7)" + ":"); 
             mycross(b4,s7); 
             System.out.println(":");
        System.out.print( "mycross(r2,b8)" + ":"); 
             mycross(r2,b8); 
             System.out.println(":");
        System.out.print( "mycross(b8,r2)" + ":"); 
             mycross(b8,r2); 
             System.out.println(":");
        System.out.print( "mycross(r3,b2)" + ":"); 
             mycross(r3,b2); 
             System.out.println(":");
        System.out.print( "mycross(b2,r3)" + ":"); 
             mycross(b2,r3); 
             System.out.println(":");
        countOut();
        // now for some list stuff.
        AList l1 = new AList();
        System.out.println( "l1" + ":" + (l1) + ":");
        l1.add( 4 );
        System.out.println( "l1" + ":" + (l1) + ":");
        l1.add( 11 );
        System.out.println( "l1" + ":" + (l1) + ":");
        AList l2 = new AList();
        System.out.println( "l2" + ":" + (l2) + ":");
        l2.add( 33 );
        System.out.println( "l2" + ":" + (l2) + ":");
        l2.add( r1 );
        System.out.println( "l2" + ":" + (l2) + ":");
        l2.add( 34 );
        System.out.println( "l2" + ":" + (l2) + ":");
        l2.add( l1 );
        System.out.println( "l2" + ":" + (l2) + ":");
        l2.add( 35 );
        System.out.println( "l2" + ":" + (l2) + ":");
        AList l3 = new AList();
        AList l4 = new AList();
        System.out.println( "l3" + ":" + (l3) + ":");
        l3.add( l4 );
        System.out.println( "l3" + ":" + (l3) + ":");
        l3.add( 45 );
        l2.add( r2 );
        System.out.println( "l3" + ":" + (l3) + ":");
        l2.add( l3 );
        l2.add( b2 );
        System.out.println( "l2" + ":" + (l2) + ":");
        System.out.println( "l3" + ":" + (l3) + ":");
        AList l5 = new AList();
        l5.add( 87 );
        l5.add( l3 );
        l5.add( 88 );
        l5.add( l2 );
        l5.add( 89 );
        AList l6 = new AList();
        AList l7 = new AList();
        AList l8 = new AList();
        l6.add( b3 );
        l7.add( r1 );
        l7.add( l6 );
        l8.add( l7 );
        l8.add( r2 );
        l5.add( l8 );
        l5.add( 90 );
        System.out.println( "l4" + ":" + (l4) + ":");
        System.out.println( "l5" + ":" + (l5) + ":");
        System.out.println( "l6" + ":" + (l6) + ":");
        System.out.println( "l7" + ":" + (l7) + ":");
        System.out.println( "l8" + ":" + (l8) + ":");
        System.exit(0);
    }
    private static void countOut() {
        System.out.println( "created " + Seq.getCount() + " Seq");
        System.out.println( "created " + For.getCount() + " For");
        System.out.println( "created " + Fib.getCount() + " Fib");
    }
    private static void myprintr(For r, int num) {
 ForIt ri = new ForIt(r);
        int count = 0;
        while( ++count <= num && ri.hasNext() ) {
     try {
         System.out.print(ri.next() + " ");
            }
            catch (UsingIteratorPastEndException e) {
                System.out.println("myprintr oops! caught UsingIteratorPastEndException");
     }
 }
    }
    private static void myprintb(Fib b, int num) {
 FibIt bi = new FibIt(b);
        int count = 0;
        while( ++count <= num && bi.hasNext() ) {
     try {
         System.out.print(bi.next() + " ");
            }
            catch (UsingIteratorPastEndException e) {
                System.out.println("myprintb oops! caught UsingIteratorPastEndException");
     }
 }
    }
    private static void mycrossr(For r1, For r2) {
 ForIt ri1 = new ForIt(r1);
 boolean first = true;
 while ( ri1.hasNext() ) {
     try {
         int p1 = ri1.next();
                ForIt ri2 = new ForIt(r2);
         while ( ri2.hasNext() ) {
      int p2 = ri2.next();
      if ( first ) {
          first = false;
          System.out.println();
      }
      System.out.println("   " + p1 + " " + p2);
         }
            }
            catch (UsingIteratorPastEndException e) {
                System.out.println("mycrossr oops! caught UsingIteratorPastEndException");
     }
 }
    }
    private static void mycrossb(Fib b1, Fib b2) {
 FibIt bi1 = new FibIt(b1);
 boolean first = true;
 while ( bi1.hasNext() ) {
     try {
         int p1 = bi1.next();
                FibIt bi2 = new FibIt(b2);
         while ( bi2.hasNext() ) {
      int p2 = bi2.next();
      if ( first ) {
          first = false;
          System.out.println();
      }
      System.out.println("   " + p1 + " " + p2);
  }
     }
            catch (UsingIteratorPastEndException e) {
                System.out.println("mycrossb oops! caught UsingIteratorPastEndException");
     }
 }
    }
    private static void myprint(Seq s, int num) {
        SeqIt si = s.createSeqIt();
        int count = 0;
        while( ++count <= num && si.hasNext() ) {
     try {
                System.out.print(si.next() + " ");
     }
            catch (UsingIteratorPastEndException e) {
                System.out.println("myprint oops! caught UsingIteratorPastEndException");
     }
        }
    }
    private static void mycross(Seq s1, Seq s2) {
        SeqIt si1 = s1.createSeqIt();
        boolean first = true;
        while ( si1.hasNext() ) {
     try {
                int p1 = si1.next();
                SeqIt si2 = s2.createSeqIt();
                while ( si2.hasNext() ) {
                    int p2 = si2.next();
                    if ( first ) {
                        first = false;
                        System.out.println();
                    }
                   System.out.println("   " + p1 + " " + p2);
                }
     }
            catch (UsingIteratorPastEndException e) {
                System.out.println("mycross oops! caught UsingIteratorPastEndException");
     }
        }
    }
}
