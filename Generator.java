import java.io.*;
import java.util.*;
public class Generator extends Thread{
    PipedWriter myPw;

    public Generator(PipedWriter pw ){
        this.myPw=pw;
    }

    public static void run() throws IOException{//overwriting from threds , reding from file
    FileReader fileReader = new FileReader("words.txt");//file to be read from
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    List<String> lines = new ArrayList<String>();//list of words from file
     String line = null;
    while ((line = bufferedReader.readLine()) != null) {
        lines.add(line);//add the word to the list
    }

    //should be a pipe writer here but Allah knows how 

    bufferedReader.close();
    

    }





}