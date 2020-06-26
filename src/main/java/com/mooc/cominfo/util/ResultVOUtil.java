package com.mooc.cominfo.util;

import com.mooc.cominfo.vo.ResultVO;

/**
 * @author admin
 * 封装返回结果的最外层对象
 */
public class ResultVOUtil {

    /**
     * 返回成功的结果
     * @param object
     * @return
     */
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return  resultVO;
    }

    /**
     * 返回失败的结果
     * @param code
     * @param msg
     * @return
     */
    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return  resultVO;
    }

    /**
     * 返回不传参数的结果
     * @return
     */
    public static ResultVO success(){
        return success(null);
    }
}
