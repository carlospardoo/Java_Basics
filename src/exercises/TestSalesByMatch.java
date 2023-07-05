package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestSalesByMatch {

    public static void main(String[] args) {



//        List<Integer> socks = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        List<Integer> socks = Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
        int n = socks.size();

        System.out.println(sockMerchant(n, socks));

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int sockPair = 0;
        Map<Integer, Integer> sockTypeList = new HashMap<>();

        ar.stream().forEach(x ->{

                sockTypeList.putIfAbsent(x, 0);
                sockTypeList.put( x, sockTypeList.get(x) + 1 );
        });

        for( Entry<Integer, Integer> current : sockTypeList.entrySet() ){
            sockPair += current.getValue() / 2 ;
        }

        return sockPair;

    }
}
