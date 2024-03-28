####What is a class??####
This is the blueprint that is used to create objects
A class is like a recipe and the objects are like cookies that are made from this recipe.



####What is an Object??####
This is an instance of the class
Many objects can be made from one class-type


##Benefits of OOP:
Flexibility
Extensibility
No need to break-apart previously compiled and tested code
It is easy to reuse code

#When designing a class, keep in mind the objects that will be created from the class. It is important to consider the attributes(what the object knows) and methods(what the object does) of the objects.
Things an object knows about itself are called instance variables
Things an object can do are called methods


#When creating objects, two classes are needed. The class that is used to create the objects and another class that is used as a tester for the new class. This tester class usually contains the main() method which is where we create the objects of the specified class-type.


All Java code is defined in a class
Java programs are made up of classes and run from the main method
Instance variables represent the state of an object
Methods represent the behavior of an object



####Variables Recap####
Variables come in two forms:

Primitive
Reference

##Variable must always have a name and a type

##Variables can be used as:
Object state(instance variables)
Local variables(declared within methods)
Arguments(values sent to a method by the calling code)
Return types(values sent back to the caller of the method)

##Java is a strongly typed language and requires that you declare a variable's type.##

##A variable is a container that holds a primitive value (int, long, double) or a reference as in the case of Strings, Arrays and Objects.



####OBJECTS####
An object reference variable holds an address to an object. It does not hold the actual object but simply holds a reference to an object. A way to access the object.
The dot operator is used to tell the computer:  use the thing before the dot operator to get me the thing after the dot operator.

##An object's state affect its behavior and its behavior in turn affect its state.
The methods created in the class are the same for every object but they affect the objects differently based on the object's instance variables.


####Method Parameters####

Parameters are the variables passed into a method when it is called.
The method uses parameters while the caller passes arguments.
Parameters are local variables within the method.
If a method takes a parameter, you must pass it an argument of the type it specifies in the parameter.
All methods return something back. When the return type is void, this means they don’t' give back any value.
The return value has to be of the type specified or the compiler won't compile.
Methods can take multiple parameters. Arguments are passed in order and type according to the parameters specified.
A method can only declare one return value.


####Getters(Accessors) and Setters(Mutators)####
A getters sole purpose is to send back a return value
A setter takes an argument and uses it to set the value of an instance variable.




ABSTRACTION
Creating a generic class with characteristics that all objects of that class type have.
Disigning the rules by which objects will be created. This involves defining the attributes and behaviours that will enable created objects to work correctly.

#####Encapsulation#####

Encapsulation is:
*****Binding the data with the code that manipulates it.
*****It keeps the data and the code safe from external interference

This refers to creating classes for each entity and responsibility within a system.
Encapsulation protects instance variables so that they are not changed or mishandled as this could break the code
Encapsulation forces other code to go through setter and getter methods to access the code and in this way it has control over what can be done with the instance variable. As opposed to if the instance variable is left as public, where changes, even bad ones can be made to it.
Mark instance variables private and provide public getters and setters for access control.


####INHERITANCE AND POLYMORPHISM####

Why inheritance and polymorphism????

*Design freedom and programming flexibility
*We get rid of duplicate code by abstracting out the behavior that is common to a group of classes and put this in a superclass that these classes can inherit from. If and *whenever we need to change something that is common to these classes, we do it once in the superclass and it updates across all inheriting classes.


##Inheritance##
A subclass inherits all public members(instance variables and methods) of the super class.
A subclass can override the inherited methods but not the inherited instance variables.

##Inheritance hierarchy

Most inheritance hierarchies are wide but not deep.
Most are one or two levels deep
When a class is denoted as final, that Is where the inheritance stops and it cannot be subclassed.
*Inheritance tree

Access levels that determine what a subclass inherits from the superclass include
Private - These cannot be inherited
Default
Protected
Public - These can be inherited


*****IS-A*****
Only works in one direction
There is no backward or reverse inheritance. A subclass is a class type and can do everything  a superclass can do even if it overrides some of the methods. A superclass is not a subclass type. A square is a shape but a shape is not a square.
Only use inheritance when the subclass and superclass have an IS_A relationship.

*****HAS-A*****
This is a relationship between a class and its attributes; for instance a car class has a color, a speed, wheels.
If this is the relationship between two classes then inheritance cannot be used in that case.



*****Overriding vs Overloading****

####Method overriding####
Subclasses can extend the functionality of the superclass and modify the methods they inherit to suit their type and way of doing said method.
The methods inherited from the superclass can work for any subclass but when a subclass overrides a method, it can only work for the specific subclass and is not available to other subclasses.
When overriding a method, arguments must be the same and return types must be compatible
The method also has to be just as accessible as that of the superclass. You cannot override a public method and make it private.



####Overloading####
Overloading of a method is when a method name is used more than once but each time with different argument-list or return-type specifications. An overloaded method has nothing to do with polymorphism or inheritance. You cannot change only the return type when overloading a method, otherwise the compiler will think you are trying to override it and that is not allowed unless in the polymorphism or inheritance context


Polymorphism
Normally when creating variables from a class, the reference type matches the object type. With polymorphism the reference type and object type can be different.
The reference type can be a superclass of the object type.
Polymorphism allows us to write code that doesnt need to change when new subclass types are introduced into the program.

Polymorphic arguments and return types are also allowed:

In this way you can declare a reference variable(superclass type) and assign a subclass object to it

Superclass = Animal
Subclass = Dog

When creating object in main:

Animal myPet = new Dog();


And within a method that takes parameters;  
public void giveShot(Animal a) {

*****Polymorphism allows us to pass any object that has the Animal Class higher in its hierarchy.*****

}



