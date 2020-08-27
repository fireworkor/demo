package com.example.demo.model.Bo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author : fireworkor 3159553637@qq.com
 * @Date : 2020/08/27  21:33  星期四
 * @Description:
 */
@Entity
public class WXBo {
    //微信数量
    @Id
    public Integer id;
    public Integer wxcount;
    public          WXBo() {
    }
    public          WXBo(Integer wxcount) {
        this.wxcount = wxcount;
    }

    public Integer getWxcount() {
        return wxcount;
    }

    public void setWxcount(Integer wxcount) {
        this.wxcount = wxcount;
    }
}
