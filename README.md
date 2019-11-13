# persona-info
spring boot simple CRUD

## Steps to compile and run the application

git clone: https://github.com/omussawir-nisum-com/persona-info.git

Build: mvn clean install

Run: mvn spring-boot:run

## By default server is running on 8180 port

## Endpoints

* POST localhost:8180/persona  (create persona info)

* GET localhost:8180/persona/{id} (get persona info object by id)

* GET localhost:8180/persona (get list of all persona info)

* PUT localhost:8180/persona (update persona info object)

* DELETE localhost:8180/persona/{id} (delete persona info object by id)

* DELETE localhost:8180/persona (delete all persona info)

## Sample Json for Request Body

{
    "id": 10010,
    "name": "osama",
    "lastName": "mussawir",
    "address": "defense",
    "simplePhoneNumber": 2131231,
    "hairColour": "black"
}




