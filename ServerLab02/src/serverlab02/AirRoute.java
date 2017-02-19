
package serverlab02;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "AirRoute")

@XmlType(propOrder = {"out","in"})

public class AirRoute {
private String out;
private String in;

    public AirRoute(String in, String out){
        this.out = out;
        this.in = in;
    }    

    AirRoute() {
    }

    @XmlElement
    public String getOut() {
        return out;
    }

    @XmlElement
    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public void setOut(String out) {
        this.out = out;
    }
}
