package com.bridgelabz.designPatterns.factory;

public class FactoryPatternExample {

    /*TODO implement a example for Factory Pattern*/

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("Console");
        logger.log("This is Console logger");

        logger = LoggerFactory.getLogger("Database");
        logger.log("Db logger");

    }
}
