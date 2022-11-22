package br.com.nowbank.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException (String msg){
        super(msg);
    }

}
