package com.jharrison

class Appointment {
Date appDate
String appTime
int appDuration
int roomNumber
Surgery surgery
Patient patient
static hasMany = [surgery:Surgery]
static belongsTo = Patient
static hasOne = [doctor:Doctor]

    static constraints = {
	appDate blank: false, nullable: false
	appTime blank:false, nullable: false
	appDuration blank:false, nullable: false
	roomNumber blank:false, nullable: false
	
    }
}
