package br.edu.cs.poo.ac.seguro.entidades;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor

public class Veiculo implements Serializable{
    private String placa;
    private int ano;
    private SeguradoEmpresa proprietarioEmpresa;
    private SeguradoPessoa proprietarioPessoa;
    private CategoriaVeiculo categoria;


    public Veiculo(String placa, int i, Object o, Object o1, CategoriaVeiculo categoriaVeiculo) {
    }
}
