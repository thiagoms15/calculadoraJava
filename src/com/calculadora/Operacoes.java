/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora;

/**
 *
 * @author thiagomarques
 */
public class Operacoes {
    
    /**
     * @brief Funcao para somar dois numeros
     * @param a
     * @param b
     * @return
     */
    public static double soma(double a, double b)
    {
        double soma = a + b;
        return soma;
    }
    
    /**
     * @brief Funcao para subtrair dois numeros
     * @param a
     * @param b
     * @return
     */
    public static double subtracao(double a, double b)
    {
        double sub = a - b;
        return sub;
    }
    
    /**
     * @brief Funcao para multiplicar dois numeros
     * @param a
     * @param b
     * @return
     */
    public static double multiplicacao(double a, double b)
    {
        double mult = a * b;
        return mult;
    }

    /**
     * @brief Funcao para dividir
     * @param a
     * @param b
     * @return
     * @todo implementar try-catch
     */
    public static double divisao(double a, double b)
    {
        double div = a / b;
        return div;
    }
}
