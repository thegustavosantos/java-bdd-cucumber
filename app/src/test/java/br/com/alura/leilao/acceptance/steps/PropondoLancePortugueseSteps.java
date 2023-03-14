package br.com.alura.leilao.acceptance.steps;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import ch.qos.logback.core.BasicStatusManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PropondoLancePortugueseSteps {

    private Lance lance;
    private Leilao leilao;
    private ArrayList<Lance> lista;

    @Before
    public void setup(){
        this.lista = new ArrayList<Lance>();
        this.leilao = new Leilao("Tablet");
    }

    @Dado("um lance valido")
    public void dadoUmLanceValido() {
        BigDecimal valor = BigDecimal.TEN;
        Usuario usuario = new Usuario("Fulano");
        this.lance = new Lance(usuario,valor);
    }

    @Quando("propoe o lance ao leilao")
    public void quandoPropoeOLanceAoLeilao() {
        this.leilao.propoe(this.lance);
    }

    @Entao("o lance e aceito")
    public void entaoOLanceEhAceito() {
        Assert.assertEquals(1, leilao.getLances().size());
        Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());
    }

    @Dado("um lance de {double} reais do usuario {string}")
    public void um_lance_de_reais_do_usuario(Double valor, String nomeUsuario) {
        Lance lance = new Lance(new Usuario(nomeUsuario), new BigDecimal(valor));
        lista.add(lance);
    }

    @Quando("propoe ao leilao")
    public void propoe_ao_leilao() {
        this.lista.forEach(lance -> leilao.propoe(lance));
    }

    @Entao("os lances sao aceitos")
    public void os_lances_sao_aceitos() {
        Assert.assertEquals(this.lista.size(), leilao.getLances().size());
        Assert.assertEquals(this.lista.get(0).getValor(), leilao.getLances().get(0).getValor());
        Assert.assertEquals(this.lista.get(1).getValor(), leilao.getLances().get(1).getValor());
    }

    @Dado("um lance de {double} reais e do usuario {string}")
    public void um_lance_de_reais(Double valor, String usuario) {
        this.lance = new Lance(new BigDecimal(valor));
        System.out.println(usuario);

    }

    @Entao("o lance nao eh aceito")
    public void nao_eh_aceito() {
        Assert.assertEquals(0,this.leilao.getLances().size());

    }

    @Entao("o segundo lance nao eh aceito")
    public void o_segundo_lance_nao_eh_aceito() {
        Assert.assertEquals(1, leilao.getLances().size());
        Assert.assertEquals(this.lista.get(0).getValor(), leilao.getLances().get(0).getValor());
    }

    @Dado("um dois lances")
    public void um_dois_lances(DataTable dataTable) {

        List<Map<String, String>> valores = dataTable.asMaps();

        valores.forEach( item -> {
            String valor = item.get("valor");
            String usuario = item.get("nomeUsuario");
            Lance lance = new Lance(new Usuario(usuario), new BigDecimal(valor));
            this.lista.add(lance);

        });

    }


}
