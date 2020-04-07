package com.jharrison

class Surgery {
String name
String address
String postcode
int telephone
int numberOfPatients
String description
String openingTime
static hasMany = [receptionists:Receptionist, doctors:Doctor, nurses:Nurse, appointments:Appointment, patients:Patient]

String toString(){
	return name
}

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
