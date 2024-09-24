package Clase3.Practica1

public class CuentaDemo {
    BigDecimal balance = 0;
    String tipoCuenta;

    public CuentaDemo (tipo) {
        this.tipoCuenta = tipo;
    }

    void depositar (dinero) {
        this.balance += dinero;
        println("Se ha agregado dinero a su cuenta ${this.tipoCuenta}. Su nuevo saldo es: ");
        println(this.balance);
    }

    void retirar (dinero) {
        this.balance -= dinero;
        println("Se ha retirado dinero de su cuenta ${this.tipoCuenta}. Su nuevo saldo es: ");
        println(this.balance);
    }
}

