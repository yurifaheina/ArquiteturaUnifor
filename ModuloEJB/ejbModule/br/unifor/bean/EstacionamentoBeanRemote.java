package br.unifor.bean;


import java.util.Collection;

import javax.ejb.Remote;

import br.unifor.entity.Estacionamento;

@Remote
public interface EstacionamentoBeanRemote {

    public Collection<Estacionamento> lista();
    public String insere(Estacionamento estacionamento);
    public String remove(Long id);    
    public Estacionamento busca(Long id);
    public String altera(Estacionamento estacionamento);
}

