
package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author dixya
 */
public class GeoRectangle extends GeoShape {

    double w, h;
    public GeoRectangle( double width, double height ){
       this(DEFAULT_ORIGIN,DEFAULT_COLOR,width,height);
    }
    public GeoRectangle( GeoPoint origin, double width, double height ){
       this( origin, DEFAULT_COLOR, width, height );
    }
    public GeoRectangle( GeoPoint origin, Color color, double width, double height ){
    super(origin,color);
    this.w=width;
    this.h=height;
    }
    
    @Override
    public void draw(Graphics2D gtx) {
        System.out.println("Drawing rectangle: origin= (" + origin.getXco() + "," + origin.getYco() + "),color=" + "#"+Integer.toHexString(color.getRGB()).substring(2) + ", width=" + w + ",height=" + h);

    }

    public void setWidth(double width) {
        this.w = width;
//This is the setter for the encapsulated width
    }

    public double getWidth() {
        return w;

//This is the getter for the encapsulated width.
    }

    public void setHeight(double height) {
        this.h = height;
//This is the setter for the encapsulated height
    }

    public double getHeight() {
        return h;
//This is the getter for the encapsulated height.
    }
    public double area(){
        return w*h;
//Returns the area of the rectangle.
    }

public double perimeter(){
    return 2*(w+h);

//Returns the perimeter of the rectangle.
}

    @Override
    public String toString() {
        return super.toString() + ", width=" + w + ", height=" + h;
    }
}
