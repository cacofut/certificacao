public interface Animal { public default String getName() { return null; } }
interface Mammal { public default String getName() { return null; } }
abstract class Otter implements Mammal, Animal {}

/*
16. What individual changes, if any, would allow the following code to compile? (Choose all
that apply)

A. The code compiles without issue.
B. Remove the default method modifier and method implementation on line 1.
C. Remove the default method modifier and method implementation on line 2.
D. Remove the default method modifier and method implementation on lines 1 and 2. (X)
E. Change the return value on line 1 from null to "Animal".
F.Override the getName() method with an abstract method in the Otter class. (X)
G. Override the getName() method with a concrete method in the Otter class. (X)
*/
