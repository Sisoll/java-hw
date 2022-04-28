
package ch05;
import java.util.Arrays;

/**
 *
 * @author SisolShie
 * 4.有一字串陣列內容如下…
 * String[] mySkills = {"java", "javascript", "sql", "c", "python", "php", "swift"};
 * 請統計並印出陣列內每個字母各有幾個，EX…a:4	 c:2
 */

public class Hw04
{

	public static void main (String[] args)
	{
		 String[] mySkills = {"java", "javascript", "sql", "c", "python", "php", "swift"};

		 //System.out.println(mySkills[0]);
	 	  System.out.println(Arrays.toString(mySkills));


         // Tips: 用 Array & char 'a' 去計算
	 	 int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
	 	 for (int ii=0 ; ii<mySkills.length ; ii++)
	 	 {
	 		// System.out.println(mySkills[i].length());

	 		 char [] xx = mySkills[ii].toCharArray();
	 		// System.out.println(Arrays.toString(x));
	 		 for (int jj = 0 ; jj < mySkills[ii].length() ; jj++)
	 		 {
	 		//	 System.out.print(xx[jj]);

	 			 switch ( xx[jj])
	 			 {
	 				 case 'a' : a++;
	 				 	break;
	 				 case 'b' : b++;
	 				 	break;
	 				 case 'c' : c++;
	 				 	break;
	 				 case 'd' : d++;
	 				 	break;
	 				 case 'e' : e++;
	 				 	break;
	 				 case 'f' : f++;
	 				 	break;
	 				 case 'g' : g++;
	 				 	break;
	 				 case 'h' : h++;
	 				 	break;
	 				 case 'i' : i++;
	 				 	break;
	 				 case 'j' : j++;
	 				 	break;
	 				 case 'k' : k++;
	 				 	break;
	 				 case 'l' : l++;
	 				 	break;
	 				 case 'm' : m++;
	 				 	break;
	 				 case 'n' : n++;
	 				 	break;
	 				 case 'o' : o++;
	 				 	break;
	 				 case 'p' : p++;
	 				 	break;
	 				 // is `q++`, not `g++`
	 				 case 'q' : g++;
	 				 	break;
	 				 case 'r' : r++;
	 				 	break;
	 				 case 's' : s++;
	 				 	break;
	 				 case 't' : t++;
	 				 	break;
	 				 case 'u' : u++;
	 				 	break;
	 				 case 'v' : v++;
	 				 	break;
	 				 case 'w' : w++;
	 				 	break;
	 				 case 'x' : x++;
	 				 	break;
	 				 case 'y' : y++;
	 				 	break;
	 				 case 'z' : z++;
	 				 	break;
	 				 // ; 是可以省略
	 				 default :  ;
	 			 }

	 		 }
             // print empty string?
	 		 System.out.println("");
	 	 }

         // 為什麼要 ++ ?
	 	 System.out.println("a:" + a++);
	 	 System.out.println("s:" + s++);


	}


}
