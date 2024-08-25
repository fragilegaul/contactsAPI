This is a REST API that allows interaction with a list of Contacts.
The main point: integration tests are provided using Spring MVC test support on the entire request and response lifecycle 
to make sure that all the layers are communicating effectively and smoothly. 
JUnit Jupiter API usage: before each integration test @BeforeEach annotated method populates the repository with some contacts 
and then @AfterEach annotated method clears it to make a fresh start. 
ObjectMapper is used inside a request builder to serialize a Java Object into a JSON String. 
JSONPath allows to query JSON.
