//2.��ѧ����������� �������ò��ҵ�

package score;

public class ScoreZip {
	Score[] S = new Score[5];

	public void setData(Score name, int index) {//��ӳɼ��ൽ�ɼ�������
		S[index] = name;
	}

	public Score[] getData() { //����ѧ������
		return S;
	}

	public Score SerchData(String name) {  //����ѧ�����Ƴɼ�
		for (int index = 0; index < S.length; index++) {
			if (name !=null && S[index] != null )
				if (S[index].name.equals(name)){
					return S[index];
				}
		 }
		return null;
	}
}
