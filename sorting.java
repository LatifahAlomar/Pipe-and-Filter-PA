import java.io.*;
import java.util.*;
public class sorting{
public static void main(String[]args)throws IOException {
   PipedWriter pw = new PipedWriter();
   PipedReader myPr = new PipedReader(pw);
   Generator f1= new Generator(pw);
   SortingFilter f2 = new SortingFilter(myPr);
   f2.start();
   f1.start();
   

   


}
}