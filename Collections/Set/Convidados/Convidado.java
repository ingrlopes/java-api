package Convidados;
import java.util.Objects;

public class Convidado {

    private String nome;
    private int codConvite;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
            if (!(o instanceof Convidado convidado)) return false;
                return getCodConvite() == convidado.getCodConvite();
    }

    public int hashCode() {
        return Objects.hash(getCodConvite());
    }

    public String toString() {
        return "Convidado{" +
            "nome='" + nome + '\'' +
            ", codigo de convite=" + codConvite +
            '}';
    }
}