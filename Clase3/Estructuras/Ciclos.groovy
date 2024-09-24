// Ciclo for
println("Ciclo for clasico")
for(int i=0; i<5; i++){
    println(i)
}

// Ciclo de for clasico mejorado
println("Ciclo de for clasico mejorado")
def listaIterador = []
def listaElementos = []
for (int elemento = 0, iterador = 0; iterador < 5; iterador++, elemento--) {
    listaIterador << iterador
    listaElementos << elemento
}
println(listaIterador)
println(listaElementos)


// Multiaisgnación
def (String x, int y) = ['abc', 3];


//Multiasignación ciclo for
def listaMultiasignacion = []
println("Multiasignación ciclo for")
for (def(String a, int b) = ['Go', 3]; b < 10; b++, a+='o'){
    listaMultiasignacion << b;
    println(a+'L')
    //println(b)
}
println(listaMultiasignacion)


// Ciclo for in
println("Ciclo for in")
// Puede utilizar 0..9, [0,1,2,3,4]
for (i in 0..19){
    println(i)
}

// Ciclo while
println("Ciclo While")
def cont = 0;
while(cont<5){
    println(cont);
    cont++;
}

// Ciclo doWhile
println("Ciclo doWhile")
def cont1 = 0
def listaDoWhile = []
do{
    listaDoWhile << cont1
    cont1++
}while(cont1<10)
println(listaDoWhile)