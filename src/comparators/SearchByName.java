package comparators;

import java.util.Comparator;

import model.Aluno;

public class SearchByName implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		o1.getName().equals(o2.getName());
		return 0;
	}

}