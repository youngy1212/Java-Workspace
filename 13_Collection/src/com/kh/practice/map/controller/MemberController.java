package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;


public class MemberController {
	
	private HashMap<String, Member> map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		boolean result = false;
		
		try {
			map.put(id,m);
			result = true;
		}catch(Exception e){
			result = false;
		}
		
		return result;
	}
	
	public String logIn(String id, String password) {
		String result = null;
		Member mm = new Member();
		
		if(map.containsKey(id)) {
			mm = map.get(id);
			if(mm.getPassword().equals(password)) {
				result = mm.getName();
			}
		}else {
			result = null;
		}
		
		return result;
		
	}
	
	public boolean changePassword(String id, String oldPW, String newPw) {
		boolean result = false;
		Member mm = new Member();
		
		if(map.containsKey(id)) {
			mm = map.get(id);
			if(mm.getPassword().equals(oldPW)) {
				mm.setPassword(newPw);
				map.replace(id,mm);
				result = true;
			}
		}else {
			result = false;
		}
		
		return result;
	}
	
	public void changeName(String id, String newName) {
		Member mm = new Member();
		
		if(map.containsKey(id)) {
			mm = map.get(id);
				mm.setName(newName);
				map.replace(id,mm);
			}
	}
	
	public TreeMap sameName(String Name) {
		TreeMap <String, Member> tMap = new TreeMap<>();
		
		set<map.keySet();
		
		if(map.containsValue(Name)) {
			
			
		}
		
		
		TreeMap <String, Member> tMap = new TreeMap<>();
		
		tMap.
		
		
			
			
			
		
		
		
		return tMap;
		
	}

	
	
	

}
