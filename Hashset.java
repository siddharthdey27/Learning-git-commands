import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Hashset {
    public static void main(String args[]){
    HashSet<Integer> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of elements in the list");
    int n = sc.nextInt();
     for(int i = 0;i<n;i++){
      System.out.println("Enter the Number to add in list");
      int a = sc.nextInt();
      set.add(a);
    }
    System.out.println(set);
    // search
    System.out.println("Enter the number to search in list");
    int b = sc.nextInt();
    System.out.println(set.contains(b));
    System.out.println("Enter the number you want to delete your number ");
      int del = sc.nextInt();
      set.remove(del);
      System.out.println(set);
      System.out.println("Size of set");
      System.out.println(set.size());
      // to traverse the set
      Iterator it  = set.iterator();
      while(it.hasNext())
      {
        System.out.println(it.next());
      }
   }
}

