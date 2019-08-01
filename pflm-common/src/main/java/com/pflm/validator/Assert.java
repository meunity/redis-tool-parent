package com.pflm.validator;

import com.pflm.exception.MyException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-03-23 15:50
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new MyException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new MyException(message);
        }
    }
}