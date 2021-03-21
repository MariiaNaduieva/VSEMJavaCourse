package nad.edu.module2.inheritance;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Student
 * @since 21.03.2021 - 17.30
 **/

public class Student extends Person {
    private LocalDate dateOfAdmission; // to university
    private String university;
    private String department;
    private String chair;
    private String specialty;
    private String group;
    private String academicDegree; // bachelor, master, postgraduate student
    private boolean scholarship; // receives scholarship
    private boolean livesInDormitory; // whether the student lives in a dormitory
    private String learningType; // extramural or full-time education
    private String formOfStudy; // contract form or state-funded form of education
    private boolean groupLeader; // whether the student is a group leader or a regular student in the group

    public Student() {
    }

    public Student(LocalDate dateOfAdmission, String university, String department, String chair,
                   String specialty, String group, String academicDegree, boolean scholarship,
                   boolean livesInDormitory, String learningType, String formOfStudy, boolean groupLeader) {
        this.dateOfAdmission = dateOfAdmission;
        this.university = university;
        this.department = department;
        this.chair = chair;
        this.specialty = specialty;
        this.group = group;
        this.academicDegree = academicDegree;
        this.scholarship = scholarship;
        this.livesInDormitory = livesInDormitory;
        this.learningType = learningType;
        this.formOfStudy = formOfStudy;
        this.groupLeader = groupLeader;
    }

    public Student(String firstName, String lastName, String patronymicName, LocalDate dateOfBirth,
                   String gender, String citizenship, String nationality, String country, String town,
                   String street, String houseNumber, int flatNumber, String passportId, String maritalStatus,
                   LocalDate dateOfAdmission, String university, String department, String chair, String specialty,
                   String group, String academicDegree, boolean scholarship, boolean livesInDormitory,
                   String learningType, String formOfStudy, boolean groupLeader) {
        super(firstName, lastName, patronymicName, dateOfBirth, gender, citizenship, nationality,
                country, town, street, houseNumber, flatNumber, passportId, maritalStatus);
        this.dateOfAdmission = dateOfAdmission;
        this.university = university;
        this.department = department;
        this.chair = chair;
        this.specialty = specialty;
        this.group = group;
        this.academicDegree = academicDegree;
        this.scholarship = scholarship;
        this.livesInDormitory = livesInDormitory;
        this.learningType = learningType;
        this.formOfStudy = formOfStudy;
        this.groupLeader = groupLeader;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public boolean isLivesInDormitory() {
        return livesInDormitory;
    }

    public void setLivesInDormitory(boolean livesInDormitory) {
        this.livesInDormitory = livesInDormitory;
    }

    public String getLearningType() {
        return learningType;
    }

    public void setLearningType(String learningType) {
        this.learningType = learningType;
    }

    public String getFormOfStudy() {
        return formOfStudy;
    }

    public void setFormOfStudy(String formOfStudy) {
        this.formOfStudy = formOfStudy;
    }

    public boolean isGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(boolean groupLeader) {
        this.groupLeader = groupLeader;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "dateOfAdmission=" + dateOfAdmission +
                ", university='" + university + '\'' +
                ", department='" + department + '\'' +
                ", chair='" + chair + '\'' +
                ", specialty='" + specialty + '\'' +
                ", group='" + group + '\'' +
                ", academicDegree='" + academicDegree + '\'' +
                ", scholarship=" + scholarship +
                ", livesInDormitory=" + livesInDormitory +
                ", learningType='" + learningType + '\'' +
                ", formOfStudy='" + formOfStudy + '\'' +
                ", groupLeader=" + groupLeader +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return isScholarship() == student.isScholarship() &&
                isLivesInDormitory() == student.isLivesInDormitory() &&
                isGroupLeader() == student.isGroupLeader() &&
                getDateOfAdmission().equals(student.getDateOfAdmission()) &&
                getUniversity().equals(student.getUniversity()) &&
                getDepartment().equals(student.getDepartment()) &&
                getChair().equals(student.getChair()) &&
                getSpecialty().equals(student.getSpecialty()) &&
                getGroup().equals(student.getGroup()) &&
                getAcademicDegree().equals(student.getAcademicDegree()) &&
                getLearningType().equals(student.getLearningType()) &&
                getFormOfStudy().equals(student.getFormOfStudy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDateOfAdmission(), getUniversity(), getDepartment(),
                getChair(), getSpecialty(), getGroup(), getAcademicDegree(), isScholarship(),
                isLivesInDormitory(), getLearningType(), getFormOfStudy(), isGroupLeader());
    }
}
