package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author dixya
 */
public class GeoOval extends GeoRectangle {

    public GeoOval(double width, double height) {
        this(DEFAULT_ORIGIN, DEFAULT_COLOR, width, height);
    }

    public GeoOval(GeoPoint origin, double width, double height) {
        this(origin, DEFAULT_COLOR, width, height);

    }

    public GeoOval(GeoPoint origin, Color color, double width, double height) {
        super(origin, color, width, height);
    }

    @Override
    public void draw(Graphics2D gtx) {
        System.out.println("Drawing oval: origin=(" + origin.getXco() + "," + origin.getYco() + "),color=" + "#" + Integer.toHexString(color.getRGB()).substring(2) + ",width=" + w + ",height=" + h);

    }
}
