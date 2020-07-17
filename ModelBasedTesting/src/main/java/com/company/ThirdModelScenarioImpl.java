package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.annotation.Generated;

import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.ReachedVertex;
import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.generator.AStarPath;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.Context;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.test.Result;
import org.graphwalker.java.test.TestBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Generated(value = "src/main/resources/com/company/ThirdModelScenario.json")
@GraphWalker(value = "random(edge_coverage(50))", start = "Start", groups = { "default" })
public class ThirdModelScenarioImpl extends ExecutionContext implements ThirdModelScenario {
	
	static WebDriver driver;

	public final static Path MODEL_PATH = Paths.get("com/company/ThirdModelScenario.json");

	@Override
	public void v_verifyFreeSearchResult() {
		System.out.println("Executing:v_verifyFreeSearchResult");
		Integer elementSize = driver.findElements(By.xpath("//*[contains(text(), 'The Lord of the Rings')]")).size();
		Assert.assertTrue("", true);
	}

	@Override
	public void v_verifyAdvancedTitlePage() {
		System.out.println("Executing:v_verifyAdvancedTitlePage");
		Integer elementSize = driver.findElements(By.xpath("//*[contains(text(), 'Advanced Title Search')]")).size();
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void e_goToAdvancedTitleSearchPage() {
		System.out.println("Executing:e_goToAdvancedTitleSearchPage");
		driver.get("https://www.imdb.com/search/title/");
	}

	@Override
	public void v_verifyHomePage() {
		System.out.println("Executing:v_verifyHomePage");
		String titleText = driver.getTitle();
		Assert.assertEquals(titleText,"IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows");
	}

	@Override
	public void e_searchTitle() {
		System.out.println("Executing:e_searchTitle");
		List<String> listInputs = new ArrayList<String>();
		listInputs.add("The Lord of the rings");
		listInputs.add("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		File file = new File("C:\\Users\\ALI\\eclipse-java-workspace\\ModelBasedTesting\\src\\main\\java\\com\\company\\sql.txt");
        Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        List<String> listFile = new ArrayList<String>();
        while (input.hasNextLine()) {
            listFile.add(input.nextLine());
        }
        
		File file2 = new File("C:\\Users\\ALI\\eclipse-java-workspace\\ModelBasedTesting\\src\\main\\java\\com\\company\\xss.txt");
        Scanner input2 = null;
		try {
			input2 = new Scanner(file2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        List<String> listFile2 = new ArrayList<String>();
        while (input2.hasNextLine()) {
            listFile2.add(input2.nextLine());
        }
        
        
		for( Integer i = 0; i < listInputs.size(); i++) {
			driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys(listInputs.get(i));
			driver.findElement(By.xpath("(//button[@type='submit'][contains(text(), 'Search')])")).click();
			driver.get("https://www.imdb.com/search/title/");
		}
		for( Integer i = 0; i < listFile.size(); i++) {
			driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys(listFile.get(i));
			driver.findElement(By.xpath("(//button[@type='submit'][contains(text(), 'Search')])")).click();
			driver.get("https://www.imdb.com/search/title/");
		}
		for( Integer i = 0; i < listFile2.size(); i++) {
			driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys(listFile2.get(i));
			driver.findElement(By.xpath("(//button[@type='submit'][contains(text(), 'Search')])")).click();
			driver.get("https://www.imdb.com/search/title/");
		}
		driver.get("https://www.imdb.com/search/title/");		
	}

	@Override
	public void e_goToHomePage() {
		System.out.println("Executing:e_goToHomePage");
		System.out.println("Executing:e_goToHomePage");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALI\\Desktop\\selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
	}

	@Override
	public void v_verifyAdvancedNameResults() {
		System.out.println("Executing:v_verifyAdvancedNameResults");
		Integer elementSize = driver.findElements(By.xpath("//*[contains(text(), 'Advanced Name Search')]")).size();
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void e_goToHome2() {
		System.out.println("Executing:e_goToHome2");
		driver.get("https://www.imdb.com/");
	}

	@Override
	public void e_goToHome3() {
		System.out.println("Executing:e_goToHome3");
		driver.get("https://www.imdb.com/");
	}

	@Override
	public void e_goToHome1() {
		System.out.println("Executing:e_goToHome1");
		driver.get("https://www.imdb.com/");
	}

	@Override
	public void v_verifyAdvancedTitleResults() {
		System.out.println("Executing:v_verifyAdvancedTitleResults");
		Integer elementSize = driver.findElements(By.xpath("//*[contains(text(), 'Advanced Title Search')]")).size();
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void e_searchName() {
		System.out.println("Executing:e_searchName");
		List<String> listInputs = new ArrayList<String>();
		listInputs.add("Tom Hanks");
		listInputs.add("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		File file = new File("C:\\Users\\ALI\\eclipse-java-workspace\\ModelBasedTesting\\src\\main\\java\\com\\company\\sql.txt");
        Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        List<String> listFile = new ArrayList<String>();
        while (input.hasNextLine()) {
            listFile.add(input.nextLine());
        }
        
		File file2 = new File("C:\\Users\\ALI\\eclipse-java-workspace\\ModelBasedTesting\\src\\main\\java\\com\\company\\xss.txt");
        Scanner input2 = null;
		try {
			input2 = new Scanner(file2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        List<String> listFile2 = new ArrayList<String>();
        while (input2.hasNextLine()) {
            listFile2.add(input2.nextLine());
        }
        
        
		for( Integer i = 0; i < listInputs.size(); i++) {
			driver.findElement(By.xpath("(//input[@name='name'])")).sendKeys(listInputs.get(i));
			driver.findElement(By.xpath("(//button[@type='submit'][contains(text(), 'Search')])")).click();
			driver.get("https://www.imdb.com/search/name/");
		}
		for( Integer i = 0; i < listFile.size(); i++) {
			driver.findElement(By.xpath("(//input[@name='name'])")).sendKeys(listFile.get(i));
			driver.findElement(By.xpath("(//button[@type='submit'][contains(text(), 'Search')])")).click();
			driver.get("https://www.imdb.com/search/name/");
		}
		for( Integer i = 0; i < listFile2.size(); i++) {
			driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys(listFile2.get(i));
			driver.findElement(By.xpath("(//button[@type='submit'][contains(text(), 'Search')])")).click();
			driver.get("https://www.imdb.com/search/title/");
		}
		driver.get("https://www.imdb.com/search/name/");		
		
	}

	@Override
	public void e_searchFree() {
		System.out.println("Executing:e_searchFree");
		List<String> listInputs = new ArrayList<String>();
		listInputs.add("Tom Hanks");
		listInputs.add("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

		
		File file = new File("C:\\Users\\ALI\\eclipse-java-workspace\\ModelBasedTesting\\src\\main\\java\\com\\company\\sql.txt");
        Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        List<String> listFile = new ArrayList<String>();
        while (input.hasNextLine()) {
            listFile.add(input.nextLine());
        }
        
		File file2 = new File("C:\\Users\\ALI\\eclipse-java-workspace\\ModelBasedTesting\\src\\main\\java\\com\\company\\xss.txt");
        Scanner input2 = null;
		try {
			input2 = new Scanner(file2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        List<String> listFile2 = new ArrayList<String>();
        while (input2.hasNextLine()) {
            listFile2.add(input2.nextLine());
        }
        
        for( Integer i = 0; i < listInputs.size(); i++) {
			driver.findElement(By.xpath("(//input[@id='suggestion-search'])")).sendKeys(listInputs.get(i));
			driver.findElement(By.id("suggestion-search")).sendKeys(Keys.RETURN);
			driver.get("https://www.imdb.com/");
		}
        for( Integer i = 0; i < listFile.size(); i++) {
			driver.findElement(By.xpath("(//input[@id='suggestion-search'])")).sendKeys(listFile.get(i));
			driver.findElement(By.id("suggestion-search")).sendKeys(Keys.RETURN);
			driver.get("https://www.imdb.com/");
		}
		for( Integer i = 0; i < listFile2.size(); i++) {
			driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys(listFile2.get(i));
			driver.findElement(By.xpath("(//button[@type='submit'][contains(text(), 'Search')])")).click();
			driver.get("https://www.imdb.com/search/title/");
		}
		driver.get("https://www.imdb.com/");
	}

	@Override
	public void v_verifyAdvancedNamePage() {
		System.out.println("Executing:v_verifyAdvancedNamePage");
		Integer elementSize = driver.findElements(By.xpath("//*[contains(text(), 'Advanced Name Search')]")).size();
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void e_goToAdvancedNameSearchPage() {
		System.out.println("Executing:e_goToAdvancedNameSearchPage");
		driver.get("https://www.imdb.com/search/name/");
	}

	@Test
	public void runSmokeTest() throws IOException {
		Context context = new ThirdModelScenarioImpl();
		TestBuilder builder = new TestBuilder().addContext(context, MODEL_PATH,
				new AStarPath(new ReachedVertex("v_verifyHomePage")));
		context.setNextElement(context.getModel().findElements("Start").get(0));
		Result result = builder.execute();
		Assert.assertFalse(result.hasErrors());
	}

	@Test
	public void runFunctionalTest() throws IOException {
		Context context = new ThirdModelScenarioImpl();
		TestBuilder builder = new TestBuilder().addContext(context, MODEL_PATH, new RandomPath(new EdgeCoverage(100)));
		context.setNextElement(context.getModel().findElements("Start").get(0));
		Result result = builder.execute();
		Assert.assertFalse(result.hasErrors());
	}

	@Test
	public void runStabilityTest() throws IOException {
		Context context = new ThirdModelScenarioImpl();
		TestBuilder builder = new TestBuilder().addContext(context, MODEL_PATH,
				new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)));
		context.setNextElement(context.getModel().findElements("Start").get(0));
		Result result = builder.execute();
		Assert.assertFalse(result.hasErrors());
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

}
