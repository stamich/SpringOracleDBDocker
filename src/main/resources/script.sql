-- SCRIPT AS EXAMPLE

ALTER TABLE STORE.STORE_STAFF MODIFY ID GENERATED BY DEFAULT AS IDENTITY;
INSERT ALL
    INTO STORE.STORE_STAFF(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (1, 'Adam', 'Paradise', 'adam@com.com', 'password', 1, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_STAFF(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (2, 'Eva', 'Paradise', 'eva@com.com', 'password', 1, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_STAFF(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (3, 'Lot', 'Sodom', 'lot@com.com', 'password', 1, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_STAFF(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (4, 'Moses', 'Egyptian', 'moses@com.com', 'password', 1, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_STAFF(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (5, 'Salomon', 'Hebrew', 'salomon@com.com', 'password', 0, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_STAFF(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (6, 'David', 'Hebrew', 'david@com.com', 'password', 0, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_STAFF(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (7, 'Isaias', 'Hebrew', 'isaias@com.com', 'password', 0, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
SELECT 1 FROM DUAL;

INSERT ALL
    INTO STORE.STORE_STAFF_ROLE(STAFF_ID, ROLE) VALUES (1, 'CEO')
    INTO STORE.STORE_STAFF_ROLE(STAFF_ID, ROLE) VALUES (2, 'CTO')
    INTO STORE.STORE_STAFF_ROLE(STAFF_ID, ROLE) VALUES (3, 'MANAGER')
    INTO STORE.STORE_STAFF_ROLE(STAFF_ID, ROLE) VALUES (4, 'DEVELOPER')
    INTO STORE.STORE_STAFF_ROLE(STAFF_ID, ROLE) VALUES (5, 'DEVOPS')
    INTO STORE.STORE_STAFF_ROLE(STAFF_ID, ROLE) VALUES (6, 'DEVELOPER')
    INTO STORE.STORE_STAFF_ROLE(STAFF_ID, ROLE) VALUES (7, 'CEO')
SELECT 1 FROM DUAL;

ALTER TABLE STORE.STORE_CLIENT MODIFY ID GENERATED BY DEFAULT AS IDENTITY;
INSERT ALL
    INTO STORE.STORE_CLIENT(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (1, 'Abraham', 'Lincoln', 'lincoln@com.com', 'password', 1, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_CLIENT(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (2, 'George', 'Washington', 'washington@com.com', 'password', 1, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_CLIENT(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (3, 'Billy', 'Kid', 'kid@com.com', 'password', 1, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_CLIENT(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (4, 'Nicola', 'Tesla', 'tesla@com.com', 'password', 1, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_CLIENT(ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, ACTIVE, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (5, 'Albert', 'Einstein', 'einstein@com.com', 'password', 1, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
SELECT 1 FROM DUAL;

INSERT ALL
    INTO STORE.STORE_CLIENT_TYPE(CLIENT_ID, TYPE) VALUES (1, 'INDIVIDUAL')
    INTO STORE.STORE_CLIENT_TYPE(CLIENT_ID, TYPE) VALUES (2, 'SMALL_BUSINESS')
    INTO STORE.STORE_CLIENT_TYPE(CLIENT_ID, TYPE) VALUES (3, 'LIMITED_PARTNERSHIP')
    INTO STORE.STORE_CLIENT_TYPE(CLIENT_ID, TYPE) VALUES (4, 'JOINT_STOCK_COMPANY')
    INTO STORE.STORE_CLIENT_TYPE(CLIENT_ID, TYPE) VALUES (5, 'CORPORATE')
SELECT 1 FROM DUAL;

ALTER TABLE STORE.STORE_AUTHOR MODIFY ID GENERATED BY DEFAULT AS IDENTITY;
INSERT ALL
    INTO STORE.STORE_AUTHOR(ID, FIRST_NAME, LAST_NAME, EMAIL, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (1, 'Joshua', 'Bloch', 'bloch@com.com', CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_AUTHOR(ID, FIRST_NAME, LAST_NAME, EMAIL, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (2, 'Kenneth', 'Kousen', 'kousen@com.com', CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_AUTHOR(ID, FIRST_NAME, LAST_NAME, EMAIL, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (3, 'Uncle', 'Bob', 'bob@com.com', CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_AUTHOR(ID, FIRST_NAME, LAST_NAME, EMAIL, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (4, 'Craig', 'Walls', 'walls@com.com', CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_AUTHOR(ID, FIRST_NAME, LAST_NAME, EMAIL, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (5, 'Brian', 'Goetz', 'goetz@com.com', CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_AUTHOR(ID, FIRST_NAME, LAST_NAME, EMAIL, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (6, 'Chris', 'Richardson', 'richardson@com.com', CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
SELECT 1 FROM DUAL;

ALTER TABLE STORE.STORE_BOOK MODIFY ID GENERATED BY DEFAULT AS IDENTITY;
INSERT ALL
    INTO STORE.STORE_BOOK(ID, TITLE, ISBN, AVAILABLE, RATING, PRICE, AUTHOR_ID, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (1, 'Effective Java', '5345-4574-325', 1, 5, 37.99, 1, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_BOOK(ID, TITLE, ISBN, AVAILABLE, RATING, PRICE, AUTHOR_ID, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (2, 'Modern Java Recipes', '1007-4344-54635', 1, 5, 27.99, 2, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_BOOK(ID, TITLE, ISBN, AVAILABLE, RATING, PRICE, AUTHOR_ID, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (3, 'Clean code', '7567-4374-325', 1, 5, 23.95, 3, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_BOOK(ID, TITLE, ISBN, AVAILABLE, RATING, PRICE, AUTHOR_ID, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (4, 'Clean architecture', '3124-4774-325', 1, 5, 21.99, 3, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_BOOK(ID, TITLE, ISBN, AVAILABLE, RATING, PRICE, AUTHOR_ID, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (5, 'Clean agile', '5645-434734-325', 1, 5, 25.59, 3, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_BOOK(ID, TITLE, ISBN, AVAILABLE, RATING, PRICE, AUTHOR_ID, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (6, 'Spring in Action 4th ed.', '7867-967-325', 1, 5, 23.99, 4, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_BOOK(ID, TITLE, ISBN, AVAILABLE, RATING, PRICE, AUTHOR_ID, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (7, 'Spring in Action 5 th ed', '7837-457-325', 1, 5, 27.99, 4, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_BOOK(ID, TITLE, ISBN, AVAILABLE, RATING, PRICE, AUTHOR_ID, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (8, 'Spring Boot in Action', '945634-3577-325', 1, 5, 17.95, 4, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_BOOK(ID, TITLE, ISBN, AVAILABLE, RATING, PRICE, AUTHOR_ID, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (9, 'Java concurrency', '345-786-325', 1, 5, 22.99, 5, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_BOOK(ID, TITLE, ISBN, AVAILABLE, RATING, PRICE, AUTHOR_ID, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (10, 'Microservices Patterns', '78-5364-325', 1, 5, 31.95, 6, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
SELECT 1 FROM DUAL;

ALTER TABLE STORE.STORE_ORDER MODIFY ID GENERATED BY DEFAULT AS IDENTITY;
INSERT ALL
    INTO STORE.STORE_ORDER(ID, CLIENT_ID, PRICE_SUM, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (1, 2, 57.96, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_ORDER(ID, CLIENT_ID, PRICE_SUM, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (2, 1, 17.96, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_ORDER(ID, CLIENT_ID, PRICE_SUM, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (3, 3, 44.91, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_ORDER(ID, CLIENT_ID, PRICE_SUM, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (4, 4, 22.95, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_ORDER(ID, CLIENT_ID, PRICE_SUM, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (5, 5, 19.99, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_ORDER(ID, CLIENT_ID, PRICE_SUM, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (6, 2, 29.76, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_ORDER(ID, CLIENT_ID, PRICE_SUM, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (7, 1, 31.29, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_ORDER(ID, CLIENT_ID, PRICE_SUM, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (8, 4, 107.91, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_ORDER(ID, CLIENT_ID, PRICE_SUM, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (9, 5, 64.91, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
    INTO STORE.STORE_ORDER(ID, CLIENT_ID, PRICE_SUM, CREATED_AT, CREATED_BY, UPDATED_AT, UPDATED_BY)
    VALUES (10, 3, 59.99, CURRENT_TIMESTAMP, 'God', CURRENT_TIMESTAMP, 'God')
SELECT 1 FROM DUAL;

INSERT ALL
    INTO STORE.STORE_BOOK_ORDER(BOOK_ID, ORDER_ID) VALUES (1 , 1)
    INTO STORE.STORE_BOOK_ORDER(BOOK_ID, ORDER_ID) VALUES (8 , 1)
SELECT 1 FROM DUAL;