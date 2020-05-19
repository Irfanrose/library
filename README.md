# library
Free to USE

# Add it in your root build.gradle at the end of repositories:

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        implementation 'com.github.Irfanrose:library:1.0'
	}
  
  This library helps to do basic arithmetic calculations and time related calculations
  
 # For arithmetic operation call methods like below and it supports almost all data types
  Calc.add(param1,param2)
  Calc.sub(param1,param2)
  Calc.multiply(param1,param2)
  Calc.divide(param1,param2)
  
 # For time related calculations call methods like below
  
  TimeCalc.msToMin(//millisdseconds)   //Milliseconds to Minutes
  TimeCalc.msToSec(//millisdseconds)   //Milliseconds to Seconds
  
  TimeCalc.minToSec(//minutes)   //Minutes to Seconds
  TimeCalc.minToMs(//minutes)   //Minutes to MilliSeconds
  TimeCalc.minToHr(//minutes)   //Minutes to Hour
  
  TimeCalc.hrToMs(//hours)   //Hour to Milliseconds
  TimeCalc.hrToMin(//hours)   //Hour to Minutes
  TimeCalc.hrToSec(//hours)   //Hour to Seconds
  
  
