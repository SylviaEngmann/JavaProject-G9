import java.util.ArrayList;
import java.util.List;

public class Register {
    List<Nameable>nameables;
    public  Register(List<Nameable>nameables){

        this.nameables = nameables;
    }


    public List<String> getRegister(){
        List<String>names = new ArrayList<>();

        for (var nameables:this.nameables){
            names.add(nameables.getName());
        }

        return names;
    }

    public List<String>getRegisterByLevel(Level level){
        List<String>names = new ArrayList<>();
        for (var nameables:this.nameables){
            if (nameables.getLevel() == level){
                names.add(nameables.getName());
            }
        }
        return  names;
    }
}
