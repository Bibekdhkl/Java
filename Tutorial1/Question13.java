class User{
      //instance and class variable are declared inside class
      static int num1 = 5;//class or static variable are global which take only one memory location
      int num2; //instance variable are created when object is instantiated and take different values for each object

      User(int num){
            this.num2 = num;
      }
      
      void getInfo(){
            //local variable is declared inside methods
            int num3 = 15;//local variable
            System.out.println("Class(Static) Variable: "+num1);
            System.out.println("Instance Variable: "+num2);
            System.out.println("Local Variable: "+num3);
      }
}
public class Question13 {
      public static void main(String [] args){
            User obj = new User(10);
            obj.getInfo();
      }
}
