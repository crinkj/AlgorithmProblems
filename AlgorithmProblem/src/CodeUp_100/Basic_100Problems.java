package CodeUp_100;

import java.util.LinkedHashSet;
import java.util.Set;

public class Basic_100Problems{
	
	public static void main(String args[]) {

// 기초 알고리즘 100문제(Code Up 100)
		
// * Problem 1013 
//		Problem: 2개의 정수가 공백으로 구분되어 입력된다.
		
//		    Scanner num = new Scanner(System.in);
//		    int num1 = num.nextInt();
//		    int num2 = num.nextInt();
//		        
//		       System.out.println(num1 + " " + num2);
//	    	   input: 1 2  output: 1 2
		
// * Problem 1014
//		Problem: 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
		
//			Scanner stg = new Scanner(System.in);		
//			String fst = stg.next();
//			String snd = stg.next();
//			
//			System.out.println(snd + " " + fst);
 //         input: A b  output: b A

// * Problem 1017
// 		Problem: int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
		
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			
//				for(int i=0; i<3; i++) {
//					System.out.print(num + " ");
//				}
//           input: 125 output: 125 125 125
		
//	* Problem 1018
//		Problem: 어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
//		
//			Scanner sc = new Scanner(System.in);
//			
//			String tm = sc.nextLine();
//			System.out.println(tm);
//		input: 3:15 output: 3:15
		
//	* Problem 1023
//		Problem: 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.   
//     * 나눌때는 꼭 특수기호앞에 \\ 붙힐것. 
			
//		Scanner sc = new Scanner(System.in);
//        
//        String array1[] = sc.next().split("\\.");
//        
//        for (int i=0; i< array1.length; i++) {
//        	System.out.println(array1[i]);
//  
//       }
//		 input: 123.45   output: 123  45
		
//	* Problem 1038
//		Problem: 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
//		(단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
//		* 자릿수가 많은 Integer는 java.math.BigInteger 에 있는 변수 BigInteger를 써야된다.
//		
//		  Scanner sc = new Scanner(System.in);
//	        
//	        BigInteger num1 = sc.nextBigInteger();
//	        BigInteger num2 = sc.nextBigInteger();
//	        
//	        
//	        System.out.println(num1.add(num2));
//			input: 100000000 + 100000000  output: 200000000	
      
//	* Problem 1025
//		Problem: 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
//		 Scanner sc = new Scanner(System.in);
//	        
//	        String num1 = sc.nextLine();
//	        
//	        char[] ch = num1.toCharArray();  // 문자열을 캐릭터 어레이에 넣는 과정  
//	        
//	        for(int i=0; i<ch.length; i++){
//	        	System.out.print("[" + ch[i]);
//	            for (int j= ch.length-1; j>i; j--){     // 만약 2000이 인풋일때 i=0일때 j=3 3>0  j는 3, 2 , 1 로 줄어든다 
//	               System.out.print("0");
//	            }
//	            System.out.println("]");
//	        }
//	        
//	        input: 75234 output: 70000 5000 200 30 4
		
//	* Problem 1024
//		Problem: 단어를 1개 입력받는다. 입력받은 단어(영어)의 각 문자를 한줄에 한 문자씩 분리해 출력한다.
//		
//        Scanner sc = new Scanner(System.in);
//        
//        String word = sc.nextLine();
//        
//        char[] ch = word.toCharArray();
//        
//        for(int i=0; i< ch.length; i++){
//            System.out.println("'" +ch[i]+ "'");
//        }
//		
//        input: hmart output: 'h' 'm' 'a' 'r' 't'
		
//	* Problem 1040
//		Problem: 입력된 정수의 부호를 바꿔 출력해보자.
//		
//			   Scanner sc = new Scanner(System.in);
//    
//			    int num = sc.nextInt();
//			    
//			    System.out.println( -1*num);
		
//		  input: -1  output: 1
	
//	* Problem 1045
//		Problem: 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
//    Scanner sc = new Scanner(System.in);
//        
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//     
//        
//        System.out.println(num1 + num2); // 합 
//        System.out.println(num1 - num2); // 차
//        System.out.println(num1 * num2); // 곱
//        System.out.println(num1/num2); // 몫 
//        System.out.println(num1%num2); // 나머지 
//        double num3 = (double)num2;  // double 실수형으로 바꿔줘야함 소수점이나오기위해선 
//        System.out.printf("%.2f\n",num1/num3);   // printf() reads % to function. .2f -> 2 decimal places. 
//        										// when you use %d or %s, you have to use it in printf();
//        
//        input: 10 3 output: 13 7 30 3 1 3.33
	
//	* Problem 1052
//		Problem: 두 정수(a, b)를 입력받아 a와 b가 서로 다르면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
//		
//		 Scanner sc = new Scanner(System.in);
//    
//		    int num1 = sc.nextInt();
//		    int num2 = sc.nextInt();
//		    
//		    if(num1 == num2){
//		        System.out.println(0);
//		    }else{
//		        System.out.println(1);
//		    }
//			
//        input: 1 1 output: 0
		
//	* Problem 1053
//		Problem: 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 반대로 출력하는 프로그램을 작성해보자.
//		
//		  Scanner sc = new Scanner(System.in);
//	        
//	        int num1 = sc.nextInt();
//	        
//	        if(num1 == 0){
//	            System.out.println(1);
//	        }else{
//	            System.out.println(0);
//	        }
//		
//	       input: 0  output: 1
		
//	* Problem 1066
//		Problem:세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
//		
//		 Scanner sc = new Scanner(System.in);
//    
//		    int num1 = sc.nextInt();
//		    int num2 = sc.nextInt();
//		    int num3 = sc.nextInt();
//		    
//		    if(num1 % 2 == 1){
//		        System.out.println("odd");
//		    }else{
//		        System.out.println("even");
//		    }
//		    if(num2 % 2 == 1){
//		        System.out.println("odd");
//		    }else{
//		        System.out.println("even");
//		    }
//		     if(num3 % 2 == 1){
//		        System.out.println("odd");
//		    }else{
//		        System.out.println("even");
//		    }
//		
//		     input: 1 2 5  output: odd even odd 

//		* Problem 1070
//		Problem:월이 입력될 때 계절 이름이 출력되도록 해보자.
		
//		 Scanner sc = new Scanner(System.in);
//	        int num1 = sc.nextInt();
//	        
//	        switch(num1){
//	        	case 12:
//	            case 1:
//	            case 2:
//	                System.out.println("winter");
//	                break;
//	            case 3:
//	            case 4:
//	            case 5:
//	                System.out.println("spring");
//	                break;
//	            case 6:
//	            case 7:
//	            case 8:
//	                System.out.println("summer");   
//	                break;
//	            case 9:
//	            case 10:
//	            case 11:
//	                System.out.println("fall");   /// 9, 10 , 11 은 어차피 fall이므로 11에 응답만해주면 출력되고 break으로 끊긴다.
//	                break;
//	        } 

//  		input: 4 	output:spring

// ************************* Goto Statement: a statement performs a one - way transfer of control to anothe rline of code( it supports some languagues, not all).
		
//		* Problem 1071
//		Problem:0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.  ( there is no goto statement in java, so used while loop)
		
//		Scanner sc = new Scanner(System.in);
		
//        while(true){						// break가 작동전까지 계속 돌아감
//            int num1 = sc.nextInt();
//            
//            if(num1 == 0){
//                break;        			// 0일때 반복문 작동안하게
//            }else{
//                System.out.println(num1);
//            }
//        }

//  input and output: it asks you a number until you type 0;

//	* Problem 1074
//	   Problem: 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
		
//		 Scanner sc = new Scanner(System.in);
//	        
//	        int num = sc.nextInt();
//	        
//	        for(int i = num; i > 0; i--){
//	            System.out.println(i);
//	        }
//	       
//	        input: 5 output: 5 4 3 2 1 

//	* Problem 1076
//		* Problem: 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
//		Scanner sc = new Scanner(System.in);
//        
//		char input = sc.next().charAt(0);
//		
//		char start = 'a';
//		
//		do {
//			System.out.print(start + " ");
//			start+=1;									// 알파벳 증
//			
//		} while(start <= input);

//		input: d 	output: a b c d

//	* Problem 1078
//		* Problem: 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
//		
//		Scanner sc = new Scanner(System.in);
//    
//		    int num = sc.nextInt();
//		    int total = 0;
//		    
//		    for(int i=0; i<= num; i++){		        
//		        if(i % 2 == 0){
//		            total += i;
//		        }
//		    }
//  
//		    System.out.println(total);

//			input: 8  output: 20
	        
//	* Problem 1079
//		* Problem: 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
//			Scanner sc = new Scanner(System.in);
//			
//			while(true) {
//				char word = sc.next().charAt(0);
//				
//				if(word == 'q') {
//					System.out.println(word);
//					break;
//				}
//				System.out.println(word);
//			}

//		when input is 'q', the function will be stopped after it prints out 'q'
		
//	* Problem 1081
//		* Problem: 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
//		
//			Scanner sc = new Scanner(System.in);
//	        
//	        int n = sc.nextInt();
//	        int m = sc.nextInt();
//	        
//	        for(int i=1; i <= n; i++){
//	            for(int j=1; j <= m; j++){
//	                System.out.println(i+" " + j);			// for loop(j) runs every for loop(i);
//	            }
//	        }

// 			input: 2 3   output: 1 1, 1 2, 1 3, 2 1, 2 2, 2 3
        
//	* Problem 1083
//		* Problem: 3 6 9 게임을 하던 영일이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
//		3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
//	
//		 Scanner sc = new Scanner(System.in);
//    
//		    int num = sc.nextInt();
//		    
//		    for (int i=1; i<= num; i++){
//		        if(i%10 == 3 || i%10 == 6 || i%10 == 9){
//		            System.out.println("X");
//		        }else {
//		            System.out.println(i);
//		        }
//		    }
//		    
//		    input: 6   output: 1 2 X 4 5 X
	
//	* Problem 1084
//		* Problem: 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
//		줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
//
//		 Scanner sc = new Scanner(System.in);
//	        
//	        int red = sc.nextInt();
//	        int green = sc.nextInt();
//	        int blue = sc.nextInt();
//	        
//	        int total = 0;
//	        
//	        if( red >= 0 && green >= 0 && blue >= 0) {
//	        for(int i= 0; i < red; i++){
//	            for(int j=0; j<green; j++){
//	                for(int k=0; k<blue; k++){
//	           
//	                    System.out.println(i + " " + j + " " + k);
//	                    total++;
//	                }
//	            }
//	        }
//	        System.out.println(total);
//	        }				// it prints out as the answer, but it exceeds time.
		
		
							//		Scanner sc = new Scanner(System.in);
							//		int red = sc.nextInt();
							//		int green = sc.nextInt();
							//		int blue = sc.nextInt();
							//		
							//		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));   
										// BufferedWriter:Java BufferedWriter class is used to provide buffering for Writer instances. It makes the performance fast.
							
							//			for(int i=0; i<red; i++) {
							//				for(int j=0; j<green; j++) {
							//					String str="";
							//					for(int k=0; k<blue;k++) {
							//						str += i+" "+j+" "+k+"\n";						
							//					}
							//					bf.write(str);
							//					bf.flush();
							//				}
							//			}
							//			System.out.println(red*green*blue);
							//		}					// answer and it executes on time;   

		
//		    
//		    input: 2 2 2 output:    0 0 0
//								    0 0 1
//								    0 1 0
//								    0 1 1
//								    1 0 0
//								    1 0 1
//								    1 1 0
//								    1 1 1
//								    8
		
//	* Problem 1085
//		* Problem:h, b, c, s 가 공백을 두고 입력된다. h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.

//        Scanner sc = new Scanner(System.in);
//        
//        int h= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        int s= sc.nextInt();
//        
//        if(h <= 48000 && b <= 32 & b % 8 == 0 && c <= 5 && s <= 6000 ){
//            double total = h * b * c * s ;
//            double result = ((total/8)/1024)/1024;
//            
//            System.out.printf("%.1f MB", result);   // printf() reads % to function. .2f -> 2 decimal places. 
//         									   // when you use %d or %s, you have to use it in printf();
//		    }

//		  Scanner sc = new Scanner(System.in);
//	        
//	        int w = sc.nextInt();
//	        int h = sc.nextInt();
//	        int b = sc.nextInt();
//	        
//	        if ( w >= 1 && w <= 1024 && h >=1 && h <= 1024 && b <= 40 && b % 4 == 0){
//	            double total = (w * h * b)/8;
//	            double result = (total/1024)/1024;
//	            
//	            System.out.printf("%.2f MB", result); // %.2f =  2자리 소수
//	            
//	        }
//	        
//	        input: 1024 768 24 output: 2.25 MB

// * Problem 1087 
//		* problem : 언제까지 합을 계산할 지, 정수 1개를 입력받는다. 단, 입력되는 자연수는 100,000,000이하이다.
//		
//		내풀이: 
//		  Scanner sc = new Scanner(System.in);
//	        
//	        int total = 0;
//	        int num = 0;
//	        while(true){
//	            
//	             num = sc.nextInt();
//	            
//	            for(int i= 0; i<=num; i++){
//	                if( num >= total){
//	                    total += i;
//	                    
//	                }else{
//	                    System.out.println(total);
//	                    break;
//	                }
//	            }
//	        }
		
//		정답:
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			int sum = 0;
//			if(num <= 100000000){
//				int x = 1;
//				while(true){
//					if(sum >= num){
//						break;
//					}else{
//						sum += x;
//						x++;	
//					}
//				}
//			}
//			System.out.println(sum);
//	     
//	        input: 57      output: 66  
		
//	* Problem 1088
//		Problem: 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되 3의 배수는 출력하지 않는다.
//		 Scanner sc = new Scanner(System.in);
//	        
//	        int num = sc.nextInt();
//	        if(num <= 100) {
//	        for(int i=1; i< num; i++){
//	            if( i % 3 == 0){
//	                continue;
//	            }else{
//	                 System.out.println(i);
//	            }
//	        }
//	        } 
//	        
//	        input:10 output: 1 2 4 5 7 8 10
		
//	* Problem 1089:
//		* Problem: 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 100)
//
//
//		Scanner sc  = new Scanner(System.in);
//        
//	        int total = sc.nextInt();
//	        int num2 = sc.nextInt();
//	        int num3 = sc.nextInt();
//        
//        if(total <= 100 && num2 <= 100 && num3 <= 100){
//                 for(int i=1; i<num3; i++){
//                    total += num2;
//                 }
//        }
//        System.out.println(total);
//		
//		input: 1 3 5   output: 13
        
//	* Problem 1090
//		* Problem: 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 10)
        		  
//        Scanner sc = new Scanner(System.in);
//        
//        long total = sc.nextInt();		// * variable should be determined as long because it exceeds int limitation when input values are 10 10 10; 
//        long num1 = sc.nextInt();
//        long num2 = sc.nextInt();
//        
//        if (total <= 10 && num1 <= 10 && num2 <= 10){
//          for(int i=1; i<num2; i++){
//              
//              total *= num1;
//             
//          }
//            
//        }
//        System.out.println(total);
//		
//        input: 10 10 10 output:10000000000
       
//	* Problem 1091
//		* Problem: 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)
	
//		Scanner sc = new Scanner(System.in);
//		
//		long a = sc.nextInt();
//		long m = sc.nextInt();
//		long d = sc.nextInt();
//		long n = sc.nextInt();
//		
//		if( a >= -50 && a <= 50 && m >= -50 && m <= 50 && d >= -50 && d <= 50 && n <=10) {
//			
//			for(int i=1; i <n; i++) {
//				
//				a *= m;
//				a +=d;
//				
//			}
//		}
//		System.out.println(a);
		
//		input: 1 -2 1 8  output: -85
		
//	* Problem 1092
//		* Problem: 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는, 방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.);
//			
//		  Scanner sc = new Scanner(System.in);
//	      
//		      int num1 = sc.nextInt();
//		      int num2 = sc.nextInt();
//		      int num3 = sc.nextInt();
//	      
//	      int count = 0; // 조건문밖에 변수 저장
//	      if(num1 <= 100 && num2 <= 100 && num3 <= 100){
//	      while(true){
//	          count++; 			// 하루 날을 늘려주면서 
//	          if(count % num1 == 0 && count % num2 == 0 && count % num3 == 0){  // 늘어난 날이 가입날 나눳을때 나머지가 없는경우 맞는경
//	              break;
//	          }
//	      }
//	      
//	  }
//	  System.out.println(count);
//			
//	  input: 3 7 9   output: 63 
		
	
//	* Problem 1093
//		* Problem: 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000) 두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.

//		Scanner scan = new Scanner(System.in);
//
//		// 총 학생 23칸이 출력 불린 횟수 저장
//		// 모두 0으로 초기화 된다.
//		int[] students = new int[23];
//		// 몇 명을 부를지 저장하는 변수 n
//		int n = scan.nextInt();
//		// n회 만큼 출력을 부른다.
//		// 반복 n회
//		for (int i=1; i<n; i++)
//		{
//			// 선생님이 부른 학생의 번호 num
//			int num = scan.nextInt();
//			// num번 학생이 있는 배열의 칸은 n-1  
//			students[num-1]++;	// 인덱스에 value가증가하는것
//		}
//
//		// 모든 학생이 출력불린 횟수를 순서대로 출력
//		for (int i=0; i<students.length; i++)
//		{
//			System.out.print(students[i] + " ");
//		}
//    
//		input: 10								output: 1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//			   1 3 2 2 5 6 7 4 5 9
		
//	* Problem 1094
//		* Problem: 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
//		n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다. (출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.)
//
//        Scanner sc = new Scanner(System.in);
//        
//        int num = sc.nextInt();
//        
//        int[] arr = new int[num];
//        for(int i=0; i <num; i++) {
//        	int num1 = sc.nextInt();
//        	arr[i] = num1;
//        }
//        for(int i=arr.length - 1; i >= 0; i--) {	// 배열 거꾸로할때는  0부터 시작하므로 무조건 length -1하고  중간에 >= 0 써줘야한다. 
//        	System.out.print(arr[i] + " ");
//        }
//      
//        input:  10							output: 5 8 9 7 6 6 3 2 4 10
//        		10 4 2 3 6 6 7 9 8 5
        
//	* Problem 1095
//		* Problem: 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다. n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
//		(출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.)
//		Scanner sc = new Scanner(System.in);
//        
//        int num = sc.nextInt();
//        
//        int[] arr = new int[num];    
//        for(int i =0 ; i < num; i++){
//            int att = sc.nextInt();
//            arr[i] = att;
//        }
//        
//        int first = arr[0];
//        for(int i=0; i<arr.length; i++){
//               
//        	if(first >= arr[i]) {
//        		first = arr[i];
//        	}
//        }
//        System.out.println(first);
        
//		input: 10							output: 2
//			   10 4 2 3 6 6 7 9 8 5

//	* Problem 1096
//		* Problem: 바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다. 둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
//		n은 10이하의 자연수이고 x, y 좌표는 1 ~ 19 까지이며, 같은 좌표는 입력되지 않는다.(흰 돌이 올려진 바둑판의 상황을 출력한다.흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.)
//
//	            
//	            Scanner sc = new Scanner(System.in);
//	            
//	            int[][] arr = new int[19][19];
//	            
//	            int num = sc.nextInt();
//	            
//	            for(int i=0; i<num; i++){
//	                
//	                int x = sc.nextInt();
//	                int y = sc.nextInt();
//	                
//	                arr[x-1][y-1] = 1;   // 배열은 무조건 초기화 0이므로 x, y만 받아서 하면 0대신 1이 출력된다.
//	            }
//	            
//	            for(int i=0; i< arr.length; i++){
//	                for(int j=0; j< arr.length; j++){
//	                    System.out.print(arr[i][j] + " ");
//	                }
//	                System.out.println();
//	            }
//        
//	          input:  5							output:   1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//					1 1						              0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//					2 2						              0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//					3 3							          0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//					4 4							          0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//					5 5 						          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//												          0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//			     
//		* Problem 1097
//			* Problem: 바둑알이 깔려 있는 상황이 19 * 19 크기의 정수값으로 입력된다. 십자 뒤집기 횟수(n)가 입력된다. 십자 뒤집기 좌표가 횟수(n) 만큼 입력된다. 단, n은 10이하의 자연수이다.
			
        
//			 Scanner sc = new Scanner(System.in);
//	        
//	        int[][] arr = new int[19][19];
//	        
//	        for(int i=0; i< arr.length;i++){ // 이중 배열로 숫자 받기
//	            for(int j=0; j < arr.length; j++){
//	                arr[i][j] = sc.nextInt();     
//	            }
//	        }
//	       
//	        int n = sc.nextInt();
//	        for(int i=0; i< n; i++) {
//	        	
//	        	int x = sc.nextInt();
//	        	for(int j=0; j< arr.length; j++) {
//	        		if( arr[x-1][j] == 0) {
//	        			arr[x-1][j] = 1;
//	        		}else {
//	        			arr[x-1][j] = 0;
//	        		}
//	        	}
//	        	
//	        	int y = sc.nextInt();
//	        	for(int k=0; k<arr.length; k++) {
//	        		if( arr[k][y-1] == 0) {
//	        			arr[k][y-1] = 1;
//	        		}else {
//	        			arr[k][y-1] = 0;
//	        		}
//	        	}
//	        }
//	        
//	        for(int i = 0; i<arr.length; i++) {
//	        	for(int j=0; j<arr.length; j++) {
//	        		System.out.print(arr[i][j] + " ");	
//	        	}
//	        	System.out.println();
//	        }
		
//		* Problem 1099
//			* Problem: 10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다.
//					성실한 개미가 이동한 경로를 9로 표시해 출력한다.
//		 Scanner sc = new Scanner(System.in);
        
//        int[][] maze = new int[11][11];
//        
		// 배열 받는것 
//        for(int i=1; i < maze.length; i++){
//            for(int j=1; j < maze.length; j++ ){
//                maze[i][j] = sc.nextInt();
//            }
//        }
//        
//        
		//시작점 정하기 
//        int x = 2; 
//        int y = 2;
//       
		//미로이동
//        while(true){
//                if(maze[x][y] == 2){	// 만약 먹이가 출발점에 있을때
//                    maze[x][y] = 9;
//                    break;
//                }
//                if(maze[x][y+1] != 1){ // 오른쪽이 벽이아닐때( 만약 0으로 정하면시간초과뜬다)
//                    maze[x][y] = 9;
//                    y++;
//                } 
//                else if(maze[x][y+1] == 1){ // 오른쪽이 벽일때
//                    if(maze[x+1][y] == 1){ // 밑에가 벽일때
//                        break;
//                    }else{
//                        x++;		// 밑으로 내려가기
//                    }
//                }
//                if( maze[x][y] == 2){	//먹이 발견했을때
//                       maze[x][y] = 9;
//                       break;
//                }
//                maze[x][y]= 9; 마지막에 개미 찍어주기
//            }
//    
//        for(int i=1; i < maze.length; i++){
//           for(int j=1; j < maze.length; j++){
//               System.out.print(maze[i][j] + " ");
//           }
//           System.out.println(" ");
//        }
//        
//	        
//       input:1 1 1 1 1 1 1 1 1 1 					output:1 1 1 1 1 1 1 1 1 1
//		       1 0 0 1 0 0 0 0 0 1   					   1 9 9 1 0 0 0 0 0 1
//		       1 0 0 1 1 1 0 0 0 1					       1 0 9 1 1 1 0 0 0 1
//		       1 0 0 0 0 0 0 1 0 1					       1 0 9 9 9 9 9 1 0 1
//		       1 0 0 0 0 0 0 1 0 1					       1 0 0 0 0 0 9 1 0 1
//		       1 0 0 0 0 1 0 1 0 1					       1 0 0 0 0 1 9 1 0 1
//		       1 0 0 0 0 1 2 1 0 1					       1 0 0 0 0 1 9 1 0 1
//		       1 0 0 0 0 1 0 0 0 1					       1 0 0 0 0 1 0 0 0 1
//		       1 0 0 0 0 0 0 0 0 1					       1 0 0 0 0 0 0 0 0 1
//		       1 1 1 1 1 1 1 1 1 1					       1 1 1 1 1 1 1 1 1 1
		
// 		문자열 나누기
		
//		Scanner sc = new Scanner(System.in);
//		
//		String word = sc.nextLine();
//		String[] newWord = word.split("");
//		
//		for(int i=0; i< newWord.length; i++) {
//			
//			System.out.println(newWord[i]);
//			
//		}
//
//		문자열 나누기(char이용)
		
//		Scanner sc = new Scanner(System.in);
//		
//		String word = sc.nextLine();
//		char[] newWord = new char[word.length()];
//		
//		
//		for(int i=0; i< newWord.length; i++) {
//			
//			newWord[i] = word.charAt(i);
//			
//			System.out.println(newWord[i]);
//		}

//		문자열 중복 제거
			
		String string = "aabbccdefatafaz";

			char[] chars = string.toCharArray();
			Set<Character> charSet = new LinkedHashSet<Character>(); // 링크드어레이 이
			for (char c : chars) {	// 캐릭터 돌려
			    charSet.add(c);
			}
			
			StringBuilder sb = new StringBuilder();
			for (Character character : charSet) {   // 캐릭터 하나씩 늘어남
			    sb.append(character);
			}
			System.out.println(sb.toString());

		
	
		
	}
	
	
	
}
