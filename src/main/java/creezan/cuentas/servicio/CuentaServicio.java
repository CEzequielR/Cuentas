package creezan.cuentas.servicio;

import creezan.cuentas.modelo.Cuenta;
import creezan.cuentas.repositorio.CuentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CuentaServicio implements ICuentaServicio {

    @Autowired
    private CuentaRepositorio cuentaRepositorio;

    @Override
    public List<Cuenta> listarCuentas() {
        return cuentaRepositorio.findAll();
    }

    @Override
    public Cuenta buscarCuentaPorId(Integer ID) {
        Cuenta cuenta = cuentaRepositorio.findById(ID).orElse(null);
        return cuenta;
    }

    @Override
    public void guardaCuenta(Cuenta cuenta) {
        cuentaRepositorio.save(cuenta);
    }

    @Override
    public void eliminarCuenta(Cuenta cuenta) {
        cuentaRepositorio.delete(cuenta);
    }
}
