import java.io.*;
import java.util.*;

import jdk.nashorn.internal.ir.CatchNode;
public class Generator extends Thread{
    PipedWriter myPw;

    public Generator(final PipedWriter pw) {
        this.myPw = pw;
    }

    public void run() {// overwriting from threds , reding from file
        try{
        final FileReader fileReader = new FileReader("words.txt");// file to be read from
        final BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
      while ((line = bufferedReader.readLine()) != null) {
        myPw.write(line);
       
    }
    myPw.write('0');
    bufferedReader.close();
    

    }catch (IOException e){

    }
}





}