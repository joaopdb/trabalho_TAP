package br.com.integrador.service;

import br.com.integrador.exception.HabilitacaoInvalidaException;
import br.com.integrador.model.Motorista;
import br.com.integrador.model.Veiculo;

import java.util.List;

public interface MotoristaService {

    void salvar(Motorista motorista);

    List<Motorista> listar();

    Motorista buscarPor(String nome);

    void remover(Motorista motorista);

    static MotoristaService getNewInstance() {
        return new MotoristaServiceMemoria();
    }
}
