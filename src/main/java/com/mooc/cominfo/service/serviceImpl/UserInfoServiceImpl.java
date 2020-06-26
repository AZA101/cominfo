package com.mooc.cominfo.service.serviceImpl;

import com.mooc.cominfo.dataobject.UserInfo;
import com.mooc.cominfo.repository.UserInfoRepository;
import com.mooc.cominfo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo check(String phoneNumber, String passwords) {
        UserInfo userInfo = userInfoRepository.findByPhoneNumberAndPasswords(phoneNumber, passwords);
        if (userInfo != null) {
            System.out.println(userInfo);
        }
        return null;
    }

    @Override
    public UserInfo update(String phoneNumber, String passwords) {
        UserInfo userInfo=userInfoRepository.findByPhoneNumber(phoneNumber);
        if(userInfo!=null){
            userInfo.setPasswords(passwords);
            UserInfo result=userInfoRepository.save(userInfo);
            if(result!=null){
                //TODO 这里返回给控制层修改成功的信息
                System.out.println("密码修改成功，请重新登陆");
            }else{
                //TODO 需要弹出报错信息
            }
        }else {
            System.out.println("数据记录不存在");
        }
        return null;
    }
}
