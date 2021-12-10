package com.iangerolamo.testesunitarios.servicos;

import com.iangerolamo.testesunitarios.entidades.Filme;
import com.iangerolamo.testesunitarios.entidades.Locacao;
import com.iangerolamo.testesunitarios.entidades.Usuario;
import com.iangerolamo.testesunitarios.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LocacaoServiceTest {

    @Test
    public void teste() {
        // cenário
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuario 1");
        Filme filme = new Filme("Filme 2", 2, 5.0);

        //ação
        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificação
        Assert.assertTrue(locacao.getValor() == 5);
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
    }
}
