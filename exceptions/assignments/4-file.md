## Steps

  1. In IntelliJ go to `File->Settings` and search for "close". Tick all the checkboxes under "Resource management" - this will ensure you get warnings if resources such as streams have not been closed
  1. In the `ExceptionDemos` class, add a method called `readFile`
  1. Add the following code to print out the contents of the file:
  ```java
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
  ```

## Questions to answer
(add the answers to these questions as Javadoc comments above your method)
  1. Why is some of the code underlined in red?
  1. Google to find the Javadoc for this exception and read the description of the exception
  1. What type of exception is this? (Error, RuntimeException, other Exception) - Hint - look at the superclass(es) (inheritance hierarchy) of the exception
  1. Should you explicitly catch this exception in your code? Expand your answer with reasons.  
  1. How can you fix this compilation error?
  1. What happens if the file is not found?
  1. A scanner *must* be closed (see warning on the right hadn side of your code) - take a look at the JavaDoc for the Scanner class (search "Scanner javadoc 8") and add in the close call
  - note there are 2 options closing resources, what are they?!
