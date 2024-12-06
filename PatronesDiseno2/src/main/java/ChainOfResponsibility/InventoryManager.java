/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author jarec
 */
public class InventoryManager implements Handler{
    private Handler nextHandler;
    @Override
    public void setNextHandler(Handler nextHandler) {
         this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Jefe de Inventario: Verificando disponibilidad en bodega...");
        boolean inStock = true;
        if (inStock && nextHandler != null) {
            nextHandler.handleRequest(request);
        } else if (!inStock) {
            System.out.println("El producto no está disponible en bodega. No se puede procesar la solicitud.");
        }
    }
    
}
