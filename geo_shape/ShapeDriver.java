package cp120.assignments.geo_shape;

import static app.DriverUtils.printf;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class ShapeDriver {

    private GeoPlane plane = new GeoPlane();
    private int nextColor = 0;

    private static final Color[] colors = new Color[6];

    static {
        Random randy = new Random(1);
        for (int inx = 0; inx < colors.length; ++inx) {
            float red = randy.nextFloat();
            float green = randy.nextFloat();
            float blue = randy.nextFloat();
            colors[inx] = new Color(red, green, blue);
        }
    }

    public static void main(String[] args) {
        /*
        String status = new PointChecker().quickCheck() ? "PASS" : "FAIL";
        printf("GeoPoint check: %s%n", status);

        status = new LineChecker().quickCheck() ? "PASS" : "FAIL";
        printf("GeoLine check: %s%n", status);

        status = new RectangleChecker().quickCheck() ? "PASS" : "FAIL";
        printf("GeoRectangle check: %s%n", status);

        status = new OvalChecker().quickCheck() ? "PASS" : "FAIL";
        printf("GeoOval check: %s%n", status);
        */
        List<IShapeChecker> shapeCheckers = new ArrayList<>();
        shapeCheckers.add(new PointChecker());
        shapeCheckers.add(new LineChecker());
        shapeCheckers.add(new RectangleChecker());
        shapeCheckers.add(new OvalChecker());

        shapeCheckers.forEach(sc -> System.out.println(sc.getName() + " check: " + (sc.quickCheck() ? "PASS" : "FAIL")));
          
        new ShapeDriver().execute();
    }

    private void execute() {
        newOval(1.1f, 2.2f, 128, 256, nextColor());
        newLine(105.5f, 300.5f, 256f, 256f, nextColor());
        newRect(400f, 128.2f, 64, 32, nextColor());
        newOval(64.5f, 300f, 256, 128, nextColor());
        newRect(200f, 8.8f, 128, 128, nextColor());
        newLine(256f, 256f, 5.5f, 5.5f, nextColor());
        newOval(400.2f, 256f, 100, 200, nextColor());
        newRect(276.2f, 200.7f, 64, 256, nextColor());
        plane.redraw();
    }

    private Color nextColor() {
        Color color = colors[nextColor++ % colors.length];
        return color;
    }

    private void
            newOval(float xco, float yco, double width, double height, Color color) {
        GeoPoint origin = new GeoPoint(xco, yco);
        GeoOval oval = new GeoOval(origin, color, 5.5, 6.6);
        System.out.println(oval);
        //System.out.println( "A=" + oval.area() + ",P=" + oval.perimeter() );
        plane.addShape(oval);
    }

    private void newRect(float xco, float yco, double width, double height, Color color) {
        GeoPoint origin = new GeoPoint(xco, yco);
        GeoRectangle rect = new GeoRectangle(origin, color, 5.5, 6.6);
        System.out.println(rect);
        System.out.println("A=" + rect.area() + ",P=" + rect.perimeter());
        plane.addShape(rect);
    }

    private void
            newLine(float xco1, float yco1, float xco2, float yco2, Color color) {
        GeoPoint point1 = new GeoPoint(xco1, yco1);
        GeoPoint point2 = new GeoPoint(xco2, yco2);
        GeoLine line = new GeoLine(point1, color, point2);
        System.out.println(line);
        plane.addShape(line);
    }
}
