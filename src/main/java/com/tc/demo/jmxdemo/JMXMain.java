package com.tc.demo.jmxdemo;

import javax.management.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;

/**
 * @author taosh
 * @create 2020-01-19 13:54
 */
public class JMXMain {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, IOException {
        MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();

        ObjectName on = new ObjectName("com.tc.demo.jmxdemo.Mechine:type=mechine");

        MechineMBean mb = new Mechine();
        beanServer.registerMBean(mb, on);

        System.in.read();
    }
}
