
class YoutubeChannel{
	
	String name;
	Notification notification;
	
	YoutubeChannel(){
		name = "auribises";
	}
	
	void uploadVideo(String videoName) {
		System.out.println("Video Uploaded Successfully !!");
		notification.notifyUser("Video Uploaded: "+videoName);
	}
	
	void sucbsribe(Notification notification) {
		this.notification = notification;
	}
}

abstract class Notification{
	abstract void notifyUser(String message);
}

//here we get parent, child relation
// Polymorphic Statement can be implemented i.e. Ref Var of Notification can refere to the User Object
class User extends Notification{ 
	
	String name;
	String email;
	
	User(){
		name = "john";
		email = "john@gmail.com";
	}
	
	void notifyUser(String message) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Dear, "+name);
		System.out.println("A New Notification Received");
		System.out.println("Message: "+message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}

public class AbstractClassAgain {

	public static void main(String[] args) {
		
		User uRef = new User();
		
		YoutubeChannel channel = new YoutubeChannel();
		channel.sucbsribe(uRef); // Polymorphic Statment

		channel.uploadVideo("Learning Java With Ishant");
	}

}
