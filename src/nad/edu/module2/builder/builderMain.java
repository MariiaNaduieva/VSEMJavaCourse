package nad.edu.module2.builder;

import java.time.LocalDate;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class builderMain
 * @since 27.03.2021 - 17.35
 **/

public class builderMain {
    public static void main(String[] args) {
        Student2 Mariia = new Student2.Builder()
                .setFirstName("Mariia")
                .setLastName("Naduieva")
                .setPatronymicName("Alexseevna")
                .setDateOfBirth(LocalDate.of(1998, 2, 18))
                .setGender("female")
                .setCitizenship("Ukrainian")
                .setNationality("Ukrainian")
                .setCountry("Ukraine")
                .setTown("Kharkiv")
                .setStreet("Valentunivska")
                .setHouseNumber("47")
                .setFlatNumber(55)
                .setPassportId("NM 40050069")
                .setMaritalStatus("Married")
                .setDateOfAdmission(LocalDate.of(2020, 10, 01))
                .setUniversity("NTU KhPI")
                .setDepartment("Computer Sciences")
                .setChair("PIITY")
                .setSpecialty("Software Engineer")
                .setGroup("KN-M720")
                .setAcademicDegree("bachelor, master")
                .setScholarship(false)
                .setLivesInDormitory(false)
                .setLearningType("full-time")
                .setFormOfStudy("contract")
                .build();
        System.out.println(Mariia);
    }
}
/* result:
Student {
firstName ='Mariia'
lastName ='Naduieva'
patronymicName ='Alexseevna'
dateOfBirth =1998-02-18
gender ='female'
citizenship ='Ukrainian'
nationality ='Ukrainian'
country ='Ukraine'
town ='Kharkiv'
street ='Valentunivska'
houseNumber ='47'
flatNumber =55
passportId ='NM 40050069'
maritalStatus ='Married'

dateOfAdmission =2020-10-01
university ='NTU KhPI'
department ='Computer Sciences'
chair ='PIITY'
specialty ='Software Engineer'
group ='KN-M720'
academicDegree ='bachelor, master'
scholarship =false
livesInDormitory =false
learningType ='full-time'
formOfStudy ='contract'
}
 */
