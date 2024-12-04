/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Strategy;
/**
 *
 * @author CltControl
 */
public class Cliente {

    public static void main(String[] args) {
        DistributionContext context=new DistributionContext();

        //Uso de Automotriz
        context.setStrategy(new Automotriz());
        context.distribute();

        //Uso de Ciclista
        context.setStrategy(new Ciclista());
        context.distribute();

        //Uso de Ferrea
        context.setStrategy(new Ferrea());
        context.distribute();

        //Uso de Aerea
        context.setStrategy(new Aerea());
        context.distribute();

        //Uso de Fluveal
        context.setStrategy(new Fluvial());
        context.distribute();
    }
}
