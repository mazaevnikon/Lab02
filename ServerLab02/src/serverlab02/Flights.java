
package serverlab02;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Flight")

@XmlType(propOrder = {"flightNumber", "airbus", "route", "departureTime", "trackTime"})
   
public class Flights {
    private String flightNumber;
    private String airbus;
    private AirRoute route;  
    private String departureTime;
    private String trackTime;

    public Flights(String flightNumber, String airbus, AirRoute route, String departureTime, String trackTime) {
        this.flightNumber = flightNumber;
        this.airbus = airbus;
        this.route = route;
        this.departureTime = departureTime;
        this.trackTime = trackTime; 
    }

    Flights() {    
    }
    @XmlElement
    public String getFlightNumber() {
        return flightNumber;
    }
 
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    @XmlElement
     public String getAirbus() {
        return airbus;
    }
 
    public void setAirbus(String airbus) {
        this.airbus = airbus;
    }
   @XmlElement 
     public AirRoute getRoute() {
        return route;
    }
 
    public void setRoute(AirRoute route) {
        this.route = route;
    }
   
   @XmlElement 
     public String getDepartureTime() {
        return departureTime;
    }
 
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    @XmlElement
     public String getTrackTime() {
        return trackTime;
    }
 
    public void setTrackTime(String trackTime) {
        this.trackTime = trackTime;
    }  
}
