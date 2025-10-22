package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(LocalDate cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "cargaHoraria=" + cargaHoraria +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }

}
