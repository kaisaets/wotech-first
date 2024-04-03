// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
   
  
  //  till +5 wear super warm
  // +5...+15 warm
  // +15...+30 normal
  // +30 and more

    var temp = 15.1;
    
    if (temp <= 5) {
      System.out.println ("Wear super warm");
    } 
    else if (temp > 5 || temp < 15) {
      System.out.println ("Wear warm");
  } 
  else if (temp > 15 || temp <= 30) {
  System.out.println ("Wear normal");
} 
else if (temp > 30) {
  System.out.println ("Cool");
}
}
}
