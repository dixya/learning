package cp120.assignments.geo_shape;

import java.awt.Point;

/**
 *
 * @author dixya
 */
public class GeoPoint {

    float x0, y0;

    GeoPoint(float xco, float yco) {
        this.x0 = xco;
        this.y0 = yco;
    }

    public float getXco() {
        return x0;//getter for x
    }

    public void setXco(float xco) {
        this.x0 = xco;      //setter for the encapsulated x-coordinate.
    }

    public float getYco() {
        return y0;           //getter for the encapsulated y-coordinate.
    }

    public void setYco(float yco) {
        this.y0 = yco;         //setter for the encapsulated y-coordinate.
    }

    public Point getIntPoint() {
        int x = (int) Math.round(x0);
        int y = (int) Math.round(y0);
        return new Point(x, y);

    }

    public float distance(GeoPoint other) {
        double dist = Math.sqrt((x0 - other.x0) * (x0 - other.x0) + (y0 - other.y0) * (y0 - other.y0));
        return (float) dist;

    }

    @Override
    public String toString() {
        return "(" + x0 + "," + y0 + ")";
    }

}
