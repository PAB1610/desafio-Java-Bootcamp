package br.com.dio.desafio.dominio;

import java.time.LocalDate;
/**Tudo que eu tenho em Conteudo eu tenho em Mentoria mas nem tudo que eu tenho em
 * Conteúdo eu tenho em Mentoria. A classe Mentoria é filha da Classe Conteudo*/
public class Mentoria extends Conteudo{
   /* private String titulo;
    private String descricao; */ // esses dois já tem na classe mãe
    private LocalDate data;

    public Mentoria() {

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
