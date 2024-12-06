/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author jarec
 */
public class UserSupportAssistant implements Handler {
        private Handler nextHandler;
    public void handleRequest(Request request) {
        System.out.println("User Support Assistant: Verificando si el producto esta en garantia...");
        // Simulación de validación
        boolean inWarranty = true; // Supongamos que el producto está en garantía
        if (inWarranty && nextHandler != null) {
            nextHandler.handleRequest(request);
        } else if (!inWarranty) {
            System.out.println("El producto no está en garantía. No se puede procesar la solicitud.");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
