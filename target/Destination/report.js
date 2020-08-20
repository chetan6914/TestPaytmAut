$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("paytm.feature");
formatter.feature({
  "line": 1,
  "name": "Movie export in excel",
  "description": "",
  "id": "movie-export-in-excel",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Get movies from paytm",
  "description": "",
  "id": "movie-export-in-excel;get-movies-from-paytm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@API"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "API URL to fetch upcoming movies in paytm",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I send GET request to fetch upcoming movies",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify api response code as \"201\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify movie release date should not be before todays date",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#  And I verify movie poster url has only \".jpg\" format"
    },
    {
      "line": 10,
      "value": "# And paytm movie code is unique"
    },
    {
      "line": 11,
      "value": "# And No movie should have more than 1 lanuage format"
    }
  ],
  "line": 12,
  "name": "verify all asserts",
  "keyword": "Then "
});
formatter.match({
  "location": "Upcoming.apiURLToFetchUpcomingMoviesInPaytm()"
});
formatter.result({
  "duration": 99302600,
  "status": "passed"
});
formatter.match({
  "location": "Upcoming.iSendGETRequestToFetchUpcomingMovies()"
});
formatter.result({
  "duration": 3131847200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 31
    }
  ],
  "location": "Upcoming.iVerifyApiResponseCodeAs(int)"
});
formatter.result({
  "duration": 2046900,
  "status": "passed"
});
formatter.match({
  "location": "Upcoming.iVerifyMovieReleaseDateShouldNotBeBeforeTodaysDate()"
});
formatter.result({
  "duration": 25700,
  "status": "passed"
});
formatter.match({
  "location": "Upcoming.verifyAllAsserts()"
});
formatter.result({
  "duration": 72900,
  "status": "passed"
});
});