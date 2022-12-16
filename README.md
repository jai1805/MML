# MML
my movie list DB term project
Team Members:
1. Jaiwardhan Singh Rathore
2. Aishwary Nigam
3. Vijay Iyengar
4. Chetan Dhamane

How to Execute the project:
Backend: 
1. Build the Project once from the Intellij IDE.
2. For running the Spring-Boot APIs, write mvn spring-boot:run in the terminal.
3. Setup database in application.properties

Frontend:
1. First install the dependencies using: npm install
2. Now running the project,use: npm start

Database:
1.Download the dump from the archive.
2.To import data dump, follow the below given commands:
    a.First login to mysql and enter your mysql password: mysql -u root -p
    b.Now create a new database: CREATE DATABASE new_db_name;
    c.Now import the dump file: mysql –u username –p new_db_name <   dump_file.sql
    d.To check the database, relogin to your mysql: mysql -u root -p
    e.Load the database: USE new_db_name
    f.Display the contents of the database: SHOW TABLES;















