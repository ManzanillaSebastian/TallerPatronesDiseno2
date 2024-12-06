/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author jarec
 */
public class TechnicalDepartmentMember implements Handler {
    private Handler nextHandler;
    
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Departamento Tecnico: Verificando si el fallo esta cubierto por la garantia...");
        boolean coveredByWarranty = true;
        if (coveredByWarranty && nextHandler != null) {
            nextHandler.handleRequest(request);
        } else if (!coveredByWarranty) {
            System.out.println("El fallo no está cubierto por la garantia. No se puede procesar la solicitud.");
        }
    }
    
}
