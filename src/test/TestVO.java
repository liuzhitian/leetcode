package test;

import java.io.Serializable;
import java.util.List;

public class TestVO implements Serializable {
    Integer i;
    List<TestVO2> list2;

    public TestVO() {
    }

    public TestVO(Integer i, List<TestVO2> list2) {
        this.i = i;
        this.list2 = list2;
    }

    @Override
    public String toString() {
        return "TestVO{" +
                "i=" + i +
                ", list2=" + list2 +
                '}';
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public List<TestVO2> getList2() {
        return list2;
    }

    public void setList2(List<TestVO2> list2) {
        this.list2 = list2;
    }
}
