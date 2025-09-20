package Accessmodifiers;

public class Documentation {
// public
    /**
     Accessible within and outside the class  (refer class Allintwo) AND ALLINONE
     */


// private
    /**
     /** Accessible only within this class .
     To access a private variable from another class  and Another package in Java (use getter and setter methods).

     Private (variables) and (METHODS) cannot be accessed directly outside their own class,
     so you need to provide public methods that allow controlled access
     to those variables and Methods ( GETTER AND SETTER)
     */


//Protected
    /***
     *   Accessible with-in the same class  , same  package and
     *   outside the package (ONLY THROUGH CHILD CLASS)
     *   WITHIN THE PACKAGE (Don't need to extend class )
     *   OUTSIDE THE PACKAGE (Need to extend class )
     */




//Default
    /**
     * Default (Package-Private):
     *
     * If no access modifier is specified, it is considered "default" or "package-private".
     * This allows visibility only within the same package. Classes, methods, and variables
     * declared with default access cannot be accessed from classes in different packages.
     *
     */


/*  Summary of Access Modifiers:
   Modifier	Class	 Package	Subclass	 World
  public	Yes  	Yes  	    Yes	         Yes
  protected	Yes	    Yes     	Yes          No
  private	Yes  	No	        No	         No
  default	Yes	    Yes       	No	         No

*/
}
