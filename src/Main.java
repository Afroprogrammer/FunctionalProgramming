import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {

    static class Calculator implements Operation<Integer, Integer, String, Integer> {
        @Override
        public Integer apply(Integer arg1, Integer arg2, String arg3) {
            switch (arg3){
                case "add":
                    return arg1 + arg2;
                case "subtract":
                    return arg1 - arg2;
                case "power":
                    return (int)(Math.pow(arg1, arg2));
                default:
                    return -1;
            }

        }
    }

    static class Zipper<T> implements Zip<T, T, T>{
        @Override
        public Object apply(Object arg1, Object arg2) {
//            return arg1.toString() + " " + arg2.toString();
            StringBuilder output = new StringBuilder("[");
            if(arg1 instanceof List){
                for (int i = 0; i < ((List<?>) arg1).size(); i++) {
                    String coordinate = "(";
                    coordinate += ((List<?>) arg1).get(i);
                    coordinate += ", ";
                    coordinate += ((List<?>) arg2).get(i);
                    if(i != ((List<?>) arg1).size() - 1)
                        coordinate += "), ";
                    else
                        coordinate += ")";
                    output.append(coordinate);
                }
                output.append("]");
            }

//            if(arg1 instanceof String){
//                for (int i = 0; i < arg1.toString().length(); i++) {
//                    String coordinate = "(";
//                    coordinate += arg1.toString().get(i);
//                    coordinate += ", ";
//                    coordinate += (arg2).get(i);
//                    coordinate += "), ";
//                    output.append(coordinate);
//                }
//            }

            return output.toString();
        }
    }

    public static void main(String[] args) {
//        System.out.println(new Calculator().apply(3, 3, "power"));
//
//        System.out.println("========================");
//
//        System.out.println(new Zipper().apply("Sedem", "Quame"));

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(2);
        list2.add(1);

        System.out.println("Output \n" + new Zipper().apply(list1, list2));


//        ==========================


    }

}



