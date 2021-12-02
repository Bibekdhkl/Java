// class Dimension{
//       int l,b;

//       Dimension(int l,int b){
//             this.l = l;
//             this.b = b;
//       }

//       void getDimension(){
//             System.out.println("Length = "+l+" Breath = "+b);
//       }
// }

// class Color{
//       // colorured or black or white
//       String colorName;

//       Color(String colorName){
//             this.colorName = colorName;
//       }

//       void getColor(){
//             System.out.println("Color = "+colorName);
//       }
// }

// class Image{
//       Dimension d;
//       String type;
//       Color value;

//       Image(Dimension dim,String type,Color val){
//             this.type = type;
//       }

//       void getImageInfo(){
//             System.out.println("Dimensions are: ");
//             d.getDimension();
//             System.out.println("Image type = "+type);
//             System.out.println("Image color is = ");
//             value.getColor();
//       }
// }

// class Product{
//       String name;
//       int id;
//       Image img;
//       Product(String name,int id,Image i){
//             this.name = name;
//             this.id = id;
//       }

//       void getInfo(){
//             System.out.println("Name = "+name+" Id = "+id);
//             img.getImageInfo();
//       }
// }

// public class Question15 {
//       public static void main(String [] args){
            
//       }
// }

//--------------------------------------------------

// Class Image{
//       int length;
//       int breadth;
//       String type;
//       String colour;
  
  
//       public Image(int length, int breadth ,  String type , String colour){
//           this.length=length;
//           this.breadth=breadth;
//           this.type=type;
//           this.colour=colour;
//       }
  
//   //public void getDimension(){
//       //  System.out.println("Dimension : "+this.dimension);
//   //}
  
//   //public void getType(){
//   //    System.out.println("Type  : " +this.type);
//   //}
//   //
//   //public void getView(){
//   //    System.out.println("Type : "+this.view);
//   //  }
  
//   }
  
//       class Ecommerce {
//           String name;
//           int id;
//           Image image;
  
  
//           public Ecommerce(String name, int id, Image image) {
//               this.name = name;
//               this.id = id;
//               this.image = image;
//           }
  
//           public void showInfo() {
//               System.out.println("Name : " + this.name);
//               System.out.println("ID  : " + this.id);
//               System.out.println("Length  : " + this.image.length);
//               System.out.println("Breadth  : " + this.image.breadth);
//               System.out.println("Type: " + this.image.type);
//               System.out.println("Colour  : " + this.image.colour);
//           }
//       }
//       public class Question15{
//           public static void main(String[] args){
//               Image i = new Image(50 , 50 , "jpg"  , "Black & White");
//               Ecommerce e = new Ecommerce("Suman" , 1 , i);
//               e.showInfo();
//           }
//       }


class Image {
      private int height;
      private int width;
      private String type;
      private Boolean isColoured;
  
      Image(int height, int width, String type, Boolean isColoured) {
          this.height = height;
          this.width = width;
          this.type = type;
          this.isColoured = isColoured;
      }
  
      void display() {
          System.out.println("\nInfo about Image: ");
          System.out.println("Dimension: " + this.height + " * " + this.width);
          System.out.println("Type: " + this.type);
          System.out.println("Coloured: " + this.isColoured);
      }
  }

  public class Product {
      private String name;
      private int id;
  
      Image I;
  
      Product(String name, int id, Image I) {
          this.name = name;
          this.id = id;
          this.I = I;
      }
  
      void display() {
          System.out.println("Product informaiton:");
          System.out.println("\nName: " + this.name + "\nId: " + this.id);
  
          this.I.display();
      }
  
      public static void main(String[] args) {
          Image I = new Image(100, 65, "jpeg", false);
  
          Product P = new Product("Shoe", 12, I);
  
          P.display();
      }
  }