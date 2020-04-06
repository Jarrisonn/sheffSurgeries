package com.jharrison

class Nurse {
String nurseName
String qualifications
String nurseEmail
int nurseOffice
int nursePhone

    static constraints = {
	nurseName blank: false, nullable: false
	qualifications blank: false, nullable: false
	nurseEmail blank: false, nullable: false
	nurseOffice blank: false, nullable: false
	nursePhone blank: false, nullable: false
    }
}
