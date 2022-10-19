import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		
		
		System.out.println("Welcome to Java Fight");
		System.out.println("Please enter 1 or 2");
		
		
		int myHealth = 100;
		
		int opHealth = 100;
		
		boolean game = true;
		
		
		while(game) 
		{		
			
			boolean loop = true;
			
			while(loop)
			{
			
			
				try 
				{
					
					System.out.println("1 = punch");
					System.out.println("2 = Kick");
					
					
					Scanner sc = new Scanner(System.in);
					
					int num1 = sc.nextInt();
					
					if(num1 == 1) 
					{
						
						System.out.println("You Punched your opponent");
						System.out.println(" ");
						
						Random rnd1 = new Random();
						
						int punchAttk;
						
						punchAttk = rnd1.nextInt(5);
						
						switch(punchAttk) 
						{
						
							case 0:
								for(int a = 1; a<=15; a++) 
								{
								
									opHealth--;
									
								}
								break;
								
							case 1:
								for(int a = 1; a<=15; a++) 
								{
								
									opHealth--;
									
								}
								break;
								
							case 2:
								for(int a = 1; a<=15; a++) 
								{
								
									opHealth--;
									
								}
								break;
								
							case 3:
								for(int a = 1; a<=15; a++) 
								{
								
									opHealth--;
									
								}
								break;
								
							case 4:
								for(int a = 1; a<=30; a++) 
								{
								
									opHealth--;
									
								}
								System.out.println("Critical Hit");
								break;
								
							default:
								break;
						
						}
						
						
					}else if(num1 == 2)
					{
					
						System.out.println("You kicked your opponent");
						System.out.println(" ");
						
						Random rnd2 = new Random();
						
						int kickAttk;
						
						kickAttk = rnd2.nextInt(5);
						
						switch(kickAttk) 
						{
						
							case 0:
								for(int a = 1; a<=10; a++) 
								{
								
									opHealth--;
									
								}
								break;
								
							case 1:
								for(int a = 1; a<=10; a++) 
								{
								
									opHealth--;
									
								}
								break;
								
							case 2:
								for(int a = 1; a<=10; a++) 
								{
								
									opHealth--;
									
								}
								break;
								
							case 3:
								for(int a = 1; a<=10; a++) 
								{
								
									opHealth--;
									
								}
								break;
								
							case 4:
								for(int a = 1; a<=35; a++) 
								{
								
									opHealth--;
									
								}
								System.out.println("Critical Hit");
								break;
								
							default:
								break;
								
						
						}
					}
						
						
					
					
					System.out.println("Your oppnents health is " + opHealth);
					System.out.println(" ");
					
					if(opHealth <= 0)
					{
						
						for(int l = 0; l <= 100; l++) 
						{
						
							System.out.println("YOU WIN!!!");
							
							try 
							{
							
								Thread.sleep(50);
							
							}catch(InterruptedException ex) 
							{
							
								Thread.currentThread().interrupt();
								
							}
						
						}
						
						game = false;
						
						System.exit(0);
						
					}else 
					{
					
						break;
						
					}
					
				
				}
				catch(InputMismatchException e) 
				{
				
					System.err.println("Wrong Input please try again");
					
				}
				
			}	
			
			
			
			//Opponent Attacks Here
			
			Random rnd3 = new Random();
			
			int atck;
			
			atck = rnd3.nextInt(6);
			
			switch(atck) 
			{
			
				case 0:
					System.out.println("Your opponent punched you");
					System.out.println("Your opponent delt 15 damage");
					System.out.println(" ");
					for(int c = 1; c <= 15; c++)
					{
						
						myHealth--;
						
					}
					break;
					
				case 1:
					System.out.println("Your opponent punched you");
					System.out.println("Your opponent delt 15 damage");
					System.out.println(" ");
					for(int c = 1; c <= 15; c++)
					{
						
						myHealth--;
						
					}
					break;
					
				case 2:
					System.out.println("Your opponent punched you");
					System.out.println("CRITCAL HIT!!!!!");
					System.out.println("Your opponent delt 30 damage");
					System.out.println(" ");
					for(int c = 1; c <= 30; c++)
					{
						
						myHealth--;
						
					}
					break;
					
				case 3:
					System.out.println("Your opponent kicked you!");
					System.out.println("Your opponent delt 10 damage");
					System.out.println(" ");
					for(int c = 1; c <= 10; c++) 
					{
						
						myHealth--;
						
					}
					break;
					
				case 4:
					System.out.println("Your opponent kicked you!");
					System.out.println("Your opponent delt 10 damage");
					System.out.println(" ");
					for(int c = 1; c <= 10; c++) 
					{
						
						myHealth--;
						
					}
					break;
					
				case 5:
					System.out.println("Your opponent kicked you!");
					System.out.println("CRITICAL HIT!!!!!!");
					System.out.println("Your opponent delt 40 damage");
					System.out.println(" ");
					for(int c = 1; c <= 40; c++) 
					{
						
						myHealth--;
						
					}
					break;
					
				default:
					break;
			
			}
			
			System.out.println("Your health is " + myHealth);
			
			if(myHealth <= 0)
			{
				
				System.out.println("You Lose! Try again next time");
				System.out.println(" ");
				
				game = false;
				
			}else if(myHealth >= 1)
			{
				
				game = true;
				
			}
			
		
		}

	
	}

}
	
