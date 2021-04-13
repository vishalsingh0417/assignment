package com.assigment.automobile.demo;

public class Vehicle {

	public static void main(String[] args) {
		
		//Object Creation
		Automobile auto=new Automobile();
		
		Toto tt= new Toto();
		
		TwoWheeler tw=new TwoWheeler();
		
		Cycle cyc =new Cycle();
		
		Motorcycle mcyc =new Motorcycle();
			
		System.out.println("------------------------Without Upcasting-------------------------\n");
		
		
			System.out.println("\n*********AutoMobile**********\n");
			auto.run();
			auto.Break();
			auto.change_direction();
			System.out.println("Number of Wheels in Automobile: "
			+auto.no_wheels +" ;   "+" Number of Mirrors in Automobile: "+auto.no_mirror+" ;   "+"Number of Gear in Automobile: "+auto.gear);
			
		
		
		
		System.out.println("\n*********Toto**********\n");		
			tt.run();
			tt.Break();
			tt.change_direction();
			System.out.println("Number of Wheels in Toto: "
			+tt.no_wheels +" ;   "+" Number of Mirrors in Toto: "+tt.no_mirror+" ;   "+"Number of Gear in Toto: "+tt.gear);
		
			
		
		
			
			System.out.println("\n*********Two Wheeler**********\n");
			tw.run();
			tw.Break();
			tw.change_direction();
			System.out.println("Number of Wheels in TwoWheeler: "
					+tw.no_wheels +" ;   "+" Number of Mirrors in TwoWheeler: "+tw.no_mirror+" ;   "+"Number of Gear in TwoWheeler: "+tw.gear);
			
		
				
		
		

			
			System.out.println("\n*********Cycle**********\n");
			cyc.run();
			cyc.Break();
			cyc.change_direction();
			System.out.println("Number of Wheels in Cycle: "
					+cyc.no_wheels +" ;   "+" Number of Mirrors in Cycle: "+cyc.no_mirror+" ;   "+"Number of Gear in Cycle:   "+cyc.gear);
					
		
		
		
		
					
			System.out.println("\n*********MotorCycle**********\n");
			
		mcyc.run();
			mcyc.Break();
			mcyc.change_direction();
			System.out.println("Number of Wheels in MotorCycle: "
					+mcyc.no_wheels +" ;   "+" Number of Mirrors in MotorCycle: "+mcyc.no_mirror+" ;   "+"Number of Gear in MotorCycle: "+mcyc.gear);
		
			
			
			//Upcasting Code Start..................................
					
	
	System.out.println("\n====================Using Upcasting====================\n");
		

	System.out.println("\n*********Upcasted Toto**********\n");
Automobile tau;
Toto toto=new Toto();
tau=toto;

tau.run();
tau.Break();
tau.change_direction();

System.out.println("Number of Wheels in Toto: "
		+tau.no_wheels +" ;   "+" Number of Mirrors in Toto: "+tau.no_mirror+" ;   "+"Number of Gear in Toto: "+tau.gear);
		
		
		
System.out.println("\n*********Upcasted Two Wheeler**********\n");
	Automobile twau=new TwoWheeler();
		
	twau.run();
	twau.Break();
	twau.change_direction();
	System.out.println("Number of Wheels in TwoWheeler: "
			+twau.no_wheels +" ;   "+" Number of Mirrors in TwoWheeler: "+twau.no_mirror+" ;   "+"Number of Gear in TwoWheeler: "+twau.gear);
	

	System.out.println("\n*********Upcasted Cycle**********\n");
	
	TwoWheeler ctw=new Cycle();
	ctw.run();
	ctw.Break();
	ctw.change_direction();
	System.out.println("Number of Wheels in Cycle: "
			+ctw.no_wheels +" ;   "+" Number of Mirrors in Cycle: "+ctw.no_mirror+" ;   "+"Number of Gear in Cycle:   "+ctw.gear);
		
		
System.out.println("\n*********Upcasted Motorcycle**********\n");
	
	TwoWheeler upmt=new Motorcycle();
	upmt.run();
	upmt.Break();
	upmt.change_direction();
	System.out.println("Number of Wheels in TwoWheeler: "
			+upmt.no_wheels +" ;   "+" Number of Mirrors in TwoWheeler: "+upmt.no_mirror+" ;   "+"Number of Gear in TwoWheeler: "+upmt.gear);
	
		

	}

}
