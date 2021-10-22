package Practice.PatternProgram;

public class PatternMyName {
	public static void main(String[] args) {
		PatternMyName obj= new PatternMyName();
		obj.printpattern();
		
	}

	void printpattern() {
		int n=8;
		for (int row=1;row<=n;row++) {
			if(row==n) {
				for(int col=1;col<=n;col++) {
					System.out.print("* ");
				}
				
			}
			else {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}//---------------->for L
		System.out.println();
		for (int row=1;row<=n;row++) {
			if(row==1||row==n) {
				for(int col=1;col<=n;col++) {
					System.out.print("* ");
				}
				
			}
			else {
				for(int col=1;col<=n;col++) {
					if(col==1||col==n) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
					
				}
			}
			
			System.out.println();
			
		}//-----------> for O
		System.out.println();
				for(int row=1;row<=n;row++) {
					if(row<n/2) {
					for(int col=1;col<=5-row;col++) {
						if(col==1||col==5-row) {	
							System.out.print("* ");
						}
						else {
							System.out.print("   ");
						}
							
						}
					
					}
					if(row>=n/2) {
						for(int col=4;col<=row;col++) {
						if(col==4||col==row) {	
							System.out.print("* ");
						}
						else {
							System.out.print("   ");
						}
								
					}
					}
					System.out.println();
					
				}//------------->  for K
				System.out.println();
				for (int row=1;row<=n;row++) {
					if(row==1||row==n) {
						for(int col=1;col<n;col++) {
							System.out.print("* ");
						}

						
					}
					if(row==4) {
						for(int col=1;col<=n;col++) {
							System.out.print("* ");
						}

						
					}
					
					else {
						for(int col=1;col<=n;col++) {
							if(col==1) {
								System.out.print("* ");
							}
							else {
								System.out.print("  ");
							}
							
						}
					}
					
					System.out.println();
					
				}//-----------> for E
				
				System.out.println();
				
				for (int row=1;row<=n;row++) {
					if(row==1||row==n) {
						for(int col=1;col<n;col++) {
							System.out.print("* ");
						}

						
					}
					
					if(row==4) {
						for(int col=1;col<n;col++) {
							System.out.print("* ");
						}

						
					}
					if(row==5||row==6) {
						for(int col=1;col<n;col++) {
							if(col==n) {
								System.out.print("*  ");
							}
							else {
								System.out.print("  ");
							}
						}
						
					}
					if(row==7) {
						for(int col=1;col<=n;col++) {
							if(col==n) {
								System.out.print("*  ");
							}
							else {
								System.out.print("  ");
							}
						}
						
					}
					
					else {
						for(int col=1;col<=n;col++) {
							if(col==1) {
								System.out.print("* ");
							}
							else {
								System.out.print("  ");
							}
							
						}
					}
					
					System.out.println();
					
				}//-----------> for s
				
				System.out.println();
				
				for (int row=1;row<=n;row++) {
					if(row==4) {
						for(int col=1;col<=n;col++) {
							System.out.print("* ");
						}
						
					}
					else {
						for(int col=1;col<=n;col++) {
							if(col==1||col==n) {
								System.out.print("* ");
							}
							else {
								System.out.print("  ");
							}
							
						}
					}
					
					System.out.println();
					
				}//----------->for H
					
				}//method close
		
	}//class close

	/*
	 * 
* 
* 
* 
* 
* 
* 
* * * * * * * * 

* * * * * * * * 
*             * 
*             * 
*             * 
*             * 
*             * 
*             * 
* * * * * * * * 

*       * 
*    * 
* * 
* 
* * 
*    * 
*       * 
*          * 

* * * * * * * *               
*               
*               
* * * * * * * * 
*               
*               
*               
* * * * * * * *               

* * * * * * * *               
*               
*               
* * * * * * * *               
              *               
              *               
              *  
* * * * * * * *               

*             * 
*             * 
*             * 
* * * * * * * * 
*             * 
*             * 
*             * 
*             * 



*/


