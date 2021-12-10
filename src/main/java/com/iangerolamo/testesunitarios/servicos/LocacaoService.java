package com.iangerolamo.testesunitarios.servicos;

import com.iangerolamo.testesunitarios.entidades.Filme;
import com.iangerolamo.testesunitarios.entidades.Locacao;
import com.iangerolamo.testesunitarios.entidades.Usuario;
import com.iangerolamo.testesunitarios.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static com.iangerolamo.testesunitarios.utils.DataUtils.adicionarDias;

public class LocacaoService {
    public Locacao alugarFilme(Usuario usuario, Filme filme) {
        Locacao locacao = new Locacao();
        locacao.setFilme(filme);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(new Date());
        locacao.setValor(filme.getPrecoLocacao());

        //Entrega no dia seguinte
        Date dataEntrega = new Date();
        dataEntrega = adicionarDias(dataEntrega, 1);
        locacao.setDataRetorno(dataEntrega);

        //Salvando a locacao...
        //TODO adicionar método para salvar!

        return locacao;
    }

}

