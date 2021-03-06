package com.jharrison

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob
int patientID
Date dateRegistered
int patientPhone
Surgery surgery
Appointment appointment
static hasOne =[appointment:Appointment]
static hasMany = [surgery:Surgery, prescriptions:Prescription]
static belongsTo = Surgery

String toString(){
	return patientName
}


    static constraints = {
	patientName blank: false, nullable: false
	patientAddress blank: false, nullable: false
	patientResidence blank: false, nullable: false
	patientDob blank: false, nullable: false
	patientID blank: false, nullable: false
	dateRegistered blank: false, nullable: false
	patientPhone blank: false, nullable: false
    }
}
