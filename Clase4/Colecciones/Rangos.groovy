def rango = 1..5;
println rango.size();
println rango.get(3);
println(rango[3]);
println rango.contains(3);

println("________________________________")
def rango2 = 5..<10;
for (i in rango2) {
    println(i)
}
println rango2.from
println rango2.to

println("________________________________")
def rango3 = "a".."f"
for (i in rango3) {
    println(i)
}
println("________________________________")
def rango4 = 1..3
(rango4).each{
    elemento -> println (elemento)
}