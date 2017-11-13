import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Networking_site 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader in_sr=new InputStreamReader(System.in);
		BufferedReader bfr=new BufferedReader(in_sr);
		pic[] obj=new pic[5];
		obj[0]=new pic(); obj[1]=new pic();
		obj[2]=new pic(); obj[3]=new pic(); obj[4]=new pic();
		try{
		obj[0].title="image1";
		obj[0].tag.add("Amit");
		obj[0].tag.add("Deepak");
		obj[0].tag.add("Sachin");
		obj[1].title="image2";
		obj[1].tag.add("Ajay");
		obj[1].tag.add("Amit");
		obj[2].title="image3";
		obj[2].tag.add("Atul");
		obj[2].tag.add("Ajay");
		obj[3].title="Image4";
		obj[3].tag.add("Atul");
		obj[3].tag.add("Deepak");
		obj[3].tag.add("Sachin");
		obj[4].title="Image5";
		obj[4].tag.add("Amit");
		}
		catch(Exception e)
		{
			System.out.println("Error Occured");
		}
		ArrayList<pic> p1=new ArrayList<>();
		p1.add(obj[0]); p1.add(obj[3]);
		ArrayList<pic> p2=new ArrayList<>();
		p2.add(obj[0]); p2.add(obj[1]); p2.add(obj[4]);
		ArrayList<pic> p3=new ArrayList<>();
		p3.add(obj[3]); p3.add(obj[2]);
		ArrayList<pic> p4=new ArrayList<>();
		p4.add(obj[1]); p4.add(obj[2]); p4.add(obj[4]);
		HashMap<String,ArrayList<pic>> map=new HashMap<>();
		map.put("Ajay", p1);
		map.put("Atul", p2);
		map.put("Amit", p3);
		map.put("Deepak", p4);
		System.out.println("People list on the Social site");
		for(Map.Entry<String,ArrayList<pic>> entry : map.entrySet())
		{
			System.out.println(""+entry.getKey());
		}
		System.out.print("Enter person name:");
		String name=bfr.readLine();
		if(map.containsKey(name))
		{
			ArrayList<pic> al=map.get(name);
			System.out.println("Photos Uploaded by "+name);
			for(int i=0; i<al.size(); i++)
			{
				pic oj=al.get(i);
				System.out.println(""+oj.title);
			}
			System.out.print("Enter photo name:");
			String p=bfr.readLine();
			int check=0;
			for(int i=0; i<al.size(); i++)
			{
				pic oj=al.get(i);
				if(p.equals(oj.title))
				{
					check=1;
					System.out.println("tags List");
					ArrayList<String> a=oj.tag;
					for(int j=0; j<a.size(); j++)
					{
						System.out.println(""+a.get(j));
					}
					break;
				}
			}
			if(check==0)
				System.out.println("No tags Associated");
		}
		else
			System.out.println("Name is not available");
		System.out.print("Enter tag name:");
		String tname=bfr.readLine();
		System.out.println("Photos associated");
		for(int k=0; k<obj.length; k++)
		{
			ArrayList<String> a=obj[k].tag;
			if(a.contains(tname))
			{
				System.out.println(""+obj[k].title);
			}
		}
	}
}
class pic
{
	String title;
	ArrayList<String> tag=new ArrayList<>();
}
