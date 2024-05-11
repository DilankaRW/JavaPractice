/*
Access Modifiers

Classes - Public / Default  ( For Classes can be use only Public and Default. )
Methods , Variables - Public / Default / Private / Protected (Can use all Access Modifiers.)

Public - Anyone can access.
Default - Access within package.
Protected - Access within Package and subclass. (*** If the class is inherited (extends) outside the package, it can be accessed. ***)
Private - Only the declared class.
 */

/////////////////////////////  Classes  /////////////////////////////////

package Access_Modifiers_One;

import Access_Modifiers_Two.saman;

public class kamal { // For Classes - Public / Default

//    public int x = 10; // For Variables - Public / Default / Private / Protected
//     void Test(){} // For Methods , Variables - Public / Default / Private / Protected. (This is Default method (No public modifier)).
    public static void main(String[] args) {
        nimal obj1 = new nimal();
        saman obj2 = new saman();
    }
}
