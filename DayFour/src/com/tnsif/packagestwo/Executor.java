package com.tnsif.packagestwo;

import com.tnsif.packagesone.Base;

class Executor extends Base{
	void meth1() {
//		methodDefault();
		methodProtected();
		methodPublic();
		
//		varDefault=11;
		varProtected=22;
		varPublic=33;
		
//		methodDefault();
		methodProtected();
		methodPublic();
		
	}
	

	public static void main(String[] args) {

		Executor b= new Executor();
		
		b.meth1();
		
	}
}
