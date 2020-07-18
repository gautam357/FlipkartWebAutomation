package BestBatteryPhonesProduct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;
import com.flipkart.login.LoginWithEmail;
import com.flipkart.utilities.ExcelReader;
import com.flipkart.utilities.TestUtility;

public class BestBatteryPhones extends TestBase {

	@FindBy(xpath = "//div[5]//div[1]//div[2]//div[1]//div[1]//div[1]//div//div[1]//a[1]//div[@class='iUmrbN']")
	List<WebElement> listOfBestBatteryPhones;

	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	WebElement croseButton;

	@FindBy(xpath = "//span[@class='_35KyD6']")
	WebElement verificationOpenNewWindos;

	public BestBatteryPhones() {
		PageFactory.initElements(driver, this);
	}

	public String clickOnProduct() throws IOException, InterruptedException {
		// LoginWithEmail loginWithId = new LoginWithEmail();
		// loginWithId.getLogin();
		String clickedMob = null;
		croseButton.click();
		TestUtility.scrollingDownFullPage();
		ArrayList<String> phonelists = ExcelReader.getBestBatteryPhones();

		outer: for (int i = 0; i < phonelists.size(); i++) {
			for (int j = 0; j < listOfBestBatteryPhones.size(); j++) {
				if (phonelists.get(i).equalsIgnoreCase(listOfBestBatteryPhones.get(j).getText())) {
					clickedMob = phonelists.get(i);
					listOfBestBatteryPhones.get(j).click();
					break outer;

				}

			}
		}
		System.out.println(clickedMob.substring(0, 12));
		return clickedMob.substring(0, 12);
	}

	public String openNewWindos() {
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> itr = allwindows.iterator();
		String parentWindow = itr.next();
		String childWindor = itr.next();
		driver.switchTo().window(childWindor);
		System.out.println(verificationOpenNewWindos.getText().substring(0, 12));
		return verificationOpenNewWindos.getText().substring(0, 12);
	}

}
