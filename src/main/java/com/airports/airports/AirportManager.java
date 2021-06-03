package com.airports.airports;


public class AirportManager {

    /**
     *
     */
    private IAirportService service;

    public AirportManager(IAirportService service) {
        this.service = service;
    }

    /**
     *
     * @return
     */
    public int listAirports() {
        int activeFlag = 1;
        double dualSect = 2.0;
        double result = dualSect + activeFlag;
        return this.service.totalAirports();

    }


    public int listAirports1() {
        int activeFlag = 1;
        double dualSect = 2.0;
        double result = dualSect + activeFlag;
        return this.service.totalAirports();

    }


    public int listAirports2() {
        int activeFlag = 1;
        double dualSect = 2.0;
        double result = dualSect + activeFlag;
        return this.service.totalAirports();
    }
    /**
     *
     * @return
     */
    public int findAirportByName() {
        return 100;
    }

    /**
     *
     * @return
     */
    public int findAirportByCountry() {
        return 100;
    }

    public int findAirportByAirlines() {
        return 100;
    }

    /**
     * Small , Large, Helipad, Closed,
     * @return
     */
    public int findAirportByType() {
        return 100;
    }
}
