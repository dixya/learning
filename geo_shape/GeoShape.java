
package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author dixya
 */
public  class GeoShape {
    Color color;
    GeoPoint origin;

    /**
     *
     */
    public static final GeoPoint DEFAULT_ORIGIN  = new GeoPoint( 0f, 0f );
    public static final Color DEFAULT_COLOR = Color.BLUE;
    public GeoShape( GeoPoint origin, Color color ){                
                this.origin = origin;
                this.color=color;

    }
    public  void draw(Graphics2D gtx){
        
    }

    public GeoPoint getOrigin() {
        origin.getXco();
        origin.getYco();
        return origin;
			//This is the getter for the encapsulated origin.
    }

    public Point getIntOrigin() {
        int x = (int) Math.round(origin.getXco());
        int y = (int) Math.round(origin.getYco());
        Point point = new Point(x, y);
        return point;
    }

    public void setOrigin(GeoPoint origin) {
        this.origin = origin;
//This is the setter for the encapsulated origin.
    }

    public void setColor(Color color) {
        this.color = color;

        //This is the setter for the encapsulated color.
    }

    public Color getColor() {
        return color;
        //This is the getter for the encapsulated color.
    }

    @Override
    public String toString() {
        // take substring of color to ignore alpha (opacity)
        return "origin=" + origin.toString() + ",color=" + "#" + Integer.toHexString(color.getRGB()).substring(2);
    }
}
