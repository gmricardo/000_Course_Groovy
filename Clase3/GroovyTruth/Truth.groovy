// Expresiones booleanas
assert true
    //assert false      //false

// Colecciones y arreglos
assert [1,2,3]
    // assert []        //false

//En Groovy, los caracteres especiales que necesitan ser escapados generalmente incluyen . ? * + [ ] { } ( ) \
assert "gato" =~ /g/
assert "Hola. Gato" =~ /\./

//mapas
assert ['id':1]

// String
assert 'a'
assert !''


