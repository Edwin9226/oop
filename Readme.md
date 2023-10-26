
* Object 

. Real-world objects share two characteristics, state and behavior.
. Dosgs have state(name, color , breed, hungry) and bejhavior (barking, wagging, tail.)

* Class
 . some object of same kind.
* Package
* Inherance

* Lambda vs JAva Method 
A method (or function) in java has thes main parts:
- Name
- Parameter List
- Body
- return type
A lambda expression in  java has these main parts:
- No name - as this anonymous function there is no name needed 
- Parameter List
- Body .. This is main part od=f the function
- NO return type.. You don't need to mention the return type in lamdda's 8+
compiler is able to infer the return type by checking the code.

* Lambda Expresion
  * ()  ->  {}
  * Lamda Input Parameters   Arrow   Lambda Body

* Usages of Lambda
- Lambda is mainly used to implement functional interfaces. Any interface with a
SAM (Single Abstraction Method) is a Functional interfaces, and its implement may 
be treated expressions.

** Java Functional Interface

-- the term JFI was inr¿troduced in JAva 8
-- A kfunctional interface in JAva is an interface that contain only a single abstract method which is unimplemented
-- A functional interface can contain default and static metods wich do have an implementation, in addition to the 
single unimplemented method

Some of the ueful java 8 Functional Interface are:

-- Consumer: DoubleConsumer, IntConsumer, LongConsumer, BiConsumer
-- Supplier: IntSupplier, DoubleSupplier, and LonSupplier
-- Function: BiFunction, UnaryOperator, BinaryOperator
-- Predicate: IntPredicate, DoublePredicate, LongPredicate, BiPredicate


** Java Consumer Interface

-- The consumer I is a part java.util.function package.
-- The CI has been introduced sine JAva8, It is use dto implement Functional progran¿mming in java 
-- It represents a function wich takes in one argument and produces a result

** BiConsumer Interface
-- The consumer I is a part java.util.function package.
-- The CI has been introduced sine JAva8, It is use dto implement Functional progran¿mming in java
-- It represents a function wich takes in two argument and produces a result
-- ByConsumer does notreturn ay result  

** Predicate
-- JAva8 introduced
-- PRedicate is single argument function wich return strue or false
-- Predicate has test method wich returns true or false