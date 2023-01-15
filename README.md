< Software & Concept Used > <br>
  - Apache-Netbeans <br>
  - Postman API <br>
  - Spring-Boot Framework <br>
  - Java List Interface (implemented by ArrayList Class) <br>
  - Java Map Interface (implemented by HashMap Class)

<br>
Code Description is as below...
<br>
<br>

< GET Method >
  - Description: Get all Countries List
  - Request URL: http://localhost:8080/getcountries
  - Request Body: N/A
  - Response from Tomcat Server: <br>
  [{<br>
        "id": 1,<br>
        "countryName": "Korea",<br>
        "countryCapital": "Seoul"<br>
    },<br>
    {<br>
        "id": 2,<br>
        "countryName": "Ireland",<br>
        "countryCapital": "Dublin"<br>
    },<br>
    {<br>
        "id": 3,<br>
        "countryName": "Egpyt",<br>
        "countryCapital": "Cairo"<br>
    }]
  
  < POST Method >
  - Description: Add new Country Info with new index automatically added
  - Request URL: http://localhost:8080/addcountry
  - Request Body:
   {<br>
"countryName": "Japan",<br>
 "countryCapital": "Tokyo"<br>
}<br>
  - Response from Tomcat Server: <br>
  {<br>
  "id": 4,<br>
"countryName": "Japan",<br>
 "countryCapital": "Tokyo"<br>
}<br>

< PUT Method >
  - Description: Update Country Info at specific Index
  - Request URL: http://localhost:8080/updatecountry
  - Request Body: 
    {<br>
   "id": 4,<br>
   "countryName": "India",<br>
 "countryCapital": "Delhi"<br>
}<br>
  - Response from Tomcat Server: Updated from Japan (old info) → India (updated Info) <br>
  {<br>
   "id": 4,<br>
   "countryName": "India",<br>
 "countryCapital": "Delhi"<br>
}<br>

 
< DELETE Method >
  - Description: Delete Country Info at specific Index
  - Request URL: http://localhost:8080/deletecountry/4
  - Request Body: N/A
  - Response from Tomcat Server: <br>
  {<br>
"msg": "Country Deleted",<br>
   "id": 4<br>
}<br>
