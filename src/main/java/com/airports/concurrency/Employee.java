package com.airports.concurrency;

public class Employee {

    private  long empid;

    public void setEmpid(long empid) {
        //audit call here...
        // broadcast --> Tell other that you changed
        // observer and observables
        this.empid = empid;
    }

    public long getEmpid() {
        return empid;
    }

    /**
     * Immutabilitty is for loss
     * Traceability is for loss
     * Event integrity if for loss
     */
}
