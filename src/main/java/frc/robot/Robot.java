// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;


public class Robot extends TimedRobot {
  Joystick m_joystick = new Joystick(0);
  Timer m_timer = new Timer();
  

  public Robot() {
  }

  @Override
  public void robotInit() {
    Shuffleboard.getTab("FlipaDaTable").addString("Flip", FlipaDaTable::flip);
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    m_timer.start();
  }

  @Override
  public void teleopPeriodic() {
    if(m_joystick.getRawButton(1)  && m_timer.get() > 0.2){
      FlipaDaTable.getInstance().nextState();
      m_timer.reset();
    }    
  }

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
