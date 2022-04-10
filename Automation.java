package selenium;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation automate = new Automation();
		automate.selenium();
		automate.python();
		automate.ruby();
		automate.java();

	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium Automation");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java Language");
		
	}

	
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
		
	}

}


