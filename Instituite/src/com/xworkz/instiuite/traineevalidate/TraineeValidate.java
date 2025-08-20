package com.xworkz.instiuite.traineevalidate;

import com.xworkz.instiuite.trainee.Trainee;

public class TraineeValidate {
     public   boolean validateTraineeInfo(Trainee trainee){
         boolean traineeValidated=false;
         boolean traineeNameValid=false;
         boolean traineeDomainValid=false;
         boolean traineeTrainingHours=false;
         boolean traineeTariningFee=false;


         if(trainee.getTraineeName() != null &&  !trainee.getTraineeName().isEmpty()){
             traineeNameValid =true;
         }else System.out.println("The trainee name is Invalid");

         if(trainee.getDomain() != null && !trainee.getDomain().isEmpty()){
             traineeDomainValid=true;
         }else System.out.println("The Domain Name is Unmatching");

         if(trainee.getTrainingHours() != null && !trainee.getTrainingHours().isEmpty()){
             traineeTrainingHours=true;
         }else System.out.println("the training hours is not matched");

         if(trainee.getTrainingFee() > 0){
             traineeTariningFee=true;
         }
         if(traineeNameValid && traineeDomainValid && traineeTrainingHours && traineeTariningFee){
             traineeValidated=true;
         }

         return traineeValidated;
       }
}
