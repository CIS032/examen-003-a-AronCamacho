/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author AronChocama
 */
@Entity
@Table(name = "CUENTA", catalog = "", schema = "ADMINISTRADOR")
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c")
    , @NamedQuery(name = "Cuenta.findByNumcuenta", query = "SELECT c FROM Cuenta c WHERE c.numcuenta = :numcuenta")
    , @NamedQuery(name = "Cuenta.findByCliente", query = "SELECT c FROM Cuenta c WHERE c.cliente = :cliente")
    , @NamedQuery(name = "Cuenta.findByTipoCuenta", query = "SELECT c FROM Cuenta c WHERE c.tipoCuenta = :tipoCuenta")
    , @NamedQuery(name = "Cuenta.findByMovimiento", query = "SELECT c FROM Cuenta c WHERE c.movimiento = :movimiento")
    , @NamedQuery(name = "Cuenta.findByFecha", query = "SELECT c FROM Cuenta c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cuenta.findBySaldo", query = "SELECT c FROM Cuenta c WHERE c.saldo = :saldo")})
public class Cuenta implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMCUENTA")
    private String numcuenta;
    @Column(name = "CLIENTE")
    private String cliente;
    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;
    @Column(name = "MOVIMIENTO")
    private String movimiento;
    @Column(name = "FECHA")
    private String fecha;
    @Column(name = "SALDO")
    private String saldo;

    public Cuenta() {
    }

    public Cuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        String oldNumcuenta = this.numcuenta;
        this.numcuenta = numcuenta;
        changeSupport.firePropertyChange("numcuenta", oldNumcuenta, numcuenta);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        String oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        String oldTipoCuenta = this.tipoCuenta;
        this.tipoCuenta = tipoCuenta;
        changeSupport.firePropertyChange("tipoCuenta", oldTipoCuenta, tipoCuenta);
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        String oldMovimiento = this.movimiento;
        this.movimiento = movimiento;
        changeSupport.firePropertyChange("movimiento", oldMovimiento, movimiento);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        String oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        String oldSaldo = this.saldo;
        this.saldo = saldo;
        changeSupport.firePropertyChange("saldo", oldSaldo, saldo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numcuenta != null ? numcuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.numcuenta == null && other.numcuenta != null) || (this.numcuenta != null && !this.numcuenta.equals(other.numcuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vista.Cuenta[ numcuenta=" + numcuenta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
