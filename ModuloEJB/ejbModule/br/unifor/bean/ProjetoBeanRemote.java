package br.unifor.bean;

import java.util.Collection;

import javax.ejb.Remote;

import br.unifor.entity.Projeto;

@Remote
public interface ProjetoBeanRemote {

    public Collection<Projeto> lista();
    public String insere(Projeto projeto);
    public String remove(Long id);    
    public Projeto busca(Long id);
    public String altera(Projeto projeto);
}
