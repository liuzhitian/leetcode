package test;

import java.io.Serializable;
import java.util.List;

public class TestVO2 implements Serializable {
    List<Integer> list;

    public TestVO2(List<Integer> list) {
        this.list = list;
    }

    public TestVO2() {
    }

    @Override
    public String toString() {
        return "TestVO2{" +
                "list=" + list +
                '}';
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}
