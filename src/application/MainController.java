package application;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private TextField userText;

	@FXML
	private TextField password;

	public void generateRandom(ActionEvent event) {

		Random rand = new Random();
		int myrand = rand.nextInt(50);
		System.out.println(Integer.toString(myrand));

	}

	public void LEAPYEAR(ActionEvent even) {
		int year = 2020;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR 2020");
		} else {
			System.out.println("COMMON YEAR");

		}

	}

	public void nextpage(ActionEvent event) {

		Stage primaryStage = new Stage();

		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Simple.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void login(ActionEvent event) {

		// Stage primaryStage = new Stage();
		if (userText.getText().equals("admin") && password.getText().equals("123"));
		try {
			System.setProperty("webdriver.chrome.driver", "/Users/shahinkibrea/eclipse-workspace/internship_project/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.humaninvestment.jp/");
		} catch (Exception e) {
			System.out.println(e);
		}
					
	}
	
	public void calculate(ActionEvent event) {
		
		
	}
	
	

}
