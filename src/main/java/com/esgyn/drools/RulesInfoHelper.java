package com.esgyn.drools;

import java.util.ArrayList;
import java.util.List;

public class RulesInfoHelper {

	List<String> firedRules = new ArrayList<String>();

	public List<String> getFiredRules() {
		return firedRules;
	}

	public void setFiredRules(List<String> firedRules) {
		this.firedRules = firedRules;
	}

	public RulesInfoHelper() {
		super();
	}

	@Override
	public String toString() {
		return "RulesInfoHelper [firedRules=" + firedRules + "]";
	}
}
