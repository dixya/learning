package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author dixya
 */
public class GeoLine extends GeoShape {

    GeoPoint endpt;

    public GeoLine(GeoPoint origin, GeoPoint end) {
        this(origin, DEFAULT_COLOR, end);

    }

    public GeoLine(GeoPoint origin, Color color, GeoPoint end) {
        super(origin, color);
        this.endpt = end;
    }

    @Override
    public void draw(Graphics2D gtx) {
        System.out.println("Drawing line: origin=(" + origin.toString() + "color=" + "#" + Integer.toHexString(color.getRGB()).substring(2) + ",end=(" + endpt.toString());

    }

    public GeoPoint getStart() {
        return origin;
        //This is the getter for the first point (the origin).
    }

    public void setStart(GeoPoint start) {
        this.origin = start;

        // This is the setter for the first point
    }

    public GeoPoint getEnd() {
        return endpt;

        //This is the getter for the second point.
    }

    public void setEnd(GeoPoint end) {
        this.endpt = end;
        //This is the setter for the second point.
    }

    @Override
    public String toString() {
        return " origin=(" + origin.toString() + ",color=#" + Integer.toHexString(color.getRGB()).substring(2) + ",end=(" + endpt.toString();

    }

}
