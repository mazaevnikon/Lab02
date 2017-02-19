
package serverlab02;

import java.util.*;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="airRotesList_list")

public class AirRoutesList {

    private List<AirRoute> list = new ArrayList<AirRoute>();

    public void addRoute(AirRoute route){
        this.list.add(route);
    }

    @XmlElementRef
    public List<AirRoute> getRoute() {
        return list;
    }

    public void setList(List<AirRoute> route) {
        this.list = list;
    }

    public void removeRoute(String out, String in){
        for(int i=0; i<list.size();i++){
        String outLi = list.get(i).getOut();
        String inLi = list.get(i).getIn();
        if(outLi.equals(out) & inLi.equals(in)){
            list.remove(i);
            }
        }
}

    public String getRoutes(){
    String routes = "";
    for(int i=0; i<list.size();i++){
        routes = routes + " " + list.get(i).getOut() + "-" + list.get(i).getIn();
        }
    return routes;
    }
}
