//1.学生类  包括学生的姓名和各科成绩
public class Score {
	public String name;
    public double EnglishGrade,	MathGrade,phyicalGrade,
    chemicalGrade,biologicalGrade;
	Score() {

	}

	public Score(String name,double EnglishGrade,
			double	MathGrade,double phyicalGrade,
			double chemicalGrade,double biologicalGrade){
		this.name = name;
		this.EnglishGrade = EnglishGrade;
		this.MathGrade = MathGrade; 
		this.phyicalGrade = phyicalGrade;
		this.chemicalGrade = chemicalGrade;
		this.biologicalGrade = biologicalGrade;
		
	}

}