package com.oocl.cultivation;

public class customer {
    private  Car car;
    private  carTicket ticket;
    private  String message;


    public String getResponseMessage(Car carFetch) {
        if(this.ticket==null){
           return  "Please provide your parking ticket.";
        }

        if (carFetch == null) return "Unrecognized parking ticket.";

        return "";
    }

    public String getResponseMessage(carTicket carTicket) {

        if (carTicket == null) return "Not enough position.";

        return "";
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public carTicket getTicket() {
        return ticket;
    }

    public void setTicket(carTicket ticket) {
        this.ticket = ticket;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
