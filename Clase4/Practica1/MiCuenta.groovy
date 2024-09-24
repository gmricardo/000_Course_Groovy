package Clase4.Practica1

class MiCuenta {
    BigDecimal saldo = 0;

    void depositar(BigDecimal monto) {
        if(monto < 0){
            throw new Exception("El monto (${monto}) del deposito debe ser mayor a cero");
        }else{
            this.saldo += monto;
            println("El nuevo saldo de su cuenta es:  ${this.saldo}");
        }
    }

    void depositar(List montos){
        for(monto in montos){
            try{
                this.depositar(monto);
            }catch(e){
                println(e);
            }
        }
    }
}