package domain;

import java.io.Serializable;
import java.util.Objects;

public class Cidade implements Serializable {
    private Long idCidade;
    private String nomeCidade;
    private String uf;

    public Cidade() {
    }

    public Cidade(Long idCidade, String nomeCidade, String uf) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
        this.uf = uf;
    }

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idCidade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cidade other = (Cidade) obj;
        return Objects.equals(this.idCidade, other.idCidade);
    }

    public Long getId() {
        // Substitua o valor a seguir pelo código que obtém o ID da cidade.
        return idCidade; // Supondo que o ID da cidade seja armazenado na variável idCidade.
    }
}