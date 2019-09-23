package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Company;
import com.bridgelabz.model.CompanySharesModel;
import com.bridgelabz.model.CustomerInfo;
import com.bridgelabz.model.CustomerInfoModel;
import com.bridgelabz.utility.Utility;

public class StockAccount {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();

		// impoeting all models
		CompanySharesModel modelCompanyShares = new CompanySharesModel();
		CustomerInfoModel modelCustomers = new CustomerInfoModel();

		ArrayList<Company> companies = new ArrayList<Company>();
		ArrayList<CustomerInfo> customers = new ArrayList<CustomerInfo>();

		// adding 3 companies in arraylist
		Company company = new Company();
		company.setCompanyname("icici");
		company.setNumberofshares(100);
		company.setShareprice(50);
		company.setSymbol("icici");
		int totalprice = company.getShareprice() * company.getNumberofshares();
		company.setTotalprice(totalprice);
		companies.add(company);

		// second company
		Company company1 = new Company();
		company1.setCompanyname("sbi");
		company1.setNumberofshares(150);
		company1.setShareprice(60);
		company1.setSymbol("sbi");
		int totalprice1 = company1.getShareprice() * company1.getNumberofshares();
		company1.setTotalprice(totalprice1);
		companies.add(company1);

		// third company
		Company company2 = new Company();
		company2.setCompanyname("axis");
		company2.setNumberofshares(200);
		company2.setShareprice(90);
		company2.setSymbol("axis");
		int totalprice2 = company2.getShareprice() * company2.getNumberofshares();
		company2.setTotalprice(totalprice2);
		companies.add(company2);
		modelCompanyShares.setCompanyshares(companies);
		mapper.writeValue(new File(
				"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/Companies.json"),
				modelCompanyShares);

		// adding 3 customers
		CustomerInfo customer = new CustomerInfo();
		customer.setAvailableshares(50);
		customer.setName("vishnu");
		customer.setRupeesavailable(0);
		customer.setSymbol("eater");
		customers.add(customer);

		CustomerInfo customer1 = new CustomerInfo();
		customer1.setAvailableshares(60);
		customer1.setName("rishi");
		customer1.setRupeesavailable(1000);
		customer1.setSymbol("rishi");
		customers.add(customer1);

		CustomerInfo customer2 = new CustomerInfo();
		customer2.setAvailableshares(100);
		customer2.setName("abhishek");
		customer2.setRupeesavailable(200000);
		customer2.setSymbol("cashier");
		customers.add(customer2);
		modelCustomers.setCustomers(customers);
		mapper.writeValue(new File(
				"/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/customers.json"),
				modelCustomers);

		
		System.out.println("validate yourself");
		for (int i = 0; i < customers.size(); i++) {
			System.out.println((i+1)+". "+customers.get(i).getName());
		}
		int customerId=Utility.intScan();
		customer=customers.get(customerId-1);
		System.out.println("you have "+customer.getRupeesavailable()+" rupees");
		System.out.println("which company shares you want to buy?");
		for (int i = 0; i < companies.size(); i++) {
			System.out.println((i + 1) + ". " + companies.get(i).getSymbol());
		}
		int response = Utility.intScan();
		companies.get(response - 1);
		System.out.println("this company has "+company.getNumberofshares()+" shares and shareprice "+company.getShareprice());
		System.out.println("How many shares you wish to buy?");
		response = Utility.intScan();
		int sharesCompany = company.getNumberofshares();
		while (response > sharesCompany || company.getShareprice()*response>customer.getRupeesavailable()) {
			if(response > sharesCompany)
			{
				System.out.println("you can buy only " + sharesCompany + " shares,enter shares upto this value");
				response = Utility.intScan();
			}
			while(company.getShareprice()*response>customer.getRupeesavailable())
			{
				int moneyNeeded = company.getShareprice() * response;
				while (customer.getRupeesavailable() < moneyNeeded) {
					System.out.println("You dont have enough,enter valid number of shares");
					response = Utility.intScan();
					moneyNeeded = company.getShareprice() * response;
			}
			
			}
		}
		System.out.println("Buying " + response + " shares from " + company.getCompanyname());
		company.setNumberofshares(company.getNumberofshares() - response);
		System.out.println("company remaining shares are "+company.getNumberofshares());
		customer.setAvailableshares(customer.getAvailableshares() + response);
		System.out.println("Your available shares are "+customer.getAvailableshares());
		company.setTotalprice(company.getTotalprice() + response * company.getShareprice());
		
		customer.setRupeesavailable(customer.getRupeesavailable() - response * company.getShareprice());
		System.out.println("Money in your account is "+customer.getRupeesavailable());
		 
	}

}
