package axis2Example.ws;

//http://maksim.sorokin.dk/it/2011/01/13/axis2-maven-servlets-tomcat/

// mvn jetty:run to start the server
// To call service endpoint - http://localhost:8080/axis2Example/services/HelloWs/sayHello?name=Tushar

public class HelloWs {

  public String sayHello(String name) {
    if (name == null) {
      return "Hello";
    }
    
    return "Hello, " + name + "!";
  }
}