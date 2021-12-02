class Person{
      String name;
      int id;
      Person(String name, int id){
            this.name = name;
            this.id = id;
      }
      //This is toString() default method
      // @Override
      // public String toString() {
      //       return getClass().getName() + "@" + Integer.toHexString(hashCode());
      // }
      
      //overriding toString method
      @Override
      public String toString() {
            return "Name = "+name+" Id = "+id;
      }

}

public class Question14 {
      public static void main(String [] args){
            Person obj = new Person("Bibek",1);
            System.out.println(obj);//compiler makes it as: obj.toString()
      }
}
