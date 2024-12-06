/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author jarec
 */
public class StoreManager implements Handler {
    private Handler nextHandler;
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getPrice() > 1000) {
            System.out.println("Gerente de la tienda: Aprobando solicitud de reposición para productos de alto valor...");
        } else {
            System.out.println("Gerente de la tienda: No se requiere aprobacion para productos de menor valor.");
        }
        System.out.println("Solicitud completada exitosamente.");
    }
    
}
