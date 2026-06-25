package com.mycompany.conversortemperaturas;

import com.mycompany.conversortemperaturas.ui.ConversorFrame;

public class ConversorTemperaturasApp {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ConversorFrame().setVisible(true);
        });
    }

}
