package com.bridgelabz.designPatterns.behaviouralPatterns;
/*
* TOdo create a strategy behavioural pattern
*  as name suggests it enables selecting alogirithm at runtime, instead of implementing a single alogorithm mutiple alogirthm implements interface which can be selected at runtime
* todo steps: 1. create a Interface and declare a method where all the implementing concrete class has to proivde the implementation
*  step2: create concrete classes that implement algorithm and step3 create a Context or some class where it'll be used to set the Strategy at runtime and maintains the strategy
* */

// define a strategy interface
interface Strategy {
    int execute(int a, int b);
}
// class that implements strategy classs
class AdditionStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

class SubstractionStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

class MultiplicationStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
//a class that used for defying strategy technique at runtime
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int exectureStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

public class StrategyPatternDemo {
    public static void main(String[] args) {
// create a Context class to define the strategies at run time
        Context context = new Context();

        //define Addition strategy and call the execution method
        context.setStrategy(new AdditionStrategy());
        System.out.println("addition=" + context.exectureStrategy(10,25));

        // define multiplication strategy

        context.setStrategy(new MultiplicationStrategy());
        System.out.println("mul:"+ context.exectureStrategy(10,10));
    }
}
