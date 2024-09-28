package creezan.cuentas.repositorio;

import creezan.cuentas.modelo.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer> {
}

