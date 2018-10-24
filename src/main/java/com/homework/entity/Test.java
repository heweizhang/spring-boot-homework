package com.homework.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lv-success
 * @since 2018-09-14
 */
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;


    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Test{" +
        "}";
    }
}
