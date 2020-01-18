# Annotations Z

> "We had a very serious synchronization issue in one of our payment services. We could have invested our money and time to fix it, but we decided to annotate it with _@YOLO_ instead. Sometimes you just need to go for it and hope for the best" - Mark West, CEO of Bear FinTech Inc.

Annotations Z is here to solve problems you didn't know you had by improving your team communication and life.

## What's in our arsenal

### @YOLO

For code which fails from time to time:

    @YOLO
    public void saveEntity(Object entity) {
      // Saves all the data into the DB (hopefully) 
      entityManager.persist(entity);
    }

### @Lit

For some very cool code:

    @Lit
    public boolean checkPalindrome(String input) {
      return new StringBuilder(input).reverse().toString().equals(input);
    }
  
### @Meme

For legacy code:

     @Meme
     public class MyCustomEJB {
       // Let the future generation remember our mistakes...
     }
     
### @Yeet
 
For deprecating code:
 
     @Yeet
     public int sum(int a, int b) {
       // Use the double version instead.
       return a + b;
     }
   
### @No_U
  
For code review:
  
    /**
      * Does stuff.
      * TODO: [Josh]: this method is really ugly, can we improve it?
      * [Steve]: @No_U
      */
    public void myMethod() {}
    
### @Squad and @Fam
  
For dependency injection:
  
     @Fam public class myComponent {}
     
     @Squad public MyComponent injectedComponent;
     
### And much more...
     
## FAQ
 
- Is it compatible with Java 13?
 
Yes, the project is compatible with any Java version from 9 to 13. If you need compatibility with older versions of Java, we will release them soon on another package.
 
- Is there any integration with Spring Boot?
 
Not yet, but we are working on it.
 
- Will @Yeet replace the obsolete @Deprecated?
 
We can't say it for sure but there's already 
 
- DoEs ThIs WoRk On AnDrOiD
 
Yes, it works fine.

- This is shit

@No_U
  
## How do I use it?

With Maven, just add this to your pom.xml:

    <dependency>
      <groupId>co.aurasphere</groupId>
	    <artifactId>annotations-z</artifactId>
	    <version>420.69.80085</version>
    </dependency>
 
<sub>Copyright (c) 2020 Donato Rimenti</sub>
