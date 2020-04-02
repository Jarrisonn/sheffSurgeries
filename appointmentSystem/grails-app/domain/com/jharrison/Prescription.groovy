package com.jharrison

class Prescription {
string pharmacyName
int prescripNumber
string medicine
float totalCost
date dateIssued
bool patientPaying

    static constraints = {
	pharmacyName blank: false, nullable: false
	prescripNumber blank: false, nullable: false
	medicine blank: false, nullable: false
	totalCost blank: false, nullable: false
	dateIssued blank: false, nullable: false
	patientPaying blank: false, nullable: false
    }
}
