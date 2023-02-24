package br.com.alura.leilao.acceptance.steps;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.math.BigDecimal;

public class PropondoLanceEnglishSteps {

    private Lance lance;
    private Leilao leilao;

    @Given("Dado um lance valido en")
    public void dado_um_lance_valido_en() {
        BigDecimal valor = BigDecimal.TEN;
        Usuario usuario = new Usuario("Fulano");
        this.lance = new Lance(usuario,valor);
    }
    @When("Quando propoe o lance en")
    public void quando_propoe_o_lance_en() {
        this.leilao = new Leilao("Tablet");
        this.leilao.propoe(this.lance);
    }
    @Then("Entao o lance e aceito en")
    public void entao_o_lance_e_aceito_en() {
        Assert.assertEquals(1, leilao.getLances().size());
        Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());

    }

}
