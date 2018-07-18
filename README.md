Stocks App Documentation




Problem Statement:

Build a stocks app that maintains a watchlist and implements web services to create, read, and delete items from the watchlist.
Also, provide an API that gets the quote for a particular ticker symbol from the Yahoo Finance API.




Technology Stack:

IDE: Spring Tools Suite
Java
Spring Boot
Spring Data JPA
MySQL
Tomcat Server




Features:

1. Accessing a database with RESTful APIs:

    * The client uses API's to insert a new item, delete an existing item or read all items in their watchlist—maintained in a MySQL database.

    * A watchlist item contains stock information, namely, the ticker symbol, the name of the company, and the stock exchange.

2. Consuming an online API:

    * The client accesses an API to get the quote for a particular ticker symbol from Yahoo API

    * A quote consists of the ticker symbol, the name of the company, the stock exchange, the regular market price, the regular market volume, 	     and the market cap.

3. Exception Handling and Validation:
    
    * If a stock of the specified symbol does not exist in the database, return a 404 status instead of the default 200 status.

    * If any of the values in the post request body is an empty string, return a 400 status instead of creating a new watchlist item.

    * If the ticker symbol does not consist of only letters, return a 400 status instead of creating a new watchlist item.

    * In addition to sending a different status code, a custom message describing the problem is sent in the response.




API's:

GET     /watchlist
POST    /watchlist
DELETE  /watchlist/{id}
GET     /quote/{id}
