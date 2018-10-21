package com.Items;

public class UserDetails {
private String Name;
private String Experience;
private String Skills;
private String Education;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getExperience() {
	return Experience;
}
public void setExperience(String experience) {
	Experience = experience;
}
public String getSkills() {
	return Skills;
}
public void setSkills(String skills) {
	Skills = skills;
}
public String getEducation() {
	return Education;
}
public void setEducation(String education) {
	Education = education;
}

public String toString(){
	StringBuffer s_buf = new StringBuffer();
	s_buf.append("NAME\n");
	s_buf.append(getName()+"\n");
	s_buf.append("EXPERIENCE\n");
	s_buf.append(getExperience()+"\n");
	s_buf.append("SKILLS\n");
	s_buf.append(getSkills()+"\n");
	s_buf.append("EDUCATION\n");
	s_buf.append(getEducation()+"\n");
	return s_buf.toString();
}
}
