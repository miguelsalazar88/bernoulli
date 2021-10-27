package vista;

import controlador.Controlador;

import javax.swing.*;

public class Ventana extends JFrame {

    private Controlador controlador;
    private Panel panel = new Panel();
    private JButton botonCalcular = new JButton("Calcular");
    private JTextField JTFTotal = new JTextField();
    private JTextField JTFExito = new JTextField();
    private JTextField JTFresultadoExito = new JTextField();
    private JTextField JTFresultadoFracaso = new JTextField();
    private JLabel labelTotal = new JLabel("Número Total de Eventos:");
    private JLabel labelEventosExito = new JLabel("Número de Eventos Exitosos:");
    private JLabel labelResultadoExito = new JLabel("Probabilidad de Exito: ");
    private JLabel labelResultadoFracaso = new JLabel("Probabilidad de Fracaso:");


    public Ventana(){
        this.setSize(477,500);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Distribución de Bernoulli");
        this.initComponents();
    }

    private void initComponents() {
        this.add(panel);
        this.add(labelTotal);
        this.labelTotal.setBounds(10,150,200,30);
        this.add(labelEventosExito);
        this.labelEventosExito.setBounds(10,180,200,30);
        this.add(botonCalcular);
        this.botonCalcular.setBounds(200,250,100,30);
        this.add(labelResultadoExito);
        this.labelResultadoExito.setBounds(10,400,200,30);
        this.add(labelResultadoFracaso).setBounds(10,430,200,30);
        this.add(JTFTotal);
        this.JTFTotal.setBounds(200,150,200,30);
        this.add(JTFExito);
        this.JTFExito.setBounds(200,180,200,30);
        this.add(JTFresultadoExito);
        this.JTFresultadoExito.setEditable(false);
        this.JTFresultadoExito.setBounds(200,400,200,30);
        this.add(JTFresultadoFracaso);
        this.getJTFresultadoFracaso().setEditable(false);
        this.JTFresultadoFracaso.setBounds(200,430,200,30);
    }

    public void setController(Controlador cont){
        this.controlador = cont;
        this.botonCalcular.addActionListener(this.controlador);
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public JButton getBotonCalcular() {
        return botonCalcular;
    }

    public void setBotonCalcular(JButton botonCalcular) {
        this.botonCalcular = botonCalcular;
    }

    public JTextField getJTFTotal() {
        return JTFTotal;
    }

    public void setJTFTotal(JTextField JTFTotal) {
        this.JTFTotal = JTFTotal;
    }

    public JTextField getJTFExito() {
        return JTFExito;
    }

    public void setJTFExito(JTextField JTFExito) {
        this.JTFExito = JTFExito;
    }

    public JTextField getJTFresultadoExito() {
        return JTFresultadoExito;
    }

    public void setJTFresultadoExito(JTextField JTFresultadoExito) {
        this.JTFresultadoExito = JTFresultadoExito;
    }

    public JTextField getJTFresultadoFracaso() {
        return JTFresultadoFracaso;
    }

    public void setJTFresultadoFracaso(JTextField JTFresultadoFracaso) {
        this.JTFresultadoFracaso = JTFresultadoFracaso;
    }
}
