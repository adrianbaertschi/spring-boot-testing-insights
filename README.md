# Spring Boot Testing insights
Demo project to learn various aspects of Spring Boot Testing


# Test flavours
## Bare bones Unit Test
No Spring involved. Mocking with Mockito possible explicit or with annotations.

* [Example simple](src/test/java/com/example/testinginsights/country/CountryServiceUnitTest.java)
* [Example Mockito annotations](src/test/java/com/example/testinginsights/country/CountryServiceUnitTestMockitoAnnotations.java)

## WebMvcTest
Only WebMvc components are active.
Specify controllers 
No @Component, @Service or @Repository beans can be used, these must be mocked.

* [Example](src/test/java/com/example/testinginsights/country/CountryControllerWebMvcTest.java)
* [Reference doc](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/autoconfigure/web/servlet/WebMvcTest.html)

## Integration Test without server
All beans available. MockMvc used to make calls.

* [Example](src/test/java/com/example/testinginsights/country/CountryIntegrationTest.java)

## Integration Test with server
All beans available. Make real calls using TestRestTemplate or similar.

* [Example](src/test/java/com/example/testinginsights/country/CountryIntegrationTestRestTemplate.java)

## Mocking external calls
HTTP: Configure url for test, use third party mock server library like [WireMock](http://wiremock.org/) or [MockWebServer](https://github.com/square/okhttp/tree/master/mockwebserver)

# Resources

## Getting started
[Spring Guide: Testing the Web Layer](https://spring.io/guides/gs/testing-web/)


The “Testing with Spring Boot” Series from reflectoring.io
1. https://reflectoring.io/unit-testing-spring-boot/
2. https://reflectoring.io/spring-boot-web-controller-test/
3. https://reflectoring.io/spring-boot-test/

## Advanced topics
[Baeldung: Optimizing Spring Integration Tests](https://www.baeldung.com/spring-tests)

[Reflectoring: Structuring and Testing Modules and Layers with Spring Boot](https://reflectoring.io/testing-verticals-and-layers-spring-boot/)

[Reference docs: Testing Spring Boot Applications](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-testing-spring-boot-applications)
