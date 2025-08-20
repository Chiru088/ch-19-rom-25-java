package com.xworkz.instiuite.xworkz;

import com.xworkz.instiuite.trainee.Trainee;

public class XworkzRunner {
    public static void main(String[] args) {

                   Trainee trainee  = new Trainee();
                   trainee.setTraineeName("Dev Singh");
                   trainee.setDomain("Java Full stack");
                   trainee.setTrainingHours("8 am to 12 pm");
                   trainee.setTrainingFee(1500);


                         Xworkz xworkz = new Xworkz();
                      boolean traineeAdded = xworkz.addTrainee(trainee);
        System.out.println("traineeAdded");

        if(traineeAdded){
            xworkz.getTrineeInfo();
        }
    }
}
