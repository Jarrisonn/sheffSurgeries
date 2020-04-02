package com.jharrison

class Nurse {
string nurseName
string qualifications
string nurseEmail
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
