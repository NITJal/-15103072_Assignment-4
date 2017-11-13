import java.util.Scanner;
public class TextEditor 
{
	public static void main(String[] args) 
	{
		String str="";
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int cursor=0;
		String c;
		boolean cap=false;
		for(int i=0;i<arr.length;i++)
		{
			switch(arr[i])
			{
			case '^':
				cursor=str.lastIndexOf("\n",cursor-1);
				if(cursor==-1)
				{
					cursor=0;
					str="\n"+str;
				}
				break;
				
			case '<':
				--cursor;
				break;
				
			case '>':
				cursor++;
				break;
				
			case '?':
				cursor=str.indexOf("\n",cursor);
				break;
				
			case '@':
				if(cap==true)
					cap=false;
				else
					cap=true;
				break;
				
			case '$':
				if(cursor>0)
				{
					String s1=str.substring(0, cursor);
					String s2=str.substring(cursor, str.length());
					str=s1+"\n"+s2;
				}
				else
					str+="\n";
				cursor++;
				break;
				
			case '#':
				if(cursor>0)
				{
					String s1=str.substring(0, cursor-1);
					str=s1;
				}
				--cursor;
				break;
				
			default:
				if(cursor>=0)
				{
					String s1=str.substring(0, cursor);
					String s2=str.substring(cursor, str.length());
					if(cap==false)
						c=String.valueOf(arr[i]).toLowerCase();
					else
						c=String.valueOf(arr[i]).toUpperCase();
					str=s1+c+s2;
				}
				else
					str+=arr[i];
				cursor++;
			}
				}
				System.out.println(str);
			}
		
		}
