package org.hackmu.mathgame;


public class IntegralEnemy implements Enemy {

	private Problem[] problems;
	private String name;
	private int iconID;
	
	public IntegralEnemy(){
		problems = new Problem[4];
		problems[0] = new Problem("∫e^x = ?", "e^x", "x*(e^x)", "e^(2x)", "e^(0.5x)", 1, 10);
		problems[1] = new Problem("∫e^(5x) = ?", "e^x", "5(e^x)", "e^(10x)", "e^(2.5x)", 2, 10);
		problems[2] = new Problem("∫x = ?", "x", "e^x", "x^2", "x^0.5", 3, 10);
		problems[3] = new Problem("∫4 = ?", "e^4", "x^4", "4(ln|x|)", "4x", 4, 10);
		
		
		name = "Integral";
		
		//iconID = R.id.integralImage;
	}
	
	public Problem[] getProblems(){
		return problems;
	}
	
	public String getName(){
		return name;
	}
	
	public int getIconID(){
		return iconID;
	}

}
