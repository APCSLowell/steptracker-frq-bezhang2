import java.util.ArrayList;
public class StepTracker
{
 private int totalSteps;
 private int minSteps;
 private int totalDays;
 private int activeDays;
 public StepTracker(int goal){
  totalSteps = 0;
  minSteps = goal;
  totalDays = 0;
  activeDays = 0;
 }
 public void addDailySteps(int steps){
  totalSteps = totalSteps + steps;
  totalDays++;
  if(steps >= minSteps){
   activeDays++;
  }
 }
 public int activeDays(){
  return activeDays;
 }
 public double averageSteps(){
  if(totalDays == 0){
   return 0.0;
  }
  else{
   return (double)totalSteps/totalDays;
  }
 }
} 
