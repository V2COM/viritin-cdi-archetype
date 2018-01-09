#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
    public String sayHi(String name) {
        return "Hi " + name + "!";
    }
}
