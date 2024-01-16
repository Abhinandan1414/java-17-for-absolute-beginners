
package JavaFun.Playground;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String... args) {

        Empid localEmpidArray[] = new Empid[5];
        // int deptInterested = 1;
        localEmpidArray[0] = new Empid("E1", 1, 1);
        localEmpidArray[1] = new Empid("E2", 2, 1);
        localEmpidArray[2] = new Empid("E3", 3, 1);
        localEmpidArray[3] = new Empid("E4", 4, 1);
        localEmpidArray[4] = new Empid("E5", 5, 1);
        // ArrayList<Empid> empidArralist = Array.ArrayList(localEmpidArray);
        List<Empid> localEmpidStream = Arrays.stream(localEmpidArray).filter(e -> e.getDept() == 1)
                .collect(Collectors.toList());
        System.out.println(localEmpidStream);

    }

}
