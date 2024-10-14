package Chap08;

public class Telvision implements RemoteControl{
	//필드
	private int volume;
	
	//turnOn() 추상 메소드 오버라이딩
	public void turnOn() {
		System.out.println("TV를 킵니다.");
	}
	
	//turnOn() 추상 메소드 오버라이딩
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	//setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		
		if(volume > RemoteControl.MAX_VOLUME) {		
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
}
