package nad.edu.module2.builder;

import nad.edu.module2.inheritance.Person;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Student
 * @since 21.03.2021 - 17.30
 **/

public class Student2 extends Person2 {
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

    public Student2() {
    }

    public Student2(LocalDate dateOfAdmission, String university, String department, String chair,
                    String specialty, String group, String academicDegree, boolean scholarship,
                    boolean livesInDormitory, String learningType, String formOfStudy) {
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
    }

    public Student2(String firstName, String lastName, String patronymicName, LocalDate dateOfBirth,
                    String gender, String citizenship, String nationality, String country, String town,
                    String street, String houseNumber, int flatNumber, String passportId, String maritalStatus,
                    LocalDate dateOfAdmission, String university, String department, String chair, String specialty,
                    String group, String academicDegree, boolean scholarship, boolean livesInDormitory,
                    String learningType, String formOfStudy) {

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

    @Override
    public String toString() {
        return "Student {" + '\n' +
                super.toString() + '\n' +
                "dateOfAdmission =" + dateOfAdmission + '\n' +
                "university ='" + university + '\'' + '\n' +
                "department ='" + department + '\'' + '\n' +
                "chair ='" + chair + '\'' + '\n' +
                "specialty ='" + specialty + '\'' + '\n' +
                "group ='" + group + '\'' + '\n' +
                "academicDegree ='" + academicDegree + '\'' + '\n' +
                "scholarship =" + scholarship + '\n' +
                "livesInDormitory =" + livesInDormitory + '\n' +
                "learningType ='" + learningType + '\'' + '\n' +
                "formOfStudy ='" + formOfStudy + '\'' + '\n' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student2 student = (Student2) o;
        return isScholarship() == student.isScholarship() &&
                isLivesInDormitory() == student.isLivesInDormitory() &&
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
                isLivesInDormitory(), getLearningType(), getFormOfStudy());
    }

    public static class Builder {
        private Student2 studentToBuild;

        public Builder() {
            this.studentToBuild = new Student2();
        }

        public Builder setFirstName(String firstName) {
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName) {
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setPatronymicName(String patronymicName) {
            studentToBuild.setPatronymicName(patronymicName);
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            studentToBuild.setDateOfBirth(dateOfBirth);
            return this;
        }

        public Builder setGender(String gender) {
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setCitizenship(String citizenship) {
            studentToBuild.setCitizenship(citizenship);
            return this;
        }

        public Builder setNationality(String nationality) {
            studentToBuild.setNationality(nationality);
            return this;
        }

        public Builder setCountry(String country) {
            studentToBuild.setCountry(country);
            return this;
        }

        public Builder setTown(String town) {
            studentToBuild.setTown(town);
            return this;
        }

        public Builder setStreet(String street) {
            studentToBuild.setStreet(street);
            return this;
        }

        public Builder setHouseNumber(String houseNumber) {
            studentToBuild.setHouseNumber(houseNumber);
            return this;
        }

        public Builder setFlatNumber(int flatNumber) {
            studentToBuild.setFlatNumber(flatNumber);
            return this;
        }

        public Builder setPassportId(String passportId) {
            studentToBuild.setPassportId(passportId);
            return this;
        }

        public Builder setMaritalStatus(String maritalStatus) {
            studentToBuild.setMaritalStatus(maritalStatus);
            return this;
        }

        public Builder setDateOfAdmission(LocalDate dateOfAdmission) {
            studentToBuild.setDateOfAdmission(dateOfAdmission);
            return this;
        }

        public Builder setUniversity(String university) {
            studentToBuild.setUniversity(university);
            return this;
        }

        public Builder setDepartment(String department) {
            studentToBuild.setDepartment(department);
            return this;
        }

        public Builder setChair(String chair) {
            studentToBuild.setChair(chair);
            return this;
        }

        public Builder setSpecialty(String specialty) {
            studentToBuild.setSpecialty(specialty);
            return this;
        }

        public Builder setGroup(String group) {
            studentToBuild.setGroup(group);
            return this;
        }

        public Builder setAcademicDegree(String academicDegree) {
            studentToBuild.setAcademicDegree(academicDegree);
            return this;
        }

        public Builder setScholarship(boolean scholarship) {
            studentToBuild.setScholarship(scholarship);
            return this;
        }

        public Builder setLivesInDormitory(boolean livesInDormitory) {
            studentToBuild.setLivesInDormitory(livesInDormitory);
            return this;
        }

        public Builder setLearningType(String learningType) {
            studentToBuild.setLearningType(learningType);
            return this;
        }

        public Builder setFormOfStudy(String formOfStudy) {
            studentToBuild.setFormOfStudy(formOfStudy);
            return this;
        }

        public Student2 build() {
            return studentToBuild;
        }
    }
}
