package com.tsien.mall.controller.portal;

import com.tsien.mall.common.Const;
import com.tsien.mall.common.ResponseCode;
import com.tsien.mall.common.ServerResponse;
import com.tsien.mall.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/5/1 0001 9:37
 */

@RestController
@RequestMapping("/order/")
public class OrderController {

    public ServerResponse pay(HttpSession session, HttpServletRequest request, Long orderNo) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), ResponseCode.NEED_LOGIN.getDesc());
        }
        String path = request.getSession().getServletContext().getRealPath("upload");
        return null;
    }


}
