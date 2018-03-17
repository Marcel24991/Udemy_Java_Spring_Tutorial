package de.marcel.springdemo;

public class TrackCoach implements Coach{

	HappyFortuneService fortuneService;
	
	public TrackCoach(HappyFortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach(){
	
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it: " + fortuneService.getFortune();
	}	
}
