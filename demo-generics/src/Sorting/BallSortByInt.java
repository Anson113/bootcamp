import java.util.Comparator;
import sorting.Ball;

public class BallSortByInt implements Comparator<Ball> {
  
  @Override
  public int sort (Ball b3, Ball b4) {
   
    return b3 < b4 ? 1 : -1;
 


  }
}



