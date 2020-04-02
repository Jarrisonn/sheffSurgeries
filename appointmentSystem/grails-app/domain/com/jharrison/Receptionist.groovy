package com.jharrison

class Receptionist {
string recepName
string recepEmail
string recepUsername
string recepPassword
int recepPhone

    static constraints = {
	recepName blank: false, nullable: false
	recepEmail blank: false, nullable: false
	recepUsername blank: false, nullable: false
	recepPassword blank: false, nullable: false
	recepPhone blank: false, nullable: false
    }
}
