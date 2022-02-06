public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int sozlunot;
    int note;

    Course(String name,String code,String prefix){
        this.name= name;
        this.code = code;
        this.prefix =prefix;
        int sozlunot;

        int note =0;

    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        }
        else {
            System.out.println("Ogretmen ve Ders Uyusmuyor");
        }

    }

    void printTeacherInfo(){
        this.teacher.print();
    }


}
