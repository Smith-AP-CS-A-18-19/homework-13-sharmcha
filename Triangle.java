import java.awt.geom.Rectangle2D;
/* All SmithShape triangles have one edge that is on
 * the horizontal and are defined by the angle (in degrees)
 * of the lower left corner.
 */

/* The constructor for the Triangle object should be as below.
 * You may change the names of the parameters, but their order
 * must remain the same for the assignment to be scored
 * correctly
 */
// public Triangle(int x, int y, int width, int height, double angle)

/* You will need to add a getAngle() method that returns
 * the angle of the triangle
 */

/* Add the method toSquare() to the Triangle class. This creates
 * and returns a new Rectangle2D object. The x and y of the new
 * Rectangle should be the same as the Triangle. The width and
 * height of the Rectangle2D should be the same (it is a square)
 * and the area should be equal to the area of the Triangle
 */

/* Override the method toString(). It should return
 * the String:
 * Width: width
 * Height: height
 * Angle: angle
 * Remember that to insert a new line into a String,
 * use \n
 */
 public class Triangle implements SmithShape{
   private int xPos;
   private int yPos;
   private int width;
   private int height;
   private double angle;

   public Triangle(int x, int y, int w, int h, double a){
     xPos = x;
     yPos = y;
     width = w;
     height = h;
     angle = a;
   }

   public int getX(){
     return xPos;
   }

   public int getY(){
     return yPos;
   }

   public int getWidth(){
     return width;
   }

   public int getHeight(){
     return height;
   }

   public double getArea(){
     double area = (0.5)* width * height;
     return area;
   }

   public double getAngle(){
     return angle;
   }

   public Rectangle2D toSquare(){
     double side = Math.sqrt((0.5)*(this.width * this.height));
     Rectangle2D r = new Rectangle2D.Double(xPos, yPos, side, side);
     return r;
   }

   @Override
   public String toString(){
     String s = "Width: " + this.getWidth() + "\nHeight: " + this.getHeight() +
								 "\nAngle: " + this.getAngle();
     return s;
   }

 }
