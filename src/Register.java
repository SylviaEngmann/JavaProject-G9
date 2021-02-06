import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Register {
    List<Nameable>nameables;
    private List<Student> students;

    public  Register(List<Student>students){
        this.students = students;
    }

    public List<String> getRegister(){
        List<String>names = new ArrayList<>();

        for (var student:this.students){
            names.add(student.getName());
        }

        return names;
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level level){
        List<String>names = new ArrayList<>();
        for (var student:this.students){
            if (student.getLevel() == level){
                names.add(student.getName());
            }
        }
        return  names;
    }

//    public List<String>getRegisterByLevel(Level level){
//        List<String>names = new ArrayList<>();
//        for (var student:this.students){
//            if (student.getLevel() == level){
//                names.add(student.getName());
//            }
//        }
//        return  names;
//    }

    public void printReport(){
        for (var student:this.students){
            System.out.println(student.getName()+" "+student.getLevel());
        }
    }
}
