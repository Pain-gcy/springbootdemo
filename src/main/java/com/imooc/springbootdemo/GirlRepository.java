package com.imooc.springbootdemo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author E470
 * @create 2018 - 05 - 14 8:45
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    /**
     * extend 扩展接口
     * 根据年龄来查询
     * @param age
     * @return
     */
    public List<Girl> findByAge(Integer age);

}
