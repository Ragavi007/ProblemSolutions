package trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CamelPatternMatching {

	static HashMap<String,List<String>> map=new HashMap<>();
	
	public static void main(String[] args) {
		 
		String arr[] = {"Hi", "Hello", "HelloWorld", 
	            "HiTech", "HiGeek", "HiTechWorld", 
	            "HiTechCity", "HiTechLab"
	        }; 
		
		String pattern = "HT";
		
		for(int i=0;i<arr.length;i++)
		{
			String str=""; 
			for(int j=0;j<arr[i].length();j++)
			{
				if(arr[i].charAt( j)>='A' && arr[i].charAt( j)<='Z')
				{
					str+=arr[i].charAt( j);
					
					if(!map.containsKey( str))
					{
						List<String> l=new ArrayList<>();
						l.add( arr[i]);
						map.put(str,l);
					}
					else
					{
						List<String> l=map.get( str);
						l.add( arr[i]);
						map.put(str,l);
					}
				}
			}
		}
		
		map.entrySet().stream().forEach( e->{
			
			if(e.getKey().equals(pattern))
			{ 
				for(int i=0;i<e.getValue().size();i++)
				{
					System.out.println(e.getValue().get( i));
				}
			}
			
		});
		
		
	}

}
