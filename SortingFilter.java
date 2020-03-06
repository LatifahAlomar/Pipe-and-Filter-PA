import java.io.*;
import java.util.*;
import java.lang.reflect.Arrays;


public class SortingFilter extends Thread{

    PipedReader myPr;

    public SortingFilter(PipedReader pr){
        this.myPr=pr;

    }

    public void run() {//read from pipe and sort

        String word ="";
        char c ='x';
        String [] words = new String[10];
        int counter = 0;




        try{
            FileWriter writeInFile = new FileWriter( "result.text" );

          
     

         while(c != '0'){
          c = (char) myPr.read();
          if(c == ' '){

             words[counter]=word;
              word = "";
              counter++;
              continue;
             

          }else{
              word += c;
          }
        }

             Arrays.sort(words ,  String.CASE_INSENSITIVE_ORDER);

            for(int i =0 ;i<words.length;i++){
                writeInFile.write(words[i]);
                writeInFile.append('\n');
                 System.out.println(words[i]);
                }
            writeInFile.close();

    }catch (IOException e){

    }

    }



    
}