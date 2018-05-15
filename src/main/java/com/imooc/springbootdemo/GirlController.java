package com.imooc.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author E470
 * @create 2018 - 05 - 14 8:41
 */
@RestController
public class GirlController {


    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     * 查询女生列表所有
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl>  getGirlList(){
        return girlRepository.findAll();
    }

    /**
     * 添加一条记录
     * @param age
     * @param cupSize
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl addGirl(@RequestParam("age") Integer age,@RequestParam("cupSize") String cupSize){
        Girl girl =new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    /**
     * 查询一条数据
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl getOneGirl(@PathVariable("id") Integer id){
        return girlRepository.getOne(id);
    }

    /**
     * 更新一条数据
     * @param id
     * @param age
     * @param cupSize
     * @return
     */
    @PutMapping(value = "/girls/{id}")
    public Girl updateGirl(@PathVariable("id") Integer id,
                          @RequestParam("age") Integer age,
                          @RequestParam("cupSize") String cupSize){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        girl.setId(id);
        return girlRepository.saveAndFlush(girl);
    }

    /**
     * 删除
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public void deleteOneGirl(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
    }

    /**
     * 扩展接口查询
     * @param age
     * @return
     */
    @GetMapping(value = "/girlss/{age}")
    public List<Girl> getOneByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/insert")
    public void insertTwo(){
        girlService.insertTwo();
    }
}
