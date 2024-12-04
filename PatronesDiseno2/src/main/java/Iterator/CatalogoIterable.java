/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author CltControl
 */
public interface CatalogoIterable {
    public Iterador getDisponiblesIterador();
    public Iterador getFiltroTiendaIterador();
    public Iterador getEnReparacionIterador();
    public Iterador getDefectuososIterador();
}