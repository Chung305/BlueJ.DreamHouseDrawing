
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
    private Triangle roof;
    private Circle sun;
    private Circle mountain;
    private Square door;
    private Square trunk;
    private Square trunk1;
    private Square trunk2;
    private Square trunk3;

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
        mountain = new Circle();
        mountain.changeColor("green");
        mountain.moveHorizontal(-150);
        mountain.moveVertical(70);
        mountain.changeSize(900);
        mountain.makeVisible();
        
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(50);
        door.moveVertical(150);
        door.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(200);
        sun.moveVertical(-10);
        sun.changeSize(65);
        sun.makeVisible();
        
        trunk = new Square();
        trunk.moveVertical(120);
        trunk.moveHorizontal(180);
        trunk.changeSize(20);
        trunk.makeVisible();
        trunk.changeColor("black");
        
        trunk1 = new Square();
        trunk1.moveVertical(100);
        trunk1.moveHorizontal(180);
        trunk1.changeSize(20);
        trunk1.makeVisible();
        trunk1.changeColor("black");
        
        trunk2 = new Square();
        trunk2.moveVertical(80);
        trunk2.moveHorizontal(180);
        trunk2.changeSize(20);
        trunk2.makeVisible();
        trunk2.changeColor("black");
        
        trunk3 = new Square();
        trunk3.moveVertical(60);
        trunk3.moveHorizontal(180);
        trunk3.changeSize(20);
        trunk3.makeVisible();
        trunk3.changeColor("black");
        
        
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
            sun.changeColor("black");
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
            sun.changeColor("yellow");
            mountain.changeColor("green");
        }
    }

}
