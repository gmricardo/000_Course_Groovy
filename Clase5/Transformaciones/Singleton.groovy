import groovy.transform.Singleton

@Singleton
class Person {
    String firstName
    String lastName
}

def p1 = new Person(firstName: 'Ricardo', lastName:'Garzon Medina');
def p2 = new Person('Ricardo');
def p3 = new Person('Ricardo','Garzon Medina')

println(p1.lastName)