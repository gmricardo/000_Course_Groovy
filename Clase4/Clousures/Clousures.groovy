{ println("Hola") }
//{ -> println("Hola2") }
{ it -> println(it); }
def myClousure = { int a, String b -> println (a+b)}

myClousure(3,"4");