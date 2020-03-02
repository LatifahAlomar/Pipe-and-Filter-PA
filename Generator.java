import java.io.*;
import java.util.*;
public class Generator extends Thread{
    PipedWriter myPw;

    public Generator(final PipedWriter pw) {
        this.myPw = pw;
    }

    public void run() {// overwriting from threds , reding from file
        final FileReader fileReader = new FileReader("words.txt");// file to be read from
        final BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
    while ((line = bufferedReader.readLine()) != null) {
        myPw.write(line);
    }
    bufferedReader.close();
    

    }





}