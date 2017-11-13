

import java.util.*;

public class SpellingCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> dict = new ArrayList<String>();
		ArrayList<String> op = new ArrayList<String>();
		int i,n,opt=1;
		int a,b,match,x;
		String s = new String();
		System.out.println("Enter the number of predefined Dictionary words: \n");	
		n = sc.nextInt();
		
		System.out.println("Enter the words: ");
		for(i=0;i<n;i++){
			s = sc.next();
			dict.add(s);
		}
	
		String t = new String();
		
		System.out.println("Enter the text: ");
		Scanner sc1=new Scanner(System.in);
		t = sc1.nextLine();
		String word[] = t.split(" ");
		op.clear();
		for(i=0;i<word.length;i++)
		{
			for(a=0;a<dict.size();a++)
			{
				if(word[i].length()==dict.get(a).length())
				{
					match = 0;
					x = 0;
					for(b=0;b<word[i].length();b++)
					{
						if(word[i].charAt(b)==dict.get(a).charAt(b)){
							x++;
							match = x;
						}
						else
							x = 0;
					}
					if(match>=(word[i].length())/2)
						op.add(dict.get(a));
					else
						dict.add(word[i]);
					break;
				}
			}
		}
		for(b=0;b<op.size();b++)
			System.out.print(op.get(b)+" ");
		System.out.println("\n Dictionary: ");
		for(b=0;b<dict.size();b++)
			System.out.print(dict.get(b)+" ");
		
		}
		
	

}
