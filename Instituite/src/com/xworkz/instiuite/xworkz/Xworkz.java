package com.xworkz.instiuite.xworkz;

import com.xworkz.instiuite.trainee.Trainee;
import com.xworkz.instiuite.traineevalidate.TraineeValidate;

public class Xworkz {
    Trainee trainee;

    public boolean addTrainee(Trainee trainee){
          boolean isTraineeAdded =false;


     TraineeValidate traineeValidate = new TraineeValidate();
             boolean      isTraineeInfoValid = traineeValidate.validateTraineeInfo(trainee);



          if(isTraineeInfoValid){
              this.trainee=trainee;
              isTraineeAdded=true;

          }
          return  isTraineeAdded;
      }
     public void getTrineeInfo(){
          System.out.println("The trainee name is :"+trainee.getTraineeName());
          System.out.println("The trainee Domain is :"+trainee.getDomain());
          System.out.println("The training hours is :"+trainee.getTrainingHours());
          System.out.println("The training fee is :"+trainee.getTrainingFee());
      }

}
