package cp120.assignments.geo_shape;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author dixya
 */
public class GeoPlane {

    List<GeoShape> ShapesList = new ArrayList<>();

    public void addShape(GeoShape shape) {
        ShapesList.add(shape);//adds the given shape to the list.
    }

    public void removeShape(GeoShape shape) {

        ShapesList.remove(shape);// removes the given shape from the list.
    }

    public void redraw() {
        ShapesList.stream().forEach((GeoShape shape) -> {
            shape.draw(null);

            //This method traverses the list, calling the draw method for each GeoShape in the list. 
        });
    }

}
