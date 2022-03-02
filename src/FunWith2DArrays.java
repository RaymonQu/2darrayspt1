import java.util.Arrays;

public class FunWith2DArrays {

    public static int totalElements(int[][] listPara) {
        int counter = 0;
        for (int[] lists : listPara) {
            counter += lists.length;
        }
        return counter;
    }

    public static void fourCorners(String[][] strLists){
        System.out.println(strLists[0][0]);
        String endOfList1 = strLists[0][strLists[0].length - 1];
        System.out.println(endOfList1);
        String endOfList2 = strLists[strLists.length - 1][0];
        System.out.println(endOfList2);
        String endOfList3 = strLists[strLists.length - 1][strLists[0].length - 1];
        System.out.println(endOfList3);
    }

}
