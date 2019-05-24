
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square window2;
    private Square window3;
    private Square door;
    private Square tree1;
    private Square tree2;
    private Square tree3;
    private Square tree4;
    private Triangle roof;
    private Triangle roof2;
    private Square roof3;
    private Circle leaves1;
    private Circle leaves2;
    private Circle leaves3;
    private Circle leaves4;
    private Circle leaves5;    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(69);
        wall.moveVertical(115);
        wall.changeSize(150);
        wall.changeColor("red");
        wall.makeVisible();

        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(180);
        window.moveVertical(130);
        window.changeSize(30);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("green");
        window2.moveHorizontal(129);
        window2.moveVertical(130);
        window2.changeSize(30);
        window2.makeVisible();
        
        window3 = new Square();
        window3.changeColor("green");
        window3.moveHorizontal(80);
        window3.moveVertical(130);
        window3.changeSize(30);
        window3.makeVisible();
        
        door = new Square();
        door.changeColor("blue");
        door.moveHorizontal(130);
        door.moveVertical(210);
        door.changeSize(40);
        door.makeVisible();
        
        tree1 = new Square();
        tree1.changeColor("black");
        tree1.moveHorizontal(-20);
        tree1.moveVertical(230);
        tree1.changeSize(30);
        tree1.makeVisible();
        
        tree2 = new Square();
        tree2.changeColor("black");
        tree2.moveHorizontal(-20);
        tree2.moveVertical(210);
        tree2.changeSize(30);
        tree2.makeVisible();
        
        tree3 = new Square();
        tree3.changeColor("black");
        tree3.moveHorizontal(-20);
        tree3.moveVertical(190);
        tree3.changeSize(30);
        tree3.makeVisible();
        
        tree4 = new Square();
        tree4.changeColor("black");
        tree4.moveHorizontal(-20);
        tree4.moveVertical(170);
        tree4.changeSize(30);
        tree4.makeVisible();        

        roof = new Triangle();
        roof.changeSize(103, 103);
        roof.moveHorizontal(99);
        roof.moveVertical(47);
        roof.changeColor("black");
        roof.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeSize(102, 102);
        roof2.moveHorizontal(200);
        roof2.moveVertical(48);
        roof2.changeColor("black");
        roof2.makeVisible();
        
        roof3 = new Square();
        roof3.moveHorizontal(90);
        roof3.moveVertical(15);
        roof3.changeSize(100);
        roof3.changeColor("black");
        roof3.makeVisible();

        leaves1 = new Circle();
        leaves1.changeColor("green");
        leaves1.moveHorizontal(40);
        leaves1.moveVertical(140);
        leaves1.changeSize(30);
        leaves1.makeVisible();
        
        leaves2 = new Circle();
        leaves2.changeColor("green");
        leaves2.moveHorizontal(0);
        leaves2.moveVertical(140);
        leaves2.changeSize(30);
        leaves2.makeVisible();
        
        leaves3 = new Circle();
        leaves3.changeColor("green");
        leaves3.moveHorizontal(20);
        leaves3.moveVertical(120);
        leaves3.changeSize(30);
        leaves3.makeVisible();
        
        leaves4 = new Circle();
        leaves4.changeColor("green");
        leaves4.moveHorizontal(20);
        leaves4.moveVertical(160);
        leaves4.changeSize(30);
        leaves4.makeVisible();
        
        leaves5 = new Circle();
        leaves5.changeColor("green");
        leaves5.moveHorizontal(20);
        leaves5.moveVertical(140);
        leaves5.changeSize(30);
        leaves5.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            //sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            //sun.changeColor("yellow");
        }
    }

}
