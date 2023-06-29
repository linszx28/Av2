/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lins2800;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
    Endereco endereco = new Endereco("Rua dos Beija", "61", "Ao lado do módulo", "13146-47", "Salvador", UnidadeFederativa.BAHIA);
    Engenheiro engenheiro = new Engenheiro("2455741", "Luiza", "013154654", "213484", endereco, Setor.ENGENHARIA, Genero.FEMININO, 2000.35, EstadoCivil.SOLTEIRO, LocalDate.of(2004, Month.JANUARY, 20));
    Motoboy motoboy = new Motoboy("21254545", "Bruno", "58475287", "3232449", endereco, Setor.OPERACOES, Genero.MASCULINO, 1500.10, EstadoCivil. DIVORCIADO, LocalDate.of(2001, Month.MARCH, 01));
    Gerente gerente = new Gerente("Manu", "246872", "548748", endereco, Setor.OPERACOES, Genero.FEMININO, 3000.25, EstadoCivil.SOLTEIRO, LocalDate.of(2004, Month.JUNE, 20));
    Diretor diretor = new Diretor("Carlos", "245465", "5465468", endereco, Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 12200.20, EstadoCivil.CASADO, LocalDate.of(1998, Month.MAY, 28));
    
        System.out.println(endereco);
        System.out.println("");
        System.out.println(engenheiro);
        System.out.println("");
        System.out.println(motoboy);
        System.out.println("");
        System.out.println(gerente);
        System.out.println("");
        System.out.println(diretor);
    
       
    }
}
    
