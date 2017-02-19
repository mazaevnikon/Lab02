
package serverlab02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class EchoProcess implements Runnable {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public EchoProcess(Socket socket) throws IOException {
        this.socket = socket;

        in = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));

        out = new PrintWriter(new BufferedWriter(
            new OutputStreamWriter(socket.getOutputStream())),
            true);
    }

    @Override
    public void run() {
        FlightsList fliList = new FlightsList();    
        FlightsList unmarshFli = fromXmlToObjectFlights("Flights.xml");
        if (unmarshFli != null){
            fliList = unmarshFli;
            }

        AirRoutesList routesList = new AirRoutesList();    
        AirRoutesList unmarshRoute = fromXmlToObjectRoutes("AirRouts.xml");
        if (unmarshRoute != null){
            routesList = unmarshRoute;
            }     

        try {
            System.out.println("Connection accepted: " + socket);
            String input;

            while ((input = in.readLine()) != null) {
                
                if (input.equalsIgnoreCase("addFlight")){ //////////Добавление новых рейсов, маршрутов....  
                    String input1 = in.readLine();
                    String input2 = in.readLine();
                    String input3 = in.readLine();
                    String input4 = in.readLine();
                    String input5 = in.readLine();
                    String input6 = in.readLine();                   
                    if(!input1.equals("") & !input2.equals("") & !input3.equals("") & 
                    !input4.equals("") & !input5.equals("") & !input1.equals("")){
                        String flight = fliList.findFlight(input1);
                        if(!flight.equals("")){
                            out.print("-");
                        }else{
                            Flights fli = new Flights();
                            AirRoute route = new AirRoute();
                            route.setOut(input3);
                            route.setIn(input4);
                            fli.setFlightNumber(input1);
                            fli.setAirbus(input2);
                            fli.setRoute(route);
                            fli.setDepartureTime(input5);
                            fli.setTrackTime(input6); 

                            fliList.addFli(fli);
                            routesList.addRoute(route);
                            out.print("+");
                            }
                    }else{
                        out.print("-");
                    }        
                }
                
                if (input.equalsIgnoreCase("removeFlight")){ ///////////Удаление рейса по номеру
                    String input1 = in.readLine();
                    String remove = fliList.removeFlight(input1);
                    if(remove.equals("+")){
                        out.print("+");
                    }else{
                        out.print("-");
                    }
                }
                
                if (input.equalsIgnoreCase("removeA")){ //////////Удаление маршрута 
                    String input1 = in.readLine();
                    String input2 = in.readLine();
                    routesList.removeRoute(input1, input2);                
                }
                
                 if (input.equalsIgnoreCase("getA")){ //////////Получение списка маршрутов
                    String routes = routesList.getRoutes();
                    out.print(routes);
                }
                 
                if (input.equalsIgnoreCase("getFlights")){ //////////Получение списка рейсов
                    String flights = fliList.getFlights();
                    out.print(flights);
                }
                
                if (input.equalsIgnoreCase("findFlight")){ ///////////Поиск рейса по номеру
                    String input1 = in.readLine();
                    String flight = fliList.findFlight(input1);
                    out.print(flight);
                }
                
                if (input.equalsIgnoreCase("changeF")){ ///////////Изменение рейса по номеру
                    
                    String input1 = in.readLine();
                    String input2 = in.readLine();
                    String input3 = in.readLine();
                    String input4 = in.readLine();
                    String input5 = in.readLine();
                    String input6 = in.readLine();
                    if(!input1.equals("") & !input2.equals("") & !input3.equals("") & 
                    !input4.equals("") & !input5.equals("") & !input1.equals("")){                  
                     String remove = fliList.removeFlight(input1);
                        if(remove.equals("+")){
                            out.print("+");
                            Flights fli = new Flights();
                            AirRoute route = new AirRoute();
                            route.setOut(input3);
                            route.setIn(input4);
                            fli.setFlightNumber(input1);
                            fli.setAirbus(input2);
                            fli.setRoute(route);
                            fli.setDepartureTime(input5);
                            fli.setTrackTime(input6); 
                            fliList.addFli(fli);
                            routesList.addRoute(route);
                    }else{out.print("-");}
                    }else{out.print("--");}

                         
                }
                
            out.println();

            JAXBContext contextFli = JAXBContext.newInstance(FlightsList.class);
            Marshaller marshallerFli = contextFli.createMarshaller();  
            marshallerFli.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);        
            marshallerFli.marshal(fliList,new File("Flights.xml")); 

            JAXBContext contextRoute = JAXBContext.newInstance(AirRoutesList.class);
            Marshaller marshallerRoute = contextRoute.createMarshaller();  
            marshallerRoute.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);        
            marshallerRoute.marshal(routesList,new File("AirRouts.xml"));

            }
        } catch (IOException ex) {
            Logger.getLogger(EchoProcess.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JAXBException ex) {
                Logger.getLogger(EchoProcess.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    System.out.println("closing...");
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                        }
                  }
}

 private static FlightsList fromXmlToObjectFlights(String filePath) {
    try {
        JAXBContext jaxbContext = JAXBContext.newInstance(FlightsList.class);
        Unmarshaller un = jaxbContext.createUnmarshaller();

        return (FlightsList) un.unmarshal(new File(filePath));
    } catch (JAXBException e) {
        e.printStackTrace();
    }
    return null;
}
 private static AirRoutesList fromXmlToObjectRoutes(String filePath) {
    try {
        JAXBContext jaxbContext = JAXBContext.newInstance(AirRoutesList.class);
        Unmarshaller un = jaxbContext.createUnmarshaller();

        return (AirRoutesList) un.unmarshal(new File(filePath));
    } catch (JAXBException e) {
        e.printStackTrace();
    }
    return null;
}

}
