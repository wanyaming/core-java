package com.wan.jvm;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author wanyaming
 * @since 2020年2月13日 下午10:14:12
 */
public class CommandTest {
    public static void main(String[] args) {
        while (true) {
            byte[] a = new byte[1024];
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
