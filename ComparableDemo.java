import java.util.*;

class Car implements Comparable<Car> {
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
      return (this.regno).compareTo(c.regno);
   }

   public int compareTo(Car compareCar) {

		int comparePrice = ((Car) compareCar).getPrice();

		return this.quantity - compareQuantity;

 }
}

public class ComparableDemo
 {

   public static void main(String args[]) {
   List<Car> list = new ArrayList<Car>();

      list.add(new Car("TS509",500000));
      list.add(new Car("AP207",200000));
      
     Collections.sort(list);
     for(int i=0;i<list.size();i++)
     {
       Car car=(Car)list.get(i);  
       System.out.print(car.getRegNo() +"  : "+ car.getPrice() + ", ");
   }
}
}