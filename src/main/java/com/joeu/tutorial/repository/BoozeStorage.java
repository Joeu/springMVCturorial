package com.joeu.tutorial.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.joeu.tutorial.model.BoozeModel;

@Repository
public class BoozeStorage {
	
	private static final List<BoozeModel> BOOZE_LIST = new ArrayList<>();
	
	static {
		BOOZE_LIST.add(new BoozeModel("Duvel", "Belgium Ale"));
		BOOZE_LIST.add(new BoozeModel("Delirium Tremens", "Belgium Ale"));
		BOOZE_LIST.add(new BoozeModel("Satan", "Belgium Weiss"));
	}
	
	public List<BoozeModel> listAll(){
		return BoozeStorage.BOOZE_LIST;
	}
	
	public void addBooze(BoozeModel booze){
		BoozeStorage.BOOZE_LIST.add(booze);
	}

}
