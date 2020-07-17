package com.company;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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
import org.openqa.selenium.support.ui.WebDriverWait;
@Generated(value = "src/main/resources/com/company/FirstModelScenario.json")
@GraphWalker(value = "random(edge_coverage(100))", start = "Start", groups = { "default" })
public class FirstModelScenarioImpl extends ExecutionContext implements FirstModelScenario {

	public final static Path MODEL_PATH = Paths.get("com/company/FirstModelScenario.json");
	
	static WebDriver driver;

	@Override
	public void v_VerifyGenre() {
		System.out.println("Executing:v_VerifyGenre");
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(driver, 10).until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		Integer elementSize=driver.findElements(By.xpath("//*[contains(text(),'Sci-Fi')]")).size();
		Assert.assertTrue("", elementSize > 0);	
	}
	
	@Override
	public void v_VerifyAdvancedSearchPage() {
		System.out.println("Executing:v_VerifyAdvancedSearchPage");
		Integer elementSize = driver.findElements(By.xpath("//*[contains(text(), 'Advanced Title Search')]")).size();
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void v_verifyHomePage() {
		System.out.println("Executing:v_verifyHomePage");
		String titleText = driver.getTitle();
		Assert.assertEquals(titleText,"IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows");
	}

	@Override
	public void e_goToGenrePage() {
		System.out.println("Executing:e_goToGenrePage");
		driver.get("https://www.imdb.com/chart/moviemeter/");
		driver.findElement(By.xpath("//*[contains(text(), 'Sci-Fi')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}

	@Override
	public void v_VerifyAdvancedSearchResult() {
		System.out.println("Executing:v_VerifyAdvancedSearchResult");
		Integer elementSize = driver.findElements(By.xpath("//*[contains(text(), '(Sorted by Popularity Ascending) - IMDb')]")).size();
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void e_goToCharts() {
		System.out.println("Executing:e_goToCharts");
		driver.get("https://www.imdb.com/chart/");
	}

	@Override
	public void e_goToHomePage() {
		System.out.println("Executing:e_goToHomePage");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALI\\Desktop\\selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
	}

	@Override
	public void v_VerifySearchResult() {
		System.out.println("Executing:v_VerifySearchResult");
		Integer elementSize = driver.findElements(By.xpath("//*[contains(text(), 'The Lord of the Rings')]")).size();
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void e_goToHomePage1() {
		System.out.println("Executing:e_goToHomePage1");
		driver.get("https://www.imdb.com/");
	}

	@Override
	public void e_goToHomePage2() {
		System.out.println("Executing:e_returnHomePage2");
		driver.get("https://www.imdb.com/");
	}

	@Override
	public void e_goToAdvancedSearchPage() {
		System.out.println("Executing:e_goToAdvancedSearchPage");
		driver.get("https://www.imdb.com/search/title/");
	}

	@Override
	public void v_VerifyImdbCharts() {
		System.out.println("Executing:v_VerifyImdbCharts");
		Integer elementSize = driver.findElements(By.xpath("//*[contains(text(), 'IMDb Charts')]")).size();
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void e_advancedSearchItem() {
		System.out.println("Executing:e_advancedSearchItem");
		driver.findElement(By.xpath("(//input[@name='title'])")).sendKeys("The Lord of the rings");
		driver.findElement(By.xpath("(//button[@type='submit'][contains(text(), 'Search')])")).click();
	}

	@Override
	public void e_searchItems() {
		System.out.println("Executing:e_searchItems");
		driver.findElement(By.xpath("(//input[@id='suggestion-search'])")).sendKeys("The Lord of the rings");
		driver.findElement(By.id("suggestion-search")).sendKeys(Keys.RETURN);
	}

	@Override
	public void e_goToHomePage3() {
		System.out.println("Executing:e_goToHomePage3");
		driver.get("https://www.imdb.com/");
	}

	@Test
	public void runSmokeTest() throws IOException {
		Context context = new FirstModelScenarioImpl();
		TestBuilder builder = new TestBuilder().addContext(context, MODEL_PATH,
				new AStarPath(new ReachedVertex("v_verifyHomePage")));
		context.setNextElement(context.getModel().findElements("Start").get(0));
		Result result = builder.execute();
		Assert.assertFalse(result.hasErrors());
	}

	@Test
	public void runFunctionalTest() throws IOException {
		Context context = new FirstModelScenarioImpl();
		TestBuilder builder = new TestBuilder().addContext(context, MODEL_PATH, new RandomPath(new EdgeCoverage(100)));
		context.setNextElement(context.getModel().findElements("Start").get(0));
		Result result = builder.execute();
		Assert.assertFalse(result.hasErrors());
	}

	@Test
	public void runStabilityTest() throws IOException {
		Context context = new FirstModelScenarioImpl();
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
