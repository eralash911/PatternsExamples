package AbstractFActory.Website;

import AbstractFActory.Developer;
import com.sun.org.apache.xml.internal.resolver.helpers.Debug;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP code already created");
    }
}
