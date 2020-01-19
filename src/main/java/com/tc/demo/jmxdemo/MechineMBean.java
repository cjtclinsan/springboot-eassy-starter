package com.tc.demo.jmxdemo;

/**
 * 把需要发布出去的指标信息，通过MB来发布
 * @author taosh
 * @create 2020-01-19 13:47
 */
public interface MechineMBean {
    int getCpuCore();

    long getFreeMemory();

    void shutdown();
}
