package com.mycompany.conversortemperaturas.utils;

public class ConversorLogica {

    public ConversorLogica() {
    }

    // Convierte grados Celsius a Fahrenheit usando la fórmula: (C * 9/5) + 32
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // Convierte grados Fahrenheit a Celsius usando la fórmula: (F - 32) * 5/9
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    // Convierte grados Celsius a Kelvin sumando 273.15
    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convierte Kelvin a grados Celsius restando 273.15
    public static double kelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Convierte grados Fahrenheit a Kelvin usando la fórmula: (F - 32) * 5/9 + 273.15
    public static double fahrenheitAKelvin(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0 + 273.15;
    }

    // Convierte Kelvin a grados Fahrenheit usando la fórmula: (K - 273.15) * 9/5 + 32
    public static double kelvinAFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9.0 / 5.0 + 32.0;
    }
}
