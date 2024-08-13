package controller;

public class Ex04 {
	
	public Ex04() {
		super();
	}
	
	public int FatorialDuplo (int a, int  cta, int num) {
		if (cta > a) { 
			return num;
		}else {
			if ( cta % 2 !=0) {
				num = num * cta;
			}
		}
		return FatorialDuplo	(a, cta + 1, num);
		
	}

}