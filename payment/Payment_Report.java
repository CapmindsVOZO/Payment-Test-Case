package com.payment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Payment_Report extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	// public static void main(String[] args) throws InterruptedException {

	@Test(priority = 0)

	public void LoginPage() throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr1.vozo.xyz");

		// Enter Username

		sendkeys(pom.getAppointmentService().getUsername(), "Admin3");

		// Enter Password

		sendkeys(pom.getAppointmentService().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getAppointmentService().getSigninbtn());

	}

//	@Ignore

	@Test(priority = 2)

	public void Servicepage() throws InterruptedException {
		////////////// Payment////////////////

		// click pre

		// Clickonelement(pom.getAppointmentService().getclickpre());

		// click appoi

		try {
			Thread.sleep(8000);

			Clickonelement(pom.getAppointmentService().getcliccalDay());
		} catch (Exception e) {

		}
		// clic Date

		// Clickonelement(pom.getAppointmentService().getclidate());

		// click appoi

//		Thread.sleep(8000);
//
//		Clickonelement(pom.getAppointmentService().getclicapp());

		WebDriverWait pats = new WebDriverWait(driver, 20);
		WebElement patsele = pats
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='sc-hbjaKc iemQOA'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsele);

		/////////// ICD ///////////

		// Click Sevices

		Thread.sleep(8000);
		WebDriverWait ser = new WebDriverWait(driver, 20);
		WebElement sersel = ser
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Services')])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sersel);

		// Clickonelement(pom.getAppointmentService().getClickServices());

		Thread.sleep(8000);
		// click CPT Codes
		Clickonelement(pom.getAppointmentService().getClickCPTCodes());

		// Enter CPT codes

		Thread.sleep(5000);
		sendkeys(pom.getAppointmentService().getEnterCPTCodes(), "v");

		Thread.sleep(8000);

		// click CPT Codes
		Clickonelement(pom.getAppointmentService().getSelectCPTCodes());

		Thread.sleep(4000);
		// Clear fees
		clear(pom.getAppointmentService().getClearFees());

		// Enter Fees
		sendkeys(pom.getAppointmentService().getEnterFees(), "200");

		// press ok

		Thread.sleep(3000);
		Clickonelement(pom.getAppointmentService().getprok());
		try {
			// delet
			Thread.sleep(3000);
			Clickonelement(pom.getAppointmentService().getprdel());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

		Thread.sleep(8000);
		WebElement tex = driver.findElement(By.xpath("//span[@id='appt_service_fees']//span[1]"));

		String text = tex.getText();
		System.out.println(text);

		if (text.equals("$ 2200.00")) {
			System.out.println("Correct " + text);

		} else {

			System.out.println("Not Correct");
		}

		// sele Billing

		// Thread.sleep(4000);

		Thread.sleep(8000);
		WebDriverWait bill = new WebDriverWait(driver, 20);
		WebElement selbi = bill
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='appt_tabs-tab-3'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selbi);

		// Clickonelement(pom.getAppointmentService().getBillingsel());

		// crea invo

		Thread.sleep(5000);
		WebDriverWait sup = new WebDriverWait(driver, 20);
		WebElement supsel = sup
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='appt_superbill_btn'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", supsel);

//		Clickonelement(pom.getAppointmentService().getsupbill());

		// super bi

//		gettext(pom.getAppointmentService().getsupbillte());

		Thread.sleep(8000);
		WebElement tex1 = driver.findElement(By.className("amouts_val"));

		String text1 = tex1.getText();
		System.out.println(text1);

		if (text1.equals("$ 2200.00")) {
			System.out.println("Correct " + text1);

		} else {

			System.out.println("Not Correct");
		}

		// clos in

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclosenvo());

		// Pat Das

		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getpatdash());

		// Patient Balance

		Thread.sleep(8000);
		WebElement tex2 = driver.findElement(By.xpath("(//div[@class='w-50 bill-right m-color'])[1]"));

		String text2 = tex2.getText();
		System.out.println(text2);

		if (text2.equals("$ 2200.00")) {
			System.out.println("Correct " + text2);

		} else {

			System.out.println("Not Correct");
		}

		// sele Bill

//		// Pat Das
//
//		Thread.sleep(5000);
//
//		Clickonelement(pom.getAppointmentService().getpatdemo());

//		driver.close();

	}

	@Test(priority = 3)

	public void Billing() throws InterruptedException {

		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// click Billing Module
		Clickonelement(pom.getAppointmentService().getClickBillingModule());

		// Thread.sleep(4000);
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement patpay = wait3.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Patient Payments'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patpay);

		// Clickonelement(pom.getBilling().getpatientpayment());

		// patient search

		sendkeys(pom.getAppointmentService().getpateintsear1(), "junior");

		// Total Balance

		Thread.sleep(8000);
		WebElement tex3 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]"));

		String text3 = tex3.getText();
		System.out.println(text3);

		if (text3.equals("$ 2200.00")) {
			System.out.println("Correct " + text3);

		} else {

			System.out.println("Not Correct");
		}

		// click patientpayment1

		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getpateintpayment1());

		// search pat

		sendkeys(pom.getAppointmentService().getpateintsear2(), "junior");

//

		Clickonelement(pom.getAppointmentService().getselepatpay());

		// Total Balance

		Thread.sleep(8000);
		WebElement tex4 = driver.findElement(By.xpath("//*[@id='rc-tabs-7-panel-2']/div/div[1]/div[2]/tbody/tr/td[3]"));

		String text4 = tex4.getText();
		System.out.println(text4);

		if (text4.equals("$ 2200.00")) {
			System.out.println("Correct " + text4);

		} else {

			System.out.println("Not Correct");
		}

		// gettext(pom.getBilling().getselepatpay());

	}

}
