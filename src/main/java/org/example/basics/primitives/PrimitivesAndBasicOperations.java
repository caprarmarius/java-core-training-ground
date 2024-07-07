package org.example.basics.primitives;

import org.testng.annotations.Test;

public class PrimitivesAndBasicOperations {

    @Test
    public void fakeMain() {

        //A variable is a structure that holds a data value in memory (similar with variables in math that can hold values)
        //Variables have names
        //Declaration = creating a variable (allocating a place) in memory with a given name in a declarative manner.
        //Most of the times, declaration is done: type variable-name;
        //In example below, the type of variable is int (has integer values)
        int x;

        //Attribution = giving or changing the value of a variable
        //It is done with = sign, therefore the = sign is not used to represent the meaning of "equal" but it means "takes value"
        //Make sure that the type of value is right (int in example, because we declared x as int)
        //Initialization = the first time we attribute a value to a variable.
        //Example below is an initialization (because it's the first time)
        x = 5; //initialization

        //Examples below are simple attributions to x
        x = 7; //attribution
        x = 10;
        x = 2;

        //What do you think will be the value of x after all the attributions above?

        //We can also initialize a variable right when declaring it
        int y = 59; //declaration and initialization at the same time

        //Java is an Object Oriented language based on C programming language
        //Even if in Object Oriented Programming (OOP), the consensus is that all data values are objects
        //there are still the basic data types that have been inherited from C. (except for boolean)
        //These are called Primitive Data Types in Java and their values are not objects.

        //There are 8 primitive data types in Java
        /*They are:
            int - integer values (-5, 2 , 3)
            byte - stores values that occupies only one byte in memory (used for byte streams etc.)
            short - stores small integer values and occupies less memory than int
            long - integer values that allow larger values than int limit range (occupies more memory)
            float - floating point numbers (1.5, 5.75, -3.2)
            double - double precision floating point numbers (more precise than float)
            boolean - true/false (it can only take these two possible values)
            char - denotes a literal character('a' character for example)
         */

        //int - primitive integer
        //values of integer numbers between -2,147,483,648 and 2,147,483,647
        //occupies 4 bytes of memory
        int intExample = 1250; //this  allocates 4 bytes in memory and stores the value 1250 in there

    }
}
