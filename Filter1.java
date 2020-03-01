import java.io.*;
import java.util.*;
public class Filter1 extends Thread{
    PipedWriter myPw;

    public Filter1(PipedWriter pw ){
        this.myPw=pw;
    }

    public static void rkun() throws IOException{//overwriting from threds , reding from file
    FileReader fileReader = new FileReader("words.txt");//file to be read from
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    List<String> lines = new ArrayList<String>();//list of words from file
     String line = null;
    while ((line = bufferedReader.readLine()) != null) {
        lines.add(line);//add the word to the list
    }
    bufferedReader.close();




    }

    public static void main(String[] args) throws IOException{
        rkun();
    }





}