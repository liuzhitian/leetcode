package test;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Test;
import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JsonTest {

    @Test
    public void test(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        TestVO2 vo2_1 = new TestVO2(list);
        TestVO2 vo2_2 = new TestVO2(list2);

        List<TestVO2> list3 = new ArrayList<>();

        List<List<Integer>> k = new ArrayList<>();
        k.add(list);
        k.add(list2);

        List<List<Employee>> emp = new ArrayList<>();
        List<Employee> employees1 = new ArrayList<>();
        List<Employee> employees2 = new ArrayList<>();
        employees1.add(new Employee("aaa",1));
        employees1.add(new Employee("aaa",1));
        employees1.add(new Employee("aaa",1));


        list3.add(vo2_1);
        list3.add(vo2_2);

        TestVO vo = new TestVO(2,list3);

        System.out.println(vo);

        String jsonStr = JSON.toJSONString(vo, SerializerFeature.WriteMapNullValue);
        System.out.println(jsonStr);

        TestVO testVO = JSON.parseObject(jsonStr, TestVO.class);
        System.out.println(testVO.toString());

        String jsonStr1 = JSON.toJSONString(vo2_1);
        System.out.println(jsonStr1);

        String strign = JSONObject.toJSONString(vo);
        System.out.println(strign);

        String string = JSON.toJSONString(k);
        System.out.println(string);
    }
}
