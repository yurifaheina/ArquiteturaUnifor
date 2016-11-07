package br.unifor.bean;

import java.util.Collection;

import javax.ejb.Remote;

import br.unifor.entity.Departamento;

@Remote
public interface DepartamentoBeanRemote {

    public Collection<Departamento> lista();
    public String insere(Departamento departamento);
    public String remove(Long id);    
    public Departamento busca(Long id);
    public String altera(Departamento departamento);
}
