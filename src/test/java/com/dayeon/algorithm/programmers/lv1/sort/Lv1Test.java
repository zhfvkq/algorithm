package com.dayeon.algorithm.programmers.lv1.sort;

import com.dayeon.algorithm.programmers.lv1.Solution1;
import com.dayeon.algorithm.programmers.lv1.Solution2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lv1Test {

    @Test
    public void solution1Test(){
        Solution1 solution1 = new Solution1();
        solution1.testDy();
    }

    @Test
    public void solution2Test(){
        Solution2 solution2 = new Solution2();
        solution2.testDy();
    }


}