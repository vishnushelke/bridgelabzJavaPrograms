package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.AppointmentModel;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.DoctorsModel;
import com.bridgelabz.model.Patient;
import com.bridgelabz.model.PatientModel;
import com.bridgelabz.utility.OopsUtility;
import com.bridgelabz.utility.Utility;

public class Clinique {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int[] count = new int[5];
		ObjectMapper mapper = new ObjectMapper();
		DoctorsModel modelDoctor = new DoctorsModel();
		PatientModel modelPatient = new PatientModel();
		AppointmentModel modelAppointment=new AppointmentModel();

		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Appointment> appointments=new ArrayList<Appointment>();

		modelDoctor=mapper.readValue(new File("/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/jsonfiles 2/doctors.json"), modelDoctor.getClass());
		doctors=modelDoctor.getDoctors();
		
		boolean exit=false;
		while(!exit)
		{
			System.out.println("what do you want to do?\n1.add a doctor\n2.add a patient\n3.search a doctor\n4.search a patient\n5.take an appointment with a doctor\n6.print report of a doctor\n7.print a report of a patient\n8.show popular doctor\n9.show popular specialization");
			switch(Utility.intScan())
			{
			case 1://add a doctor
				int doctorNumber=doctors.size()+1;
				Doctor doctor=new Doctor();
				  doctor= OopsUtility.addDoctor(doctorNumber);
				  doctors.add(doctor);
				  modelDoctor.setDoctors(doctors);
				  
				  System.out.println("Doctor added suuccessfully in clinic");
				  exit=OopsUtility.isExit();
				  mapper.writeValue(new File("/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/jsonfiles 2/doctors.json"), modelDoctor);
				  break;
				  
			case 2://add a patient
				int patientNumber=patients.size()+1;
						
						System.out.println("what is your name");
						String name=Utility.stringScan();
						System.out.println("enter your mobile number");
						String mobileNumber=Utility.stringScan();
						Patient patient=OopsUtility.addPatient(patientNumber, name, mobileNumber);
						patients.add(patient);
						modelPatient.setPatients(patients);
						System.out.println("patient added successfully");
						exit=OopsUtility.isExit();
						mapper.writeValue(new File("/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/jsonfiles 2/patients.json"), modelPatient);
						break;
			case 3://search doctor
				System.out.println("How do you want to search a doctor?\n1.by name\n2.by specialization\n3.by availability\n4.by ID");
				switch(Utility.intScan())
				{
				case 1: //search doctor by name
					System.out.println("Enter the name of a doctor");
					doctor=OopsUtility.searchDoctorByName(Utility.stringScan(),doctors);
					if(doctor!=null)
					System.out.println(doctor);
					else
						System.out.println("doctor not found");
					exit=OopsUtility.isExit();
					break;
				case 2://search doctor by specialization
					ArrayList<Doctor> doctorsBySpecialization = new ArrayList<>();
					System.out.println("Enter the specialization of a doctor");
					doctorsBySpecialization=OopsUtility.searchDoctorBySpecialization(Utility.stringScan(),doctors);
					if(doctorsBySpecialization.get(0).getName()!=null)
						System.out.println(doctorsBySpecialization);
					else
						System.out.println("doctor not found");
					exit=OopsUtility.isExit();
					break;
				case 3://search doctor by availability
					ArrayList<Doctor> doctorsByAvailability = new ArrayList<>();
					System.out.println("Enter the availability of a doctor");
					doctorsByAvailability=OopsUtility.searchDoctorByAvailability(Utility.stringScan(),doctors);
					if(doctorsByAvailability.get(0)!=null)
						System.out.println(doctorsByAvailability.toString());
					else
						System.out.println("doctor not found");
					exit=OopsUtility.isExit();
					break;
				case 4://search doctor by ID
					System.out.println("Enter the ID of a doctor");
					doctor=OopsUtility.searchDoctorByID(Utility.stringScan(),doctors);
					if(doctor.getName()!=null)
						System.out.println(doctor);
					else
						System.out.println("doctor not found");
					exit=OopsUtility.isExit();
					break;
					
				}
			}
		}
		
		
		
		
		
		
		
