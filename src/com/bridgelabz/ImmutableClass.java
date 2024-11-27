package com.bridgelabz;

public final class ImmutableClass {
    // how to make a Class immutable
    /*TODO step1 make class as final step2 make all the fileds private step3 no setters step4 create a Constructor with all the parameters to create instance of class
    *  step 5 dont return a deep copy step6 if we have mutable fiels or objects make them as final so that they can be assigned only once
    * */
   private String name;
   private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ImmutableClass(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
