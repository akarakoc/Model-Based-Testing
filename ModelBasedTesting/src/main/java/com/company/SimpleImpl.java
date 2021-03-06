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

@Generated(value = "src/main/resources/com/company/Simple.json")
@GraphWalker(value = "random(edge_coverage(100))", start = "Start", groups = { "default" })
public class SimpleImpl extends ExecutionContext implements Simple {

	public final static Path MODEL_PATH = Paths.get("com/company/Simple.json");

	@Override
	public void v_VerifyPreferencePage() {
		System.out.println("Executing:v_VerifyPreferencePage");
	}

	@Override
	public void e_OpenPreferencesPage() {
		System.out.println("Executing:e_OpenPreferencesPage");
	}

	@Override
	public void e_ClosePreferencePage() {
		System.out.println("Executing:e_ClosePreferencePage");
	}

	@Override
	public void v_VerifyAppRunning() {
		System.out.println("Executing:v_VerifyAppRunning");
	}

	@Override
	public void e_StartApp() {
		System.out.println("Executing:e_StartApp");
	}

	@Test
	public void runSmokeTest() throws IOException {
		Context context = new SimpleImpl();
		TestBuilder builder = new TestBuilder().addContext(context, MODEL_PATH,
				new AStarPath(new ReachedVertex("v_VerifyAppRunning")));
		context.setNextElement(context.getModel().findElements("Start").get(0));
		Result result = builder.execute();
		Assert.assertFalse(result.hasErrors());
	}

	@Test
	public void runFunctionalTest() throws IOException {
		Context context = new SimpleImpl();
		TestBuilder builder = new TestBuilder().addContext(context, MODEL_PATH, new RandomPath(new EdgeCoverage(100)));
		context.setNextElement(context.getModel().findElements("Start").get(0));
		Result result = builder.execute();
		Assert.assertFalse(result.hasErrors());
	}

	@Test
	public void runStabilityTest() throws IOException {
		Context context = new SimpleImpl();
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
