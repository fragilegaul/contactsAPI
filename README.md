This is a REST API that allows interaction with a list of Contacts.
The main point: integration tests are provided using Spring MVC test support on the entire request and response lifecycle 
to make sure that all the layers are communicating effectively and smoothly. 
JUnit Jupiter API usage: before each integration test @BeforeEach annotated method populates the repository with some contacts 
and then @AfterEach annotated method clears it to make a fresh start. 
ObjectMapper is used inside a request builder to serialize a Java Object into a JSON String. 
JSONPath allows to query JSON.

Despite of the aim to test the app, here are some examples of a request - response cycle.
Create a contact
![2](https://github.com/user-attachments/assets/8e4c0881-1b72-48fd-b819-c1ffbf85c701)

![3](https://github.com/user-attachments/assets/614657fb-16d1-4974-8af0-8ec5a1811d1f)

![1](https://github.com/user-attachments/assets/2e4838c2-296e-4231-9bf9-3a9118f3e821)

View contacts

![4](https://github.com/user-attachments/assets/0caf516b-ab0e-4fc2-8de4-ec75db74651d)

Find a contact by its id

![5](https://github.com/user-attachments/assets/79ad5f36-3c2b-4356-8e3c-da06f15a5803)

Delete a contact (wrong id)

![6](https://github.com/user-attachments/assets/7d4ad99e-01c8-4e0a-bda5-dc5e36670d9d)
