package com.bridgelabz.oops;

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
		
		// adding doctors to clinique
		Doctor doctorENT = new Doctor();
		doctorENT.setId("ent");
		doctorENT.setAvailability("am");
		doctorENT.setIsfull(false);
		doctorENT.setName("dr. vishnu");
		doctorENT.setSpecialization("ent");
		doctors.add(doctorENT);

		Doctor doctorHeart = new Doctor();
		doctorHeart.setAvailability("am");
		doctorHeart.setId("heart");
		doctorHeart.setIsfull(false);
		doctorHeart.setName("dr. vaishnavi");
		doctorHeart.setSpecialization("heart");
		doctors.add(doctorHeart);

		Doctor doctorHomeopathy = new Doctor();
		doctorHomeopathy.setAvailability("am");
		doctorHomeopathy.setId("homeopathy");
		doctorHomeopathy.setIsfull(false);
		doctorHomeopathy.setName("rishi");
		doctorHomeopathy.setSpecialization("homeopathy");
		doctors.add(doctorHomeopathy);

		Doctor doctorPhysio = new Doctor();
		doctorPhysio.setAvailability("am");
		doctorPhysio.setId("physio");
		doctorPhysio.setIsfull(false);
		doctorPhysio.setName("abhishek");
		doctorPhysio.setSpecialization("physio");
		doctors.add(doctorPhysio);

		Doctor doctorDentist = new Doctor();
		doctorDentist.setAvailability("pm");
		doctorDentist.setId("dentist");
		doctorDentist.setIsfull(false);
		doctorDentist.setName("priyanka");
		doctorDentist.setSpecialization("dentist");
		doctors.add(doctorDentist);
		modelDoctor.setDoctors(doctors);
		mapper.writeValue(new File(
				"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/doctors.json"),
				modelDoctor);

		// taking patients
		DateTimeFormatter dateformatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now=LocalDateTime.now();
		System.out.println("Enter number of patients");
		int n=Utility.intScan();
		for (int j = 0; j < n; j++) {
			
				
				System.out.println("welcome to the clinique,which specialist do you want?");
				for (int i = 0; i < doctors.size(); i++) {
					System.out.println((i + 1) + ". " + doctors.get(i).getSpecialization());
				}
				int selectSpecialization = Utility.intScan() - 1;
				System.out.println("when do you want an appointment?am or pm?");
				String slot = Utility.stringScan();
				while (!slot.equals(doctors.get(selectSpecialization).getAvailability())) {
					System.out.println("Doctor is not available in this slot.kindly take another slot");
					slot = Utility.stringScan();
				}

				if (count[selectSpecialization]>4) {
					System.out.println(
							"Today doctor's appointments are full,do you want appointment on tomorrow?\n1.yes\n2.no");
					if (Utility.intScan() == 2) {
						
						System.out.println("Thank you for your valuable time");
						return;
					}
				}
				System.out.println("Doctor available for this slot is "+doctors.get(selectSpecialization).getName()+" Do you want to confirm your appointment?\n1.yes\n2.no");
				if(Utility.intScan()==2)
				{
					System.out.println("thank you for your valuable time");
					
					return;
				}
				
				count[selectSpecialization]++;
				Patient patient=new Patient();
				System.out.println("Please give your name");
				String name=Utility.stringScan();
				patient.setName(name);
				System.out.println("enter your age");
				patient.setAge(Utility.intScan());
				System.out.println("Enter your mobile number");
				patient.setMobileNumber(Utility.stringScan());
				System.out.println("your appointment is fixed with "+doctors.get(selectSpecialization).getName()+" have a good day");
				patients.add(patient);
				modelPatient.setPatients(patients);
				Appointment appointment=new Appointment();
				
				appointment.setAppointmentDate(dateformatter.format(now));
				appointment.setDoctorName(doctors.get(selectSpecialization).getName());
				appointment.setPatientName(name);
				appointment.setSlot(slot);
				appointments.add(appointment);
				modelAppointment.setAppointments(appointments);
			
		}
		 mapper.writeValue(new File("/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/appointments.json"), modelAppointment);

	}

}
