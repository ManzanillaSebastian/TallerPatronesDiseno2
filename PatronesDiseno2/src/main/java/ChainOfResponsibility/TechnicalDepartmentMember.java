/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author jarec
 */
public class TechnicalDepartmentMember extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("Departamento Tecnico: Verificando si el fallo esta cubierto por la garantia...");
        boolean coveredByWarranty = true; // Supongamos que está cubierto
        if (coveredByWarranty) {
            super.handleRequest(request);
        } else {
            System.out.println("El fallo no está cubierto por la garantia. No se puede procesar la solicitud.");
        }
    }
}
