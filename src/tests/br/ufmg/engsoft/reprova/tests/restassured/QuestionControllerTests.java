package br.ufmg.engsoft.reprova.tests.restassured;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class QuestionControllerTests {

	@Test
	public void givenUrl_whenJsonResponseHasArrayWithGivenValuesUnderKey_thenCorrect() 
	{
		get("/api/questions")
		.then()
		.assertThat()
			.body("", Matchers.hasSize(0));
	}
	
}