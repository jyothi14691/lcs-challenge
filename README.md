# lcs-challenge

Instruction to Deployment :

1. clone the project from github using below command
git clone https://github.com/jyothi14691/lcs-challenge.git
2. Go to the clone directory using cd command
cd lcs-challenge
3. Import the project into any IDE of your choice
4. We need maven and java should be installed to run this application.
5. Run the LcsApplication file in the IDE to launch
6. SpringBootApplication launches in Tomcat :8080

How to test the application:

7. Test the app from Postman 
URI: localhost:8080/lcs
HEADERS: Content-Type : application/json
post request: 
"setOfStrings": [
    {"value": "comcast"},
    {"value": "comcastic"},
    {"value": "combroadcaster"}
    
  ]

8. Received output :

{
    "lcs": [
        "cast"
    ]
}


