// [Llave: valor]
def mapa = [id:123, nombres: 'Ricardo', apellidos: 'Garzón Medina']
println(mapa.get('id'));
println(mapa.get('nombres'));
mapa.each{
    elemento -> println("Llave: ${elemento.key}     Valor: ${elemento.value}")
}




println("________________________________")
def mapaVacio = [:];
mapaVacio.put("id","1");
println(mapaVacio.get('id'));