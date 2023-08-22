package ConstructorAndOverloading;

public class ConstructorOutput {
	
public static void main(String[] args) {
		
	Constructor ref = new Constructor();
	Constructor ref1 = new Constructor("pooja",100);
	//System.out.println(ref1.name+ref1.n);we call constructor like this
	Constructor ref2 = new Constructor("Rahul");
//	System.out.println(ref.name+" , "+ref.n);
	
	ref1.allVariable();//we call like this to save multiple line 
	ref2.oneVariable();
	
	
	
	
	

}
}