package cuentas;

/**
 * Clase que representa una cuenta corriente con operaciones básicas de ingreso y retirada.
 *
 * @author ana
 */
public class CCuenta {

    /** Nombre del titular de la cuenta. */
    private String nombre;
    /** Número de cuenta bancaria. */
    private String cuenta;
    /** Saldo actual disponible en la cuenta. */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta. */
    private double tipoInterés;

    /**
     * Constructor por defecto sin parámetros.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor completo con todos los parámetros.
     * 
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo inicial de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Consulta el saldo actual de la cuenta.
     * 
     * @return Saldo actual como double
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar (debe ser positiva)
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza una retirada de la cuenta.
     * 
     * @param cantidad Cantidad a retirar (debe ser positiva y menor al saldo)
     * @throws Exception Si la cantidad es negativa o supera el saldo disponible
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular como String
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nuevo nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta bancaria.
     * 
     * @return Número de cuenta como String
     */
    public String getCuenta() {
        return cuenta;
    }
    
    /**
     * Establece el número de cuenta bancaria.
     * 
     * @param cuenta Nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return Saldo actual como double
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Nuevo saldo (debe ser >= 0)
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return Tipo de interés (tanto por 1) como double
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    
    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés Nuevo tipo de interés (tanto por 1)
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

