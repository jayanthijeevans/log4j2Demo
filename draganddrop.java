package log4j2Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utilities.lggr;

public class draganddrop {

	public static void main(String[] args) {
		/// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		lggr.info("opening chrome Browser");
		d.manage().window().maximize();
		d.get("https://selenium-apps.doselect.in/flag_match/");
		lggr.info("opening the site https://selenium-apps.doselect.in/flag_match/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a=new Actions(d);
		lggr.info("creating an instance of action class");
		WebElement red=d.findElement(By.id("red"));
		lggr.info("finding an element with id red");
		
		WebElement white=d.findElement(By.id("white"));
		lggr.info("finding an element with id white");
		WebElement blue=d.findElement(By.id("blue"));
		lggr.info("finding an element with id blue");
		WebElement t1=d.findElement(By.xpath("/html/body/greenbox/target[1]"));
		WebElement t2=d.findElement(By.xpath("/html/body/greenbox/target[2]"));
		WebElement t3=d.findElement(By.xpath("/html/body/greenbox/target[3]"));
		//Thread.sleep(1000);
		lggr.info("finding the 3 target areas");
		a.dragAndDrop(white, t2).perform();
		
		a.dragAndDrop(blue,t3).perform();
		a.dragAndDrop(red, t1).perform();
		lggr.info("Performing the drag and drop operation to create the flag");
		d.close();
		lggr.info("closing the browser");
		lggr.info("**********end**********");

	}

}
