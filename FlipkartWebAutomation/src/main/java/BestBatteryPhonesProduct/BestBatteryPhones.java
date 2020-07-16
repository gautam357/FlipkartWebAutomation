package BestBatteryPhonesProduct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;
import com.flipkart.login.LoginWithEmail;
import com.flipkart.utilities.ExcelReader;
import com.flipkart.utilities.TestUtility;

public class BestBatteryPhones extends TestBase {

	@FindBy(xpath = "//div[7]//div//div[2]//div//div//div//div//a//div[2]")
	List<WebElement> listOfBestBatteryPhones;

	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	WebElement croseButton;

	public BestBatteryPhones() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnProduct() throws IOException, InterruptedException {
		// LoginWithEmail loginWithId = new LoginWithEmail();
		// loginWithId.getLogin();
		croseButton.click();
		TestUtility.scrollingDownFullPage();
		ArrayList<String> phonelists = ExcelReader.getBestBatteryPhones();
		//System.out.println(phonelists);
		outer:for (int i = 0; i < phonelists.size(); i++) {
			for (int j = 0; j < listOfBestBatteryPhones.size(); j++) {
				System.out.println(listOfBestBatteryPhones.get(j).getText());
				System.out.println(phonelists.get(i).equalsIgnoreCase(listOfBestBatteryPhones.get(j).getText()));
				if (phonelists.get(i).equalsIgnoreCase(listOfBestBatteryPhones.get(j).getText())) {
					System.out.println("gffdhgfjfhgjghjhgjhgjghj");
					listOfBestBatteryPhones.get(j).click();
					break outer;

				}

			}
		}
	}
}
