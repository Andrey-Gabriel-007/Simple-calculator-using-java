package com.dio;
import java.util.Scanner;
public class TestJava {
	public static void main( String[] args){
		float x;
		float y;
		float result;
		String sair;
		String operator;
		Scanner sc;
		
		System.out.println(MensageDay.dia_tarde_noite());
		
		sc = new Scanner(System.in);
		
		do {
				System.out.println("Insira um valor: ");
				x = sc.nextFloat();
		
				System.out.println("Insira a operacao (+),(-),(/),(*): ");
				operator = sc.next();
				
		
				System.out.println("Insira um outro valor: ");
				y = sc.nextFloat();
				
				switch(operator){
					case "+":
						result = Calculadora.somar(x, y);
						break;
					case "-":
						result = Calculadora.subtrair(x, y);
						break;
					case "*":
						result = Calculadora.multiplicar(x, y);
						break;
					case "/":
						result = Calculadora.dividir(x,y);
						break;
					default:
						result =0;
				}
				System.out.println("Resultado: "+ result);
				
				System.out.println("Digite S para sair: ");
				 sair = sc.next();
				if( sair.equals("s") ){
					System.out.println("Programa encerrado!");
				}	
		}while(  !sair.equals("s") );
		sc.close();

	}


}
