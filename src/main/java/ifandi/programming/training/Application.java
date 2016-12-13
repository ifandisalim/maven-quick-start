package ifandi.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public Application() {
        System.out.println ("Inside Application");
    }

    public int countWords(String words){
      String[] separateWords = StringUtils.split(words, ' ');
      return (saparateWords == null) ? 0 : separateWords.length;
    }



    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");

	    Application app = new Application();

      int count = app.countWords("I have four words");
      System.out.println("Word Count " + count);
    }
}
