package modelo;

import vista.Ventana;

public class Modelo {

    private Ventana vista;

    public Modelo(Ventana vista){
        this.vista = vista;
    }

    public double bernoulliExito(double posibles, double favorables)
    {
        double pFavorables = (favorables/posibles);
        double resultado = (Math.pow(pFavorables,1))*(Math.pow((1-pFavorables),(1-1)));
        return resultado;
    }
    public double bernoulliFracaso(double posibles,double favorables)
    {
        double pFavorables = (favorables/posibles);
        double resultado = (Math.pow(pFavorables,0))*(Math.pow((1-pFavorables),(1-0)));
        return resultado;
    }

}
