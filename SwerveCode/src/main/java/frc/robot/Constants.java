// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
	public static class Drivetrain {
		public static final double L = 0; //placeholder for now - Length between each wheel axle
		public static final double W = 0; //placeholder for now - Width between each wheel axle

		public static final double[] fL = {0, 0};
		public static final double[] fR = {0, 0};
		public static final double[] bL = {0, 0};
		public static final double[] bR = {0, 0};
	}
}