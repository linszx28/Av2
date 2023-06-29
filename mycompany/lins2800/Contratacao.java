/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lins2800;

/**
 *
 * @author Aluno
 */
public interface Contratacao {
    public static void adimitir(Funcionario funcionario){
        System.out.println("Admitindo o funcionario:" + funcionario.toString());
    }
    public static void demitir(Funcionario funcionario){
        System.out.println("Demitindo o funcionario:" + funcionario.toString());
    }
}
