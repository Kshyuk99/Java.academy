package com.company.day013;

import java.util.Objects;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int aver;
	
	public Score() { super();  }
	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name; this.kor = kor; 
		this.eng = eng; this.mat = mat; 
		this.aver = (this.kor + this.eng + this.mat)/3;
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(aver, eng, kor, mat, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return aver == other.aver && eng == other.eng && kor == other.kor && mat == other.mat
				&& Objects.equals(name, other.name);
	}
	public Score(String name, int kor, int eng, int mat, int aver) {
		super();
		this.name = name; this.kor = kor; this.eng = eng; this.mat = mat; 
		this.aver = aver;
	}
	@Override public String toString() { return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", aver=" + aver + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMat() { return mat; }
	public void setMat(int mat) { this.mat = mat; }
	public int getAver() { return aver; }
	public void setAver(int aver) { this.aver = aver; }
	
	
}
