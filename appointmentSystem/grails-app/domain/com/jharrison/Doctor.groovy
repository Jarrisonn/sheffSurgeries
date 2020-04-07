package com.jharrison

class Doctor {
	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	int doctorOffice
	int doctorPhone
	String bio
static hasMany = [prescriptions:Prescription, patients:Patient, nurses:Nurse, appointments:Appointment]
static hasOne = [surgery:Surgery]


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
