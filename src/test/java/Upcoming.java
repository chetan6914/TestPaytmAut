import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.Date;
import java.util.ResourceBundle;

public class Upcoming extends Reporter {

    static String api_URl = "";
    static Response resp;
    static int size;

    @Given("^API URL to fetch upcoming movies in paytm$")
    public void apiURLToFetchUpcomingMoviesInPaytm() throws IOException {

        api_URl = (String) Reporter.fetchValue("URL_Upcoming_Movies");
    }

    @When("^I send GET request to fetch upcoming movies$")
    public void iSendGETRequestToFetchUpcomingMovies() {

        resp = RestAssured.given().get(api_URl);
        size = resp.jsonPath().getList("upcomingMovieData").size();
        Reporter.assertThat(resp.getStatusCode(),200);


    }

    @Then("^I verify movie release date should not be before todays date$")
    public void iVerifyMovieReleaseDateShouldNotBeBeforeTodaysDate() {

    }


    @And("^I verify api response code as \"([^\"]*)\"$")
    public void iVerifyApiResponseCodeAs(int respcode) throws Throwable {

//        assertTest(respcode,resp.getStatusCode());

    }

    @Then("^verify all asserts$")
    public void verifyAllAsserts() {
        soft.assertAll();
    }

}
