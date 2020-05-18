package com.example.funcionarios.repository;

import com.example.funcionarios.domain.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends CrudRepository <Funcionario, Long> {
    Funcionario getById(Long id);
}
