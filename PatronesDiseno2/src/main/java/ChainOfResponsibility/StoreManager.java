/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author jarec
 */
public class StoreManager extends BaseHandler  {
    @Override
    public void handleRequest(Request request) {
        if (request.getPrice() > 1000) {
            System.out.println("Gerente de la tienda: Aprobando solicitud de reposicion para productos de alto valor...");
        } else {
            System.out.println("Gerente de la tienda: No se requiere aprobacion para productos de menor valor.");
        }
        System.out.println("Solicitud completada exitosamente.");
    }  
}
