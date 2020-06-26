package com.mooc.cominfo.controller;

import com.mooc.cominfo.dataobject.WorkersTransportData;
import com.mooc.cominfo.enums.ResultEnum;
import com.mooc.cominfo.exception.CominfoException;
import com.mooc.cominfo.service.WorkersTransportDataService;
import com.mooc.cominfo.util.ResultVOUtil;
import com.mooc.cominfo.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author admin
 * 员工数据的控制层
 * @RequestParam 适用于接收一对一简单的参数，复杂的参数最好用@RequestBody
 * @RestController 注解请求响应默认使用的序列化方式是JSON，而不是跳转到jsp或模板页面。
 */
@RestController
@RequestMapping("/emp")
@Slf4j
public class WorkersTransportDataController {
    @Autowired
    private WorkersTransportDataService service;

    /**
     * 根据真实货运单号和姓名查询自己的某条记录
     * @param billNumber
     * @param userName
     * @return
     */
    @GetMapping("/detail")
    public ResultVO<WorkersTransportData> detail(@RequestParam("billNumber") String billNumber,
                                                 @RequestParam("userName") String userName) {
        WorkersTransportData result = service.findOne(billNumber, userName);
        return ResultVOUtil.success(result);
    }

    /**
     * 通过人员姓名去查询其下的所有的货运单数据
     * @param userName
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/list")
    public ResultVO<List<WorkersTransportData>> list(@RequestParam("userName") String userName,
                                                     @RequestParam(value = "page", defaultValue = "0") Integer page,
                                                     @RequestParam(value = "size", defaultValue = "10") Integer size) {
        if (userName.isEmpty()) {
           log.error("【查询数据的人员姓名为空】userName为空");
           throw new CominfoException(ResultEnum.USERNAME_NOT_NULL);
        }
        PageRequest pageRequest=PageRequest.of(page,size);
        Page<WorkersTransportData> workersTransportDataPage=service.findAll(userName,pageRequest);
        return ResultVOUtil.success(workersTransportDataPage.getContent());
    }


}
