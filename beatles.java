import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


class beatles{
  public static void main(String args[])  throws FileNotFoundException 
  {

    File file = new File("beatles.txt"); 
    Scanner s = new Scanner(file).useDelimiter("~");
    List<String> quotes = new ArrayList<>();
    Random r = new Random();

    while (s.hasNext()) { 
      quotes.add(s.next()); 
    } 
    System.out.println();
    System.out.println(quotes.get(r.nextInt(quotes.size())));

  }
}
