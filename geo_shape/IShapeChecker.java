/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp120.assignments.geo_shape;

/**
 *
 * @author dixya
 */
public interface IShapeChecker {
    public boolean quickCheck();
    
    default public String getName() {
        return this.getClass().getSimpleName();
    }
}
