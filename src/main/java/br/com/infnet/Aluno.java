package br.com.infnet;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class Aluno {
    private Long matricula;
    private String nome;
    private LocalDate dataNascimento;

    public static void sayHello(){
        System.out.println("Ola");
    }

}
