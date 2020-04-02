package com.jharrison

class Surgery {
string name
string address
string postcode
int telephone
int numberOfPatients
string description
string openingTime

    static constraints = {
	name blank: false, nullable: false
	address blank: false, nullable: false
	postcode blank: false, nullable: false
	telephone blank: false, nullable: false
	numberOfPatients blank: false, nullable: false
	description blank: false, nullable: false
	openingTime blank: false, nullable: false
    }
}
