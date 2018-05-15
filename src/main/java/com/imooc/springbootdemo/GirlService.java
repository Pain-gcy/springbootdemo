package com.imooc.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author E470
 * @create 2018 - 05 - 14 10:07
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(30);
        girlA.setCupSize("Q");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(100);
        girlB.setCupSize("W");
        girlRepository.save(girlB);

    }
}
