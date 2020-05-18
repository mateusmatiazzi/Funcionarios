package com.example.funcionarios.service;

import com.example.funcionarios.domain.Funcionario;
import com.example.funcionarios.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario salvarFuncionario(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public Iterable<Funcionario> retornarTodosFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario encontrarFuncionarioPorId(Long id){
        return funcionarioRepository.getById(id);
    }

    public void deletar(Long id){
        funcionarioRepository.deleteById(id);
    }
}
