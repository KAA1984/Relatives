import java.io.FileWriter;
import java.util.*;

public class Main {
    public static void main (String [] args)throws Exception{

        String test = "\\C:\\Users\\Андрей\\Desktop\\test.csv";
        FileWriter writer = new FileWriter(test);

        People dad = new People(1,"Tolik","Kalistratov", RelativeType.DAD);
        People mother = new People(2,"Lena","Kalistratova", RelativeType.MOTHER);
        People son = new People(3,"Andrey","Kalistratov", RelativeType.SON);
        People daughter = new People(4,"Oxana","Kalistratova", RelativeType.DAUGHTER);
        People fathersBrother = new People(5,"Vitya","Kalistratov", RelativeType.BROTHER);
        People fathersBrother1 = new People(6,"Kolya","Kalistratov", RelativeType.BROTHER);
        People son1FathersBrother = new People(7,"Sergey","Kalistratov", RelativeType.SON);
        People son2FathersBrother = new People(8,"Oleg","Kalistratov", RelativeType.SON);
        People sonFathersBrother1 = new People(9,"Oleg","Kalistratov", RelativeType.SON);
        People daugtherFathersBrother = new People(10,"Olga","   ", RelativeType.DAUGHTER);
        People dadFather = new People(11,"Sergey","Kalistratov",RelativeType.GRANDFATHER);
        People dadMother = new People(12,"Nina","Kalistratova",RelativeType.GRANDMOTHER);
        People motherFather = new People(13,"Andrey","Kreschik",RelativeType.GRANDFATHER);
        People motherMother = new People(14,"Efrosinia","Kreschika",RelativeType.GRANDMOTHER);
        People bother1wife = new People(15,"Anna","Kalistratova",RelativeType.UNT);
        People bother2wife = new People(16,"Olga","Kalistratova",RelativeType.UNT);
        People motherBrother = new People(17,"Viktor","Kreschik",RelativeType.BROTHER);
        People motherBrother1 = new People(18,"Sergey","Kreschik",RelativeType.BROTHER);
        People motherBrother2 = new People(19,"Vasiliy","Kreschik",RelativeType.BROTHER);
        People motherSyster = new People(20,"Valya","  ",RelativeType.SYSTER);
        People motherSyster1 = new People(21,"Tanya","Sokolova",RelativeType.SYSTER);
        People motherSysterHusband = new People(22,"Sergey"," ",RelativeType.UNCLE);
        People motherSyster1Husband = new People(23,"Alexsandr","Sokolov",RelativeType.UNCLE);
        People motherBrotherWife = new People(24,"Oxana","Kreschik",RelativeType.UNT);
        People motherBrother1Wife = new People(25,"Tamara","Kreschik",RelativeType.UNT);
        People son1FathersBrotherWife = new People(26,"Oxana","Kalistratova", RelativeType.SYSTER);
        People sonFathersBrother1Wife = new People(27,"Tanya","Kalistratova", RelativeType.SYSTER);
        People daugtherFathersBrotherHusbund = new People(28,"Slavik","   ", RelativeType.BROTHER);

        List<People> p = new ArrayList<>();

        p.add(dad);
        p.add(mother);
        p.add(son);
        p.add(daughter);
        p.add(fathersBrother);
        p.add(fathersBrother1);
        p.add(son1FathersBrother);
        p.add(son2FathersBrother);
        p.add(sonFathersBrother1);
        p.add(daugtherFathersBrother);
        p.add(dadFather);
        p.add(dadMother);
        p.add(motherFather);
        p.add(motherMother);
        p.add(bother1wife);
        p.add(bother2wife);
        p.add(motherBrother);
        p.add(motherBrother1);
        p.add(motherBrother2);
        p.add(motherSyster);
        p.add(motherSyster1);
        p.add(motherSysterHusband);
        p.add(motherSyster1Husband);
        p.add(motherBrotherWife);
        p.add(motherBrother1Wife);
        p.add(son1FathersBrotherWife);
        p.add(son1FathersBrotherWife);
        p.add(sonFathersBrother1Wife);
        p.add(daugtherFathersBrotherHusbund);


        for(People rel:p){
            writer.write(String.valueOf(rel));
            System.out.println(rel);
        }


        /* Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

       for(int i =0;i < p.size();i++){

          if(p.get(i).getType().equals(RelativeType.BROTHER)){
               System.out.println(p.get(i).getType());
           }
      }*/
     writer.close();

    }
}
