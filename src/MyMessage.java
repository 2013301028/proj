public class MyMessage {
	String message;
	public MyMessage(String message) {
		this.message = "no message";
	}
	public void print() {
		System.out.println(message);
	}
	public MyMessage(String message) {
		this.message = message;
	}
}