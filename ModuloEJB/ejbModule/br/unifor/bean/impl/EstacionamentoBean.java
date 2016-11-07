package br.unifor.bean.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import br.unifor.bean.EstacionamentoBeanRemote;
import br.unifor.entity.Estacionamento;

@Stateless
public class EstacionamentoBean implements EstacionamentoBeanRemote {

	static private Map<Integer, Estacionamento> estacionamentosMap;

	static {
		estacionamentosMap = new HashMap<Integer, Estacionamento>();

		Estacionamento e1 = new Estacionamento();
		e1.setId(1L);
		e1.setCodigo("12345");

		estacionamentosMap.put(e1.getId().intValue(), e1);

		Estacionamento e2 = new Estacionamento();
		e2.setId(2L);
		e2.setCodigo("54321");

		estacionamentosMap.put(e2.getId().intValue(), e2);

	}

	@Override
	public Collection<Estacionamento> lista() {
		// TODO Auto-generated method stub
		return new ArrayList<Estacionamento>(estacionamentosMap.values());
	}

	@Override
	public String insere(Estacionamento estacionamento) {
		estacionamento.setId(estacionamentosMap.size() + 1L);
		estacionamentosMap.put(estacionamento.getId().intValue(), estacionamento);
		return "Estacionamento " + estacionamento.getCodigo() + " adicionado.";
	}

	@Override
	public String remove(Long id) {
		estacionamentosMap.remove(id);
		return "Estacionamento removido.";
	}

	@Override
	public Estacionamento busca(Long id) {
		System.out.println("ID: " + id);
		return estacionamentosMap.get(id.intValue());
	}

	@Override
	public String altera(Estacionamento estacionamento) {
		estacionamento.setId(estacionamentosMap.size() + 1L);
		if (estacionamentosMap.containsKey(estacionamento.getId().intValue())) {
			estacionamentosMap.put(estacionamento.getId().intValue(), estacionamento);
			return "Estacionamento " + estacionamento.getCodigo() + " alterado.";
		} else {
			return "Cadastro Não Existe";
		}
	}
}
