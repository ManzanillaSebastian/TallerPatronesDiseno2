/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ChainOfResponsibility;
/**
 *
 * @author CltControl
 */
public class Cliente {

    public static void main(String[] args) {
        // Crear manejadores
        Handler userSupport = new UserSupportAssistant();
        Handler technicalDept = new TechnicalDepartmentMember();
        Handler inventoryManager = new InventoryManager();
        Handler storeManager = new StoreManager();

        // Configurar la cadena
        userSupport.setNextHandler(technicalDept);
        technicalDept.setNextHandler(inventoryManager);
        inventoryManager.setNextHandler(storeManager);

        // Crear solicitud
        Request request = new Request("Laptop", 1500.0, "Pantalla dañada");

        // Enviar solicitud
        userSupport.handleRequest(request);
    }
}
