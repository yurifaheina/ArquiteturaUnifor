package br.unifor.bean.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import br.unifor.bean.ProjetoBeanRemote;
import br.unifor.entity.Projeto;

@Stateless
public class ProjetoBean implements ProjetoBeanRemote {

	static private Map<Integer, Projeto> projetosMap;

	static {
		projetosMap = new HashMap<Integer, Projeto>();

		Projeto e1 = new Projeto();
		e1.setId(1L);
		e1.setNome("Arqitetura");
		e1.setDescricao("Novo Projeto");
		projetosMap.put(e1.getId().intValue(), e1);

		Projeto e2 = new Projeto();
		e2.setId(2L);
		e2.setNome("Minhas Vacinas");
		e2.setDescricao("WEB I");

		projetosMap.put(e2.getId().intValue(), e2);

	}

	@Override
	public Collection<Projeto> lista() {
		// TODO Auto-generated method stub
		return new ArrayList<Projeto>(projetosMap.values());
	}

	@Override
	public String insere(Projeto projeto) {
		projeto.setId(projetosMap.size() + 1L);
		projetosMap.put(projeto.getId().intValue(), projeto);
		return "Projeto " + projeto.getNome() + " adicionado.";
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Projeto busca(Long id) {
		System.out.println("ID: " + id);
		return projetosMap.get(id.intValue());
	}

	@Override
	public String altera(Projeto projeto) {
		// TODO Auto-generated method stub
		return null;
	}
}
