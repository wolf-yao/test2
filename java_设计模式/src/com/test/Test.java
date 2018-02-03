package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] a={"a","b","c","d","e","f","g","z","s","h","l","w"};
		String[] b={"a","b","c","d","e","f","g","z","s","h","l","w"};
		
		List list=new ArrayList<Map>(); 
		for(int i=0;i<20;i++){
			Map map=new HashMap<String, String>();
			Map mapb=new HashMap<String, String>();
			map.put(a[i/2], "50");
			mapb.put(a[i/2], "25");
			list.add(map);
			list.add(mapb);
		}
		
		//System.out.println(list);
		
		
		List<String> listStr= new ArrayList<String>(); 
		List rlist=new ArrayList<Map>(); 
		
	   for(int i=0;i<list.size();i++){
		   System.out.println("i:"+i);
		   Map<String,String> map=(Map) list.get(i);
			String keys="";
			for (String key : map.keySet()) {  
				keys=key;
			} 
			String type="0";
			for(int q=0;q<listStr.size();q++){
				System.out.println("------------------------------------");
				System.out.println("q:"+q);
				if(keys.equals(listStr.get(q))){
					type="1";
					break;	
				}
				
			}
			System.out.println("type:"+type);
			if("0".equals(type)){
				listStr.add(keys);
			}else{
				continue;	
			}
			System.out.println("listStr:"+listStr);
			 int rint=0;
			for(int s=0;s<list.size();s++){
				  Map<String,String> maps=(Map) list.get(s);
				String sk="";
				for (String key : maps.keySet()) {  
					sk=key;
				} 
				if(keys.equals(sk)){
					rint+=Integer.valueOf(String.valueOf(maps.get(sk)));
				}
			}
		 Map rmap=new HashMap<String, String>();
			rmap.put(keys, String.valueOf(rint));
			rlist.add(rmap);
	   }
	   System.out.println(rlist);
//		for(int i=0;i<list.size();i++){
//			Map<String,String> map=(Map) list.get(i);
//			String keys="";
//			for (String key : map.keySet()) {  
//				keys=key;
//			} 
//			for(int z=1;z<list.size();z++){
//				Map<String,String> mapb=(Map) list.get(i);
//				String qs="";
//				for (String keyzz : mapb.keySet()) {  
//					qs=keyzz;
//				}
//				if(){
//					
//				}
//				
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
