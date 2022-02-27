package example.com;

public class ContainsOnlyDigits {
  public static void main(String[] args){
      String str = "902638361";
          boolean result = str.matches("[0-9]+");
                 System.out.println("Original String : " + str);
                    System.out.println("Does string contain only Digits? : " + result);
}

}
