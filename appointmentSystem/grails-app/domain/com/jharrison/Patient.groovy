package com.jharrison

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob
int patientID
Date dateRegistered
int patientPhone
static hasMany = [surgeries:Surgery, doctor:Doctor, prescription:Prescription]
static belongsTo = Surgery 
static hasOne = [appointment:Appointment]

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
