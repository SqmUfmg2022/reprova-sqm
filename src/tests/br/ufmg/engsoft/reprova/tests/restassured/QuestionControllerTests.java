package br.ufmg.engsoft.reprova.tests.restassured;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class QuestionControllerTests {
	// ToDo: Como parte do um teste de integração, é necessário que o banco de dados esteja populado com dados de teste. Do contrario, podemos utilizar um Mock na camada de repositorio.

	@Test
	public void givenUrl_whenJsonResponseHasArrayWithGivenValuesUnderKey_thenCorrect() 
	{
		get("/api/questions")
		.then()
		.assertThat()
			.body("", Matchers.hasSize(0));
	}
	
}