package com.jharrison

class Appointment {
Date appDate
String appTime
int appDuration
int roomNumber

    static constraints = {
	appDate blank: false, nullable: false
	appTime blank:false, nullable: false
	appDuration blank:false, nullable: false
	roomNumber blank:false, nullable: false
	
    }
}
