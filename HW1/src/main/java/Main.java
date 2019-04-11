//Question and notes - put away from there in next time
//it would be better if I make my own class for exeption? Or Just use already-made?
//I want to treat 2 error : 1) when we don't have enough parametrs, or more then 2
//                          2) when we can't convert to Interger

//send parametrs with according to this chema : java -classpath . Main para1 ; para2_;_.._;paran
//why I can't return args[0]???

public class Main {
    public static void main(String[] args) { //psvm
        if (args.length != 3) {
            System.out.println("Please, put two nubmers for sum");
            //add your own exeption there
        } else {
            Integer fst_nmb = 0;
            Integer sec_nmb = 0;

            try {
                fst_nmb = Integer.parseInt(args[0]);
                sec_nmb = Integer.parseInt(args[2]);
            } catch (Exception e) {
                System.out.println("Something was wrong");
                //make finished program with value 1? How?
            }
            Integer sum = fst_nmb + sec_nmb;
            System.out.println(fst_nmb + " + " + sec_nmb + " = " + sum);
        }

        return;
    }
}
