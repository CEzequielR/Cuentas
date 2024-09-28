package creezan.cuentas.servicio;

import creezan.cuentas.modelo.Cuenta;

import java.util.List;

public interface ICuentaServicio {
    public List<Cuenta> listarCuentas();
    public Cuenta buscarCuentaPorId(Integer ID);
    public void guardaCuenta(Cuenta cuenta);
    public void eliminarCuenta(Cuenta contacto);

}
