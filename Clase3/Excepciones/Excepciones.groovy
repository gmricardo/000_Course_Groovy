println("Exception1.....................")
def numero = 123
def resultado
try{
    resultado = numero/0
}catch(e){
    println(e)
    resultado = 0
}

println("Siga con el codigo... " + resultado)


println("Exception2.....................")
numero = '123a'

try {
    numero = numero.toLong()
    println(numero/1)
} catch (NumberFormatException e) {
    println("No se puede dar formato a una cadena de texto")
    println(e)
    return
} catch (ArithmeticException e) {
    println("No se puede dividir por cero")
    println(e)
    return
} finally {
    println("Siempre se ejecuta.....")
}

println("Sigue el programa.....")