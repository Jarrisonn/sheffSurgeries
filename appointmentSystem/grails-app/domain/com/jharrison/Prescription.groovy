package com.jharrison

class Prescription {
String pharmacyName
int prescripNumber
String medicine
Float totalCost
Date dateIssued
Boolean patientPaying
Doctor doctor
static hasOne = [doctor:Doctor]

String toString(){
	return medicine
}
    static constraints = {
	pharmacyName blank: false, nullable: false
	prescripNumber blank: false, nullable: false
	medicine blank: false, nullable: false
	totalCost blank: false, nullable: false
	dateIssued blank: false, nullable: false
	patientPaying blank: false, nullable: false
    }
}
