import java.util.*;

class Student implements Comparator<Car>, Comparable<Car> {
   private String regno;
   private int price;
   Car() {
   }

   Car(String regno, int price) {
      this.regno = regno;
      this.price = price;
   }

   public String getRegNo() {
      return regno;
   }

   public int getPrice() {
      return price;
   }
      public int compareTo(Car c) {
      return (this.price).compareTo(c.price);
   }

   public int compare(Car c, Car c1) {
      return c.price - c1.price;
   }
}

public class ComparatorDemo
 {

   public static void main(String args[]) {
   List<Student> list = new ArrayList<Student>();

      list.add(new Car("Ts096",200000));
      list.add(new Car("Apts09",500000));
      
     Collections.sort(list);   
      for(Car c2: list)   
         System.out.print(c2.price() + ", ");

      Collections.sort(list, new Car());
      System.out.println(" ");
      
      for(Student c2: list)   
         System.out.print(c2.getRegNo() +"  : "+ c2.getPrice() + ", ");
   }
}