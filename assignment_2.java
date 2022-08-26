import java.util.*;	

import java.sql.Timestamp;
import java.util.SimpleTimeZone;
import java.util.Date;
import java.util.stream.*;


public class assignment_2 {
	
	



    public static void main(String args[])
    {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        forLambda lambdaOb = (int x)->System.out.println(2*x);
  
        // This calls above lambda expression and prints 10.
        lambdaOb.abstractFun(5);
     
       
        assignment_2 run = new assignment_2();
        run.findAny();
        
        
        
    }
}

public void findAny() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    Optional<Integer> result = list
      .stream().parallel()
      .filter(num -> num < 4).findAny();

    assertTrue(result.isPresent());
    assertThat(result.get(), anyOf(is(1), is(2), is(3)));
}

interface forLambda{
void abstractFun(int x);
	  
    // A non-abstract (or default) function
    default void normalFun()
    {
       System.out.println("Hello");
    }
}

