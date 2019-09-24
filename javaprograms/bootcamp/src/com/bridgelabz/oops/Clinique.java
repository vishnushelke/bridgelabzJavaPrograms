package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.DoctorsModel;
import com.bridgelabz.model.Patient;
import com.bridgelabz.model.PatientModel;
import com.bridgelabz.utility.Utility;

public class Clinique {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int[] count=new int[5];
		ObjectMapper mapper=new ObjectMapper();
		DoctorsModel modelDoctor=new DoctorsModel();
		PatientModel modelPatient=new PatientModel();
		
		ArrayList<Doctor> doctors=new ArrayList<Doctor>();
		ArrayList<Patient> patients=new ArrayList<Patient>();
		
		//adding doctors to clinique
		Doctor doctorENT=new Doctor();
		doctorENT.setId("ent");
		doctorENT.setAvailability("am");
		doctorENT.setIsfull(false);
		doctorENT.setName("dr. vishnu");
		doctorENT.setSpecialization("ent");
		doctors.add(doctorENT);
		
		Doctor doctorHeart=new Doctor();
		doctorHeart.setAvailability("am");
		doctorHeart.setId("heart");
		doctorHeart.setIsfull(false);
		doctorHeart.setName("dr. vaishnavi");
		doctorHeart.setSpecialization("heart");
		doctors.add(doctorHeart);
		
		Doctor doctorHomeopathy=new Doctor();
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
		
		Doctor doctorDentist=new Doctor();
		doctorDentist.setAvailability("pm");
		doctorDentist.setId("dentist");
		doctorDentist.setIsfull(false);
		doctorDentist.setName("priyanka");
		doctorDentist.setSpecialization("dentist");
		doctors.add(doctorDentist);
		modelDoctor.setDoctors(doctors);
		mapper.writeValue(new File("/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/doctors.json"), modelDoctor);
		
		//taking patients
		boolean exit=false;
		//while(!exit)
		{
			System.out.println("Next please..");
			System.out.println("welcome to the clinique,which specialist do you want?");
			for (int i = 0; i < doctors.size(); i++) {
				System.out.println((i+1)+". "+doctors.get(i).getSpecialization());
			}
			int selectSpecialization=Utility.intScan()-1;
			System.out.println("when do you want an appointment?am or pm?");
			String slot=Utility.stringScan();
			if(!slot.equals(doctors.get(selectSpecialization).getAvailability()))
			{
				System.out.println("Doctor is not available in this slot.kindly take another slot");
				
			}
			else
			{
				if(doctors.get(selectSpecialization).getIsfull())
				{
					System.out.println("Today doctor's appointments are full,do you want appointment on tomorrow?");
				}
				
			}
			
		}
	}

}
