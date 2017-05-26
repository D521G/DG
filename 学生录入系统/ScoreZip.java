//2.对学生类进行设置 包括设置查找等

package score;

public class ScoreZip {
	Score[] S = new Score[5];

	public void setData(Score name, int index) {//添加成绩类到成绩数组中
		S[index] = name;
	}

	public Score[] getData() { //返回学生数组
		return S;
	}

	public Score SerchData(String name) {  //查找学生各科成绩
		for (int index = 0; index < S.length; index++) {
			if (name !=null && S[index] != null )
				if (S[index].name.equals(name)){
					return S[index];
				}
		 }
		return null;
	}
}
