class Shape{
      int xcoord,ycoord,width,height;
      Shape(int xcoord, int ycoord, int width, int height){
            this.xcoord = xcoord;
            this.ycoord = ycoord;
            this.width = width;
            this.height = height;
      }
      Shape(int width, int height){
            this.xcoord = 0;
            this.ycoord = 0;
            this.width = width;
            this.height = height;
            //Shape(0,0,width,height) This isn't working here
      }
      Shape(){
            this.xcoord = 0;
            this.ycoord = 0;
            this.width = 1;
            this.height = 1;
            //Shape(0,0,1,1) Not Working

      }
      void display(){
            System.out.println(" (X-coord,Y-coord) = " + " ("+xcoord+","+ycoord+")");
            System.out.println(" Height = "+height+" Width = "+width);
      }
}

public class Question11 {
      public static void main(String [] args){
            Shape obj = new Shape();
            Shape obj1 = new Shape(5,10);
            Shape obj2 = new Shape(2,3,8,15);
            obj.display();
            obj1.display();
            obj2.display();
      }
}
