# springboot-test

step1 - clone the repository

step2 - create a database in mysql with a name of "newtestdb_spring"

step3 - run using the command "mvn spring-boot:run"

step4 - run following commands to create the roles
  INSERT INTO roles(name) VALUES('ROLE_USER');
  INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
  INSERT INTO roles(name) VALUES('ROLE_ADMIN');
  
step5 - can check in postman with below requests
  POST request-> http://localhost:8081/api/auth/signup
  body
  {
    "username": "rrr",
    "email": "rrr234@gmail.com",
    "password": "12345678",
    "role": ["rrr","user"]
  }
  
  POST request-> http://localhost:8081/api/auth/signin
  body
  {
    "username": "rrr",
    "password": "12345678"
  }

  
  GET request-> http://localhost:8081/api/test/all
