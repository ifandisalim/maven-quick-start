package ifandi.programming.training;

import java.util.List;
import java.util.ArrayList;

public class Application {

    public Application() {
        System.out.println ("Inside Application");
    }



    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
      List<String> listSample = new ArrayList<>();
      listSample.add("Hi");

      for(String currentItem : listSample){
        System.out.println(currentItem);
      }
    	System.out.println ("Starting Application");
	Application app = new Application();
    }
}
