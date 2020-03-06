
import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        String[] myStrArray = new String[] { "c", "a", "b" };

    Arrays.sort(myStrArray, String.CASE_INSENSITIVE_ORDER);

    for (int a = 0; a < myStrArray.length; a++) {
      System.out.println(myStrArray[a]);
    }
  }
        
    }
