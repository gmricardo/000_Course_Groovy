// Definición del enumerador de días de la semana
enum DiasSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}

def rango = DiasSemana.LUNES..DiasSemana.DOMINGO


if(rango.contains(DiasSemana.MIERCOLES)){
    println("El día consultado pertenece al rango")
}else{
    println("No se encuentra")
}

println rango.from
println rango.to