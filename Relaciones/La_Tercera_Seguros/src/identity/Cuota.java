/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

import java.util.Date;

/**
 *
 * @author ing_j
 */

//Cuota ----------------------------> Poliza /// *-1
public class Cuota {
    private int numeroCuota;
    private double montoTotalCuota;
    private boolean estaPagada;
    private Date fechaVencimiento;
    private String formaPago;
    private Poliza poliza;

    public Cuota() {
    }

    public Cuota(int numeroCuota, double montoTotalCuota, boolean estaPagada, Date fechaVencimiento, String formaPago, Poliza poliza) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.estaPagada = estaPagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
        this.poliza = poliza;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isEstaPagada() {
        return estaPagada;
    }

    public void setEstaPagada(boolean estaPagada) {
        this.estaPagada = estaPagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }
    
    
}
