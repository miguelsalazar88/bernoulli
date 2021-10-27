package controlador;

import modelo.Modelo;
import vista.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private Ventana vista;
    private Modelo modelo;

    public Controlador(Ventana vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setController(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(this.vista.getBotonCalcular())){
            double posibles = Double.parseDouble(this.vista.getJTFTotal().getText());
            double favorables = Double.parseDouble(this.vista.getJTFExito().getText());

            double exito = modelo.bernoulliExito(posibles,favorables);
            double fracaso = modelo.bernoulliFracaso(posibles,favorables);

            this.vista.getJTFresultadoExito().setText(String.valueOf(exito));
            this.vista.getJTFresultadoFracaso().setText(String.valueOf(fracaso));

        }
    }
}
