/*
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baomidou.kisso.common.util;

import java.util.Random;
import java.util.UUID;

/**
 * <p>
 * 随机数工具类
 * </p>
 *
 * @author hubin
 * @since 2014-5-9
 */
public class RandomUtil {


    /**
     * <p>
     * 生产长度为length的随机字母数字混合字符串
     * </p>
     *
     * @param length 指定字符串长度
     * @return
     */
    public static String getCharacterAndNumber(int length) {
        StringBuffer out = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            // 输出字母还是数字
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            // 字符串
            if ("char".equalsIgnoreCase(charOrNum)) {
                // 取得大写字母还是小写字母
                int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
                out.append((char) (choice + random.nextInt(26)));
            }
            // 数字
            else if ("num".equalsIgnoreCase(charOrNum)) {
                out.append(random.nextInt(10));
            }
        }
        return out.toString();
    }


    /**
     * <p>
     * 生产长度为length的随机字母数字
     * </p>
     *
     * @param length 指定字符串长度
     * @return
     */
    public static String getNumber(int length) {
        StringBuffer out = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            out.append(random.nextInt(10));
        }
        return out.toString();
    }


    /**
     * <p>
     * 获取去掉"-" UUID
     * </p>
     */
    public static String get32UUID() {
        return getUUID().replace("-", "");
    }


    /**
     * <p>
     * 获取唯一 UUID
     * </p>
     */
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
