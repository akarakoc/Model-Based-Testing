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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Generated(value = "src/main/resources/com/company/SecondModelScenario.json")
@GraphWalker(value = "random(edge_coverage(100))", start = "Start", groups = { "default" })
public class SecondModelScenarioImpl extends ExecutionContext implements SecondModelScenario {

	public final static Path MODEL_PATH = Paths.get("com/company/SecondModelScenario.json");
	
	static WebDriver driver;

	@Override
	public void e_goToProfile3() {
		System.out.println("Executing:e_goToProfile3");
		driver.get("https://www.imdb.com/user/ur118709280/");
	}

	@Override
	public void e_goToProfile2() {
		System.out.println("Executing:e_goToProfile2");
		driver.get("https://www.imdb.com/user/ur118709280/");
	}

	@Override
	public void e_goToTopMoviesPage2() {
		System.out.println("Executing:e_goToTopMoviesPage2");
		driver.get("https://www.imdb.com/chart/top/");
	}

	@Override
	public void v_verifyLoginPage() {
		System.out.println("Executing:v_verifyLoginPage");
		int elementSize = driver.findElements(By.xpath("//h1[contains(text(), 'Sign-In')]")).size();
		System.out.print(driver.findElement(By.xpath("//h1[contains(text(), 'Sign-In')]")).getText());
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void v_verifyProfilePage() {
		System.out.println("Executing:v_verifyProfilePage");
		int elementSize = driver.findElements(By.xpath("//*[contains(text(), 'alikarakoceee')]")).size();
		System.out.print(driver.findElements(By.xpath("//*[contains(text(), 'alikarakoceee')]")));
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void e_clickCreateList() {
		System.out.println("Executing:e_clickCreateList");
		driver.get("https://www.imdb.com/list/create");
	}

	@Override
	public void v_verifyCreateListPage() {
		System.out.println("Executing:v_verifyCreateListPage");
		int elementSize = driver.findElements(By.xpath("//*[contains(text(), 'Create a new list')]")).size();
		Assert.assertTrue("", elementSize > 0);
		
	}

	@Override
	public void e_goToLoginPage() {
		System.out.println("Executing:e_goToLoginPage");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALI\\Desktop\\selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imdb.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.imdb.com%2Fregistration%2Fap-signin-handler%2Fimdb_us&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=imdb_us&openid.mode=checkid_setup&siteState=eyJvcGVuaWQuYXNzb2NfaGFuZGxlIjoiaW1kYl91cyIsInJlZGlyZWN0VG8iOiJodHRwczovL3d3dy5pbWRiLmNvbS9jaGFydC90b3A_cmVmXz1sb2dpbiJ9&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&tag=imdbtag_reg-20");
	}

	@Override
	public void v_verifyLogout() {
		System.out.println("Executing:v_verifyLogout");
		int elementSize = driver.findElements(By.xpath("//h1[contains(text(), 'Sign-In')]")).size();
		System.out.print(driver.findElements(By.xpath("//h1[contains(text(), 'Sign-In')]")));
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void e_goToLoginPage2() {
		System.out.println("Executing:e_goToLoginPage2");
		driver.get("https://www.imdb.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.imdb.com%2Fregistration%2Fap-signin-handler%2Fimdb_us&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=imdb_us&openid.mode=checkid_setup&siteState=eyJvcGVuaWQuYXNzb2NfaGFuZGxlIjoiaW1kYl91cyIsInJlZGlyZWN0VG8iOiJodHRwczovL3d3dy5pbWRiLmNvbS9jaGFydC90b3A_cmVmXz1sb2dpbiJ9&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&tag=imdbtag_reg-20");
	}

	@Override
	public void e_login() {
		System.out.println("Executing:e_login");
		driver.findElement(By.id("ap_email")).clear();
		driver.findElement(By.id("ap_email")).sendKeys("ali.karakoc.eee@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Modeltest!");
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("Executing:e_loginandGoToProfilepge");
		driver.get("https://www.imdb.com/user/ur118709280/?ref_=nv_usr_prof_2");
	}

	@Override
	public void v_verifyDeleteList() {
		System.out.println("Executing:v_verifyDeleteList");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		int elementSize = driver.findElements(By.xpath("//*[contains(text(), 'myTestList')]")).size();
		Assert.assertTrue("", elementSize == 1);	
	}

	@Override
	public void e_createList() {
		System.out.println("Executing:e_createList");
		driver.findElement(By.id("list-create-name")).sendKeys("myTestList");
		driver.findElement(By.id("list-create-description")).sendKeys("This is my test description!");
		driver.findElement(By.xpath("(//button[@type='button'][contains(text(), 'CREATE')])")).click();
		//driver.findElement(By.xpath("(//*[@class='btn-raised btn-raised--primary list-edit-done'])")).click();
		driver.get("https://www.imdb.com/user/ur118709280/lists");
		
	}

	@Override
	public void e_deleteList() {
		System.out.println("Executing:e_deleteList");
		driver.get("https://www.imdb.com/user/ur118709280/lists");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[@class='vertical-ellipsis']")).click();
		driver.findElement(By.xpath("(//*[starts-with(@id,'ls')][contains(text(), 'Delete this list')])")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("(//*[@class='flat-button pop-up-modal-option confirm'][contains(text(), 'Delete')])")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}

	@Override
	public void e_deleteList2() {
		System.out.println("Executing:e_deleteList2");
		driver.get("https://www.imdb.com/user/ur118709280/lists");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[@class='vertical-ellipsis']")).click();
		driver.findElement(By.xpath("(//*[starts-with(@id,'ls')][contains(text(), 'Delete this list')])")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("(//*[@class='flat-button pop-up-modal-option confirm'][contains(text(), 'Delete')])")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	@Override
	public void v_verifyTopMoviesPage() {
		System.out.println("Executing:v_verifyTopMoviesPage");
		int elementSize = driver.findElements(By.xpath("//h1[contains(text(), 'Top Rated Movies')]")).size();
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void v_verifyEditList() {
		System.out.println("Executing:v_verifyEditList");
		driver.findElement(By.xpath("(//*[@class='vertical-ellipsis'])")).click();
		driver.findElement(By.xpath("(//*[@class='pop-up-menu-list-item-link'][contains(text(), 'Edit')])")).click();
		int elementSize = driver.findElements(By.xpath("//*[contains(text(), 'myTestList')]")).size();
		Assert.assertTrue("", elementSize > 0);
		
	}

	@Override
	public void e_addItemtoWatchlist() {
		System.out.println("Executing:e_addItemtoWatchlist");
		driver.get("https://www.imdb.com/title/tt0167260/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=e31d89dd-322d-4646-8962-327b42fe94b1&pf_rd_r=1CAQ1AWTS0SGSC30HJV7&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=top&ref_=chttp_tt_7");
		driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[2]/div[2]/button[2]")).click();
		driver.get("https://www.imdb.com/user/ur118709280/watchlist");
	}
	
	@Override
	public void v_verifyEditWatchlist() {
		System.out.println("Executing:v_verifyEditWatchlist");
		int elementSize = driver.findElements(By.xpath("//*[contains(text(), 'Your Watchlist')]")).size();
		Assert.assertTrue("", elementSize > 0);
	}

	@Override
	public void v_verifyWatchlist() {
		System.out.println("Executing:v_verifyWatchlist");
		int elementSize = driver.findElements(By.xpath("//*[contains(text(), 'Your Watchlist')]")).size();
		Assert.assertTrue("", elementSize > 0);
		driver.get("https://www.imdb.com/user/ur118709280/watchlist");
	}

	@Override
	public void v_verifyCreatedList() {
		System.out.println("Executing:v_verifyCreatedList");
		int elementSize = driver.findElements(By.xpath("//*[contains(text(), 'myTestList')]")).size();
		Assert.assertTrue("", elementSize > 0);
		driver.get("https://www.imdb.com/user/ur118709280/lists");
	}

	@Override
	public void e_editWatchList() {
		System.out.println("Executing:e_editWatchList");
		driver.findElement(By.xpath("(//*[@refmarker='wl_edt_pwr'])")).click();
		driver.findElement(By.xpath("//*[@id=\"totalCheck\"]")).click();
		driver.findElement(By.xpath("(//*[@id='delete_items'])")).click();
		driver.findElement(By.xpath("(//*[@type='submit'][@value='DELETE'])")).click();
	}

	@Override
	public void e_logout() {
		System.out.println("Executing:e_logout");
		driver.get("https://www.imdb.com/registration/logout?ref=nv_usr_lgout_6");
		driver.get("https://www.imdb.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.imdb.com%2Fregistration%2Fap-signin-handler%2Fimdb_us&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=imdb_us&openid.mode=checkid_setup&siteState=eyJvcGVuaWQuYXNzb2NfaGFuZGxlIjoiaW1kYl91cyIsInJlZGlyZWN0VG8iOiJodHRwczovL3d3dy5pbWRiLmNvbS9jaGFydC90b3A_cmVmXz1sb2dpbiJ9&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&tag=imdbtag_reg-20");

	}
	
	
	@Override
	public void e_editList() {
		System.out.println("Executing:e_editList");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//WebElement element = wait.until(
		//ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='pop-up-menu-list-item-link'][contains(text(), 'Edit')])")));
		driver.findElement(By.xpath("//*[@class='vertical-ellipsis']")).click();
		driver.findElement(By.xpath("(//*[starts-with(@id,'ls')]/ul/li[1])")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//driver.findElement(By.xpath("//*[@class='rendered list-edit-description ipl-input__input']")).clear();
		//driver.findElement(By.xpath("//*[@class='rendered list-edit-description ipl-input__input']")).sendKeys("This is the Edited List!");
		driver.findElement(By.xpath("(//*[contains(text(), 'Done')])")).click();
	}

	@Test
	public void runSmokeTest() throws IOException {
		Context context = new SecondModelScenarioImpl();
		TestBuilder builder = new TestBuilder().addContext(context, MODEL_PATH,
				new AStarPath(new ReachedVertex("v_verifyProfilePage")));
		context.setNextElement(context.getModel().findElements("Start").get(0));
		Result result = builder.execute();
		Assert.assertFalse(result.hasErrors());
	}

	@Test
	public void runFunctionalTest() throws IOException {
		Context context = new SecondModelScenarioImpl();
		TestBuilder builder = new TestBuilder().addContext(context, MODEL_PATH, new RandomPath(new EdgeCoverage(100)));
		context.setNextElement(context.getModel().findElements("Start").get(0));
		Result result = builder.execute();
		Assert.assertFalse(result.hasErrors());
	}

	@Test
	public void runStabilityTest() throws IOException {
		Context context = new SecondModelScenarioImpl();
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
