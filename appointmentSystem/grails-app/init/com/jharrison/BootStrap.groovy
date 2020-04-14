package com.jharrison

class BootStrap {

    def init = { servletContext ->

def surgery1=new Surgery(
name:'Nottingham Trent Surgery',
address:'14 Trent Bridge Road',
postcode:'NG2 4BS',
telephone:'0115500500',
numberOfPatients:'100',
description:'Surgery',
openingTime:'9:00H').save()

def surgery2=new Surgery(
name:'Sheffield Surgery',
address:'100 Gleadless Road',
postcode:'S6 9EP',
telephone:'0114400400',
numberOfPatients:'108',
description:'Surgery',
openingTime:'9:00H').save()


def doctor1=new Doctor(
fullName:'Big Doc',
qualification:'Big qual',
position:'Big pos',
doctorEmail:'doc@doc.com',
password:'password',
doctorOffice:'10',
doctorPhone:'100',
bio:'gang gang',
surgery:surgery1).save() 

def doctor2=new Doctor(
fullName:'Biggest Doc',
qualification:'Big qual',
position:'Big pos',
doctorEmail:'doc@doc.com',
password:'password',
doctorOffice:'10',
doctorPhone:'100',
bio:'gang gang',
surgery:surgery1).save()

def recep1=new Receptionist(
recepName:'Recep',
recepEmail:'rec@eptionmail.com',
recepUsername:'Recep1',
recepPassword:'password',
recepPhone:'07783300570',
surgery:surgery1).save()

def recep2=new Receptionist(
recepName:'Recep',
recepEmail:'rec@eptionmail.com',
recepUsername:'Recep1',
recepPassword:'password',
recepPhone:'07783300570',
surgery:surgery1).save()

def nurse1=new Nurse(
nurseName:'Nursey',
qualifications:'quals',
nurseEmail:'nurse@nursemail.com',
nurseOffice:'10',
nursePhone:'07783300570',
surgery:surgery1,
doctor:doctor1).save()

def nurse2=new Nurse(
nurseName:'Nursey',
qualifications:'quals',
nurseEmail:'nurse@nursemail.com',
nurseOffice:'10',
nursePhone:'07783300570',
surgery:surgery1,
doctor:doctor1).save()



def appointment1=new Appointment(
appDate:new Date('11/04/2000'),
appTime:'9:00H',
appDuration:'15',
roomNumber:'10',
doctor:doctor1,
surgery:surgery1).save()

def presc1=new Prescription(
pharmacyName:'Pharm',
prescripNumber:'1',
medicine:'Paracetemol',
totalCost:'1.09',
dateIssued:new Date('11/04/2000'),
patientPaying:true,
doctor:doctor1).save()

def pat1=new Patient(
patientName:'pat',
patientAddress:'1 pat way',
patientResidence:'No',
patientDob:new Date('11/04/1999'),
patientID:'1',
dateRegistered:new Date('11/04/2000'),
patientPhone:'07783300570',
surgery:surgery1).save()


    }






    def destroy = {
    }
}
