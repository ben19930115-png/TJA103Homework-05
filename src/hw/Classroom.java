package hw;

public class Classroom extends Thread {
	private int no;
	private String teacherName;
	
	public Classroom(int no, String teacherName) {
		this.no = no;
		this.teacherName = teacherName;
	}
	
	public void run() {
		System.out.println(no + "教室, " + teacherName + "上課囉");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(no + "教室, " + teacherName + "下課了...");
	}

}
