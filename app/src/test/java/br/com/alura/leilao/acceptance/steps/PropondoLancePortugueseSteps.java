package br.com.alura.leilao.acceptance.steps;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.math.BigDecimal;

public class PropondoLancePortugueseSteps {

    private Lance lance;
    private Leilao leilao;

    @Dado("um lance valido pt")
    public void dado_um_lance_valido_pt() {
        BigDecimal valor = BigDecimal.TEN;
        Usuario usuario = new Usuario("Fulano");
        this.lance = new Lance(usuario,valor);
    }
    @Quando("propoe o lance pt")
    public void quando_propoe_o_lance_pt() {
        this.leilao = new Leilao("Tablet");
        this.leilao.propoe(this.lance);
    }
    @Entao("o lance e aceito pt")
    public void entao_o_lance_e_aceito_pt() {
        Assert.assertEquals(1, leilao.getLances().size());
        Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());

    }

}
