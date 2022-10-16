import java.util.Scanner;

class Main extends dga{
  public static void main(String[] args) {
    try (Scanner filmYear = new Scanner(System.in)) {
        System.out.println("Enter year: ");

        String bestDir = filmYear.nextLine();
        System.out.println("Best Director is: " + bestDir);
        
        //Main inherits dga.java and dga inherits ampas.java  
        //return statement has to return the Oscar winner and DGA winner of that year.
        //if same, Return one name.
    }
  }
}