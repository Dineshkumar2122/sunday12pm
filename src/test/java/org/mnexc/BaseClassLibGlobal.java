package org.mnexc;

import java.awt.Dimension;
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassLibGlobal{ 




	static WebDriver driver;

	static WebElement element;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void send(WebElement element,String data){
		element.sendKeys(data);
		
	}
	public static void click() {
		element.click();
	}
	public static WebElement locatorsById(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}
	public static WebElement locatorsbyName(String data) {
		WebElement element2 = driver.findElement(By.name(data));
		return element2;
	}
	public WebElement locatorsbyXpath(String data) {
		WebElement element3 = driver.findElement(By.xpath(data));
		return element3;
	}
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public String getAttribute(WebElement element) {
		String attr = element.getAttribute("value");
		return attr;
	}
	public void selectByText(WebElement element,String data) {
		Select se=new Select(element);
		se.selectByVisibleText(data);
	}
	public static void selectByindex(WebElement element, int data) {
		Select s=new Select(element);
		s.selectByIndex(data);
	}
	public static void selectByValue(WebElement element,String data) {
		Select sa=new Select(element);
		sa.selectByValue(data);
	}
	public void getOptions(WebElement element) {
		Select sd=new Select(element);
		sd.getOptions();
	}
	public void quit() {
		driver.quit();
	}
	public void close() {
		driver.close();
	}
	public void navigateUrl() {
		driver.navigate().back();
	}
	public void naviforwad() {
		driver.navigate().forward();
	}
	public void backward() {
		driver.navigate().back();
	} 


	public void refresh() {
		driver.navigate().refresh();
	}
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	public void setSize(int a,int b) {
		Dimension d=new Dimension();
		driver.manage().window().setSize(null);

	}
	public void setPosition(int a,int b) {
		Point p=new Point(a, b);
		driver.manage().window().setPosition(null);
	}


	//Actions
	public void moveToElement(WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void contextClick(WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}

	public void doubleClick(WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element);
	}
	public static void dragAndDrop(WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target);

	}
	public void clickAndHold(WebElement source,WebElement dest) {
		Actions a=new Actions(driver);
		a.clickAndHold(element);
	}

	public void alertAccept() {
		driver.switchTo().alert().accept();
	}
	public void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public void alertByGettext() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
	}
	public void implicitwait(int time,TimeUnit data) {
		driver.manage().timeouts().implicitlyWait(time,data);
	}
	public void explicitywait() {
		Wait w=new FluentWait(driver); 

	}
	public void navigate(String url) {
		driver.navigate().to(url);
	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void javaScripScrolldown(WebElement element) {
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].ScrollIntoView(true)", element);
	}
	public void javaScripScrollUp(WebElement element) {
		JavascriptExecutor ju=(JavascriptExecutor) driver;
		ju.executeScript("arg0.ScrollIntoView(false)", element);
	}
	public void javaScripExecutordownbytext(WebElement element) {
		JavascriptExecutor jt=(JavascriptExecutor) driver;
		jt.executeScript("arguments[0].SetAttribute('value','hello')", element);

	}
	public void selectByVisibletext(WebElement element,String data) {
		Select s =new Select(element);
		s.selectByVisibleText(data);
	} 
	public void windowsSwitch(String a) {
		driver.switchTo().window(a);
	}
	public static String readExcel(int rowno,int cellno) throws IOException {
		File f=new File("C:\\Users\\DINU\\Desktop\\FrameExcel\\Excel\\Book1.xlsx.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("login");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		Row ro = sheet.getRow(rowno);
		Cell cell = ro.getCell(cellno);

		int cellType = cell.getCellType();
		String name="";
		if (cellType==1) {
			name = cell.getStringCellValue();

		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();

			SimpleDateFormat dtfrmt=new SimpleDateFormat("dd/mm/yyy");
			name = dtfrmt.format(dateCellValue);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long)numericCellValue;
			name = String.valueOf(l);
		}

		return name;
	}


}