		// adding doctors to clinique
//		Doctor doctorENT = new Doctor();
//		doctorENT.setId("ent");
//		doctorENT.setAvailability("am");
//		doctorENT.setIsfull(false);
//		doctorENT.setName("dr. vishnu");
//		doctorENT.setSpecialization("ent");
//		doctors.add(doctorENT);
//
//		Doctor doctorHeart = new Doctor();
//		doctorHeart.setAvailability("am");
//		doctorHeart.setId("heart");
//		doctorHeart.setIsfull(false);
//		doctorHeart.setName("dr. ravi");
//		doctorHeart.setSpecialization("heart");
//		doctors.add(doctorHeart);
//
//		Doctor doctorHomeopathy = new Doctor();
//		doctorHomeopathy.setAvailability("am");
//		doctorHomeopathy.setId("homeopathy");
//		doctorHomeopathy.setIsfull(false);
//		doctorHomeopathy.setName("rishi");
//		doctorHomeopathy.setSpecialization("homeopathy");
//		doctors.add(doctorHomeopathy);
//
//		Doctor doctorPhysio = new Doctor();
//		doctorPhysio.setAvailability("am");
//		doctorPhysio.setId("physio");
//		doctorPhysio.setIsfull(false);
//		doctorPhysio.setName("abhishek");
//		doctorPhysio.setSpecialization("physio");
//		doctors.add(doctorPhysio);
//
//		Doctor doctorDentist = new Doctor();
//		doctorDentist.setAvailability("pm");
//		doctorDentist.setId("dentist");
//		doctorDentist.setIsfull(false);
//		doctorDentist.setName("priyanka");
//		doctorDentist.setSpecialization("dentist");
//		doctors.add(doctorDentist);
//		modelDoctor.setDoctors(doctors);
//		mapper.writeValue(new File(
//				"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/doctors.json"),
//				modelDoctor);
//
//		// taking patients
//		DateTimeFormatter dateformatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDateTime now=LocalDateTime.now();
//		System.out.println("Enter number of patients");
//		int n=Utility.intScan();
//		int j=0;
//		boolean exit=false;
//		while(j<n && !exit) {
//			
//				
//				System.out.println("welcome to the clinique,which specialist do you want?");
//				for (int i = 0; i < doctors.size(); i++) {
//					System.out.println((i + 1) + ". " + doctors.get(i).getSpecialization());
//				}
//				int selectSpecialization = Utility.intScan() - 1;
//				System.out.println("when do you want an appointment?am or pm?");
//				String slot = Utility.stringScan();
//				while (!slot.equals(doctors.get(selectSpecialization).getAvailability())) {
//					System.out.println("Doctor is not available in this slot.kindly take another slot");
//					slot = Utility.stringScan();
//				}
//
//				if (count[selectSpecialization]>4) {
//					System.out.println(
//							"Today doctor's appointments are full,do you want appointment on tomorrow?\n1.yes\n2.no");
//					if (Utility.intScan() == 2) {
//						
//						System.out.println("Thank you for your valuable time");
//						exit=true;
//					}
//				}
//				System.out.println("Doctor available for this slot is "+doctors.get(selectSpecialization).getName()+" Do you want to confirm your appointment?\n1.yes\n2.no");
//				if(Utility.intScan()==1)
//				{
//					count[selectSpecialization]++;
//					Patient patient=new Patient();
//					System.out.println("Please give your name");
//					String name=Utility.stringScan();
//					patient.setName(name);
//					System.out.println("enter your age");
//					patient.setAge(Utility.intScan());
//					System.out.println("Enter your mobile number");
//					patient.setMobileNumber(Utility.stringScan());
//					System.out.println("your appointment is fixed with "+doctors.get(selectSpecialization).getName()+" have a good day");
//					patients.add(patient);
//					modelPatient.setPatients(patients);
//					Appointment appointment=new Appointment();
//					
//					appointment.setAppointmentDate(dateformatter.format(now));
//					appointment.setDoctorName(doctors.get(selectSpecialization).getName());
//					appointment.setPatientName(name);
//					appointment.setSlot(slot);
//					appointments.add(appointment);
//					modelAppointment.setAppointments(appointments);
//					count[selectSpecialization]++;
//				}
//					j++;
//					System.out.println("Thank you for your valuable time");
//					Utility.bubbleNumberSort(count);
//				
//				
//			
//		}
//		System.out.println(doctors.get(count[0]).getSpecialization()+" is a popular specialization in hospital"+"\n"+doctors.get(count[0]).getName()+"is a popular doctor in hospital");
//		 mapper.writeValue(new File("/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/appointments.json"), modelAppointment);

	}

}
