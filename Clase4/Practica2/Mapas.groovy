def DiasSemana = [1:"LUNES", 2:"MARTES", 3:"MIERCOLES", 4:"JUEVES", 5:"VIERNES", 6:"SABADO", 7:"DOMINGO"];
println(DiasSemana);
println(DiasSemana.getClass().getName());
println(DiasSemana.size());
def valorEliminar = "SABADO";
def claveEliminar = DiasSemana.find { clave, valor -> valor == valorEliminar }?.key
DiasSemana.remove(claveEliminar)
// DiasSemana.minus(6:"SABADO")
println(DiasSemana)
DiasSemana.put("6","SABADO");
println(DiasSemana)