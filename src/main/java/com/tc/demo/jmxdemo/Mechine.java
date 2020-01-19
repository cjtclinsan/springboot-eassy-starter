package com.tc.demo.jmxdemo;

/**
 * @author taosh
 * @create 2020-01-19 13:52
 */
public class Mechine implements MechineMBean {
    @Override
    public int getCpuCore() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public long getFreeMemory() {


        return Runtime.getRuntime().freeMemory();
    }

    @Override
    public void shutdown() {
        System.exit(0);
    }
}
