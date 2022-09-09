Create Table  student (
    studentid integer identity NOT NULL,
    firstname varchar (100) NOT NULL,
    lastname varchar (100) NOT NULL,
    major varchar(40) NOT NULL,
    CONSTRAINT  pk_student_studentid PRIMARY KEY (studentid)
);