public class Student extends Person{
    private int group;
    private int studentID;

    public void setGroup(int group){
        this.group = group;
    }

    public int getGroup(){
        return group;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public int getStudentID(){
        return studentID;
    }

    public void printInfo(){
        System.out.println("Student: " + getGroup() + " " + getSurname() + " " + getName() + ". Age: " + getAge() + ". " + "Student card: " + getStudentID());
    }
}