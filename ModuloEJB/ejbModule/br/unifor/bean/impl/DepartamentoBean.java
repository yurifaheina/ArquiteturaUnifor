package br.unifor.bean.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import br.unifor.bean.DepartamentoBeanRemote;
import br.unifor.entity.Departamento;

@Stateless
public class DepartamentoBean implements DepartamentoBeanRemote {

	static private Map<Integer, Departamento> departamentosMap;

	static {
		departamentosMap = new HashMap<Integer, Departamento>();

		Departamento e1 = new Departamento();
		e1.setId(1L);
		e1.setNome("Recursos Humanos");
		e1.setCodigo("321123");
		departamentosMap.put(e1.getId().intValue(), e1);

		Departamento e2 = new Departamento();
		e2.setId(2L);
		e2.setNome("Almoxarifado");
		e2.setCodigo("123456");

		departamentosMap.put(e2.getId().intValue(), e2);

	}

	@Override
	public Collection<Departamento> lista() {
		// TODO Auto-generated method stub
		return new ArrayList<Departamento>(departamentosMap.values());
	}

	@Override
	public String insere(Departamento departamento) {
		departamento.setId(departamentosMap.size() + 1L);
		departamentosMap.put(departamento.getId().intValue(), departamento);
		return "Departamento " + departamento.getNome() + " adicionado.";
	}

	@Override
	public String remove(Long id) {
		departamentosMap.remove(id);
		return "Departamento removido.";
	}

	@Override
	public Departamento busca(Long id) {
		System.out.println("ID: " + id);
		return departamentosMap.get(id.intValue());
	}

	@Override
	public String altera(Departamento departamento) {
		departamento.setId(departamentosMap.size() + 1L);
		if (departamentosMap.containsKey(departamento.getId().intValue())) {
			departamentosMap.put(departamento.getId().intValue(), departamento);
			return "Departamento " + departamento.getNome() + " alterado.";
		} else {
			return "Cadastro Não Existe";
		}
	}
}
