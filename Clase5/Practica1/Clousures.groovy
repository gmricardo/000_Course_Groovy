def MetodoList(Closure miClousure){
    def list = [1, 2, 3, 4, 5];
    list.collect(miClousure);
}

def MetodoMap(Closure miClousure){
    def mapa = [id:123, nombres: 'Ricardo', apellidos: 'Garzón Medina']
    mapa.collect(miClousure);
}

def miClosure = { println it }

MetodoList(miClosure)
println("______________________________")
MetodoMap(miClosure)

println("____________________________________")
def mapa = [id:123, nombres: 'Ricardo', apellidos: 'Garzón Medina']
mapa.each { elemento -> println("Llave: ${elemento.key}     Valor: ${elemento.value}") }