import java.util.*;
public class Araaylist {
    public static void main(String args[])
    {
     ArrayList<Integer> list = new ArrayList<>();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number of elements in the list");
     int n = sc.nextInt();
     for(int i = 0;i<n;i++){
      System.out.println("Enter the Number to add in list");
      int a = sc.nextInt();
      list.add(a);
     }
     System.out.println(list);
      System.out.println("Enter the position you want to  add your number in");
      int pos = sc.nextInt();
      System.out.println("Enter the Number to add in list");
      int b = sc.nextInt();
      list.add(pos,b);
      System.out.println(list);
      System.out.println("Enter the position you want to delete your number ");
      int del = sc.nextInt();
      list.remove(del);
      System.out.println(list);
      for(int i = 0;i<list.size();i++)
      {
        System.out.println(list.get(i));
      }
      // sorting
      Collections.sort(list);
      System.out.println(list);
      for(int val : list)
      {
        System.out.print(+val);
      }
     sc.close();
    }
}
