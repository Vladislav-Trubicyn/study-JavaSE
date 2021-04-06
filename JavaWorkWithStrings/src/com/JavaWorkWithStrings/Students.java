package com.JavaWorkWithStrings;

public class Students
{
    private static int countStudent = 1;

    private static int id_Student;
    private String firstName;
    private String lastName;
    private String idGroup;
    private String dolgCount;

    public Students(String firstName, String lastName,String idGroup,String dolgCount)
    {
        this.id_Student = countStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idGroup = idGroup;
        this.dolgCount = dolgCount;
        countStudent++;
    }

}
