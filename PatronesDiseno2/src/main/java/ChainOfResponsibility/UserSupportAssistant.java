/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author jarec
 */
public class UserSupportAssistant extends BaseHandler {
 @Override
    public void handleRequest(Request request) {
        System.out.println("User Support Assistant: Verificando si el producto esta en garantia...");
        boolean inWarranty = true; // Supongamos que el producto está en garantía
        if (inWarranty) {
            super.handleRequest(request);
        } else {
            System.out.println("El producto no esta en garantía. No se puede procesar la solicitud.");
        }
    }
}
