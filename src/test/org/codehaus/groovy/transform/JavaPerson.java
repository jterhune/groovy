package org.codehaus.groovy.transform;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.lang.String;

public class JavaPerson {
	private String name;
	private Set<String> pets;
	private Set<String> scope = Collections.emptySet();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getPets() {
		return pets;
	}

	public void setPets(Collection<String> pets) {
		this.pets = pets == null ? Collections.<String> emptySet()
				: new LinkedHashSet<String>(pets);
	}

	public Set<String> getScope() {
		return scope;
	}

	public void setScope(Collection<String> scope) {
		this.scope = scope == null ? Collections.<String> emptySet()
				: new LinkedHashSet<String>(scope);
	}
}