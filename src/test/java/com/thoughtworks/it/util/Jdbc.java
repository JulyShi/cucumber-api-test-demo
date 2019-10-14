package com.thoughtworks.it.util;

import com.sun.org.apache.xpath.internal.objects.XObject;
import org.graalvm.compiler.lir.CompositeValue;

import java.util.List;
import java.util.Map;

@Component
public class Jdbc {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static  ThreadLocal<Boolean> isUsingServiceB = new ThreadLocal<>();

    @Autowired
    @Qualifier('serviceAJdbcTemplete')
    private JdbcTemplate serviceAJdbcTemplete;

    @Autowired
    @Qualifier('serviceBJdbcTemplete')
    private JdbcTemplate serviceBJdbcTemplete;

    public Jdbc(){
        isUsingServiceB.set(false);
    }

    public void useServiceB(){
        isUsingServiceB.set(true);
    }

    public void useServiceA(){
        isUsingServiceB.set(false);
    }

    public void execute(String sql) {
        if(isUsingServiceB.get()){
            serviceBJdbcTemplete.execute(sql);
        }else{
            serviceAJdbcTemplete.execute(sql);
        }
    }

    public List<Map<String, Object>> query(String sql){
        if(isUsingServiceB.get()){
            serviceBJdbcTemplete.queryForList(sql);
        }else{
            serviceAJdbcTemplete.queryForList(sql);
        }
    }
}
