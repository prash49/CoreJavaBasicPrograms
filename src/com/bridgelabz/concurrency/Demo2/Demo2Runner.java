package com.bridgelabz.concurrency.Demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo2Runner {
    public static void main(String[] args) {
        EmployeeService employeeService = null;
        EmployeeRepo[] employeeRepos = {new EmployeeRepoImpl()};
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < employeeRepos.length; i++) {
            employeeService = new EmployeeService(employeeRepos[i]);
            executorService.execute(employeeService);
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(Integer.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
