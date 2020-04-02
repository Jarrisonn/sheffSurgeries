package com.jharrison

class Doctor {
	string fullName
	string qualification
	string position
	string doctorEmail
	string password
	int doctorOffice
	int doctorPhone
	string bio

    static constraints = {
	fullName blank: false, nullable: false
	qualification blank: false, nullable: false
	position blank: false, nullable: false
	doctorEmail blank: false, nullable: false
	password blank: false, nullable: false
	doctorOffice blank: false, nullable: false
	doctorPhone blank: false, nullable: false
	bio blank: false, nullable: false
    }
}
