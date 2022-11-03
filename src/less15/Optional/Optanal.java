package less15.Optional;

import java.util.Optional;

public class Optanal {
    public static void main(String[] args) {

        // of ------minicheba .  tu warmodgenilia gaakete es
        Optional name = Optional.of("");
        name.ifPresent(System.out::println);

        if(!name.isPresent()){
            System.out.println("000");
        }


// orElse ---------tu carielia mashin es qeni
        Optional name1 = Optional.empty();
        System.out.println(name1.orElse("Blank"));

    }



}
