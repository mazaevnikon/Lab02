
package serverlab02;

import java.util.*;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="flightsList_list")

public class FlightsList {

    private List<Flights> list = new ArrayList<Flights>();

    public void addFli(Flights fli){
        this.list.add(fli);
    }

    @XmlElementRef
    public List<Flights> getList() {
        return list;
    }

    public void setList(List<Flights> list) {
        this.list = list;
    }

    public String removeFlight(String flightNumber){
        String r = "";
        for(int i=0; i<list.size();i++){
            String fliLi = list.get(i).getFlightNumber();
            if(fliLi.equals(flightNumber)){
                list.remove(i);
                r = "+";
            }else{
                r="-";
            }
            }
        return r;
    }   

    public String getFlights(){
        String flights = "";
        for(int i=0; i<list.size();i++){
            flights = flights + list.get(i).getFlightNumber() + "/" 
              + list.get(i).getAirbus() + "/" 
              + list.get(i).getRoute().getOut() + "-" + list.get(i).getRoute().getIn()
              + "/" + list.get(i).getDepartureTime() + "/"
              + list.get(i).getTrackTime() + "//";
            }
        return flights;
    }

    public String findFlight(String flightNumber){
        String flight = "";
        for(int i=0; i<list.size();i++){
            String fliLi = list.get(i).getFlightNumber();
                if(fliLi.equals(flightNumber)){
                    flight =  list.get(i).getFlightNumber() + "/" 
                        + list.get(i).getAirbus() + "/" 
                        + list.get(i).getRoute().getOut() + "-" + list.get(i).getRoute().getIn()
                        + "/" + list.get(i).getDepartureTime() + "/"
                        + list.get(i).getTrackTime();
                }
        }
            return flight;
    }
}
