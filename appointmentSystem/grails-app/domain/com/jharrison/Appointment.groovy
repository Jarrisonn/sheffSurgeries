package com.jharrison

class Appointment {
Date appDate
String appTime
int appDuration
int roomNumber
static hasMany = [surgery:Surgery]
static belongsTo = Surgery
static hasOne = [doctor:Doctor, patient:Patient]

    static constraints = {
	appDate blank: false, nullable: false
	appTime blank:false, nullable: false
	appDuration blank:false, nullable: false
	roomNumber blank:false, nullable: false
	
    }
}
