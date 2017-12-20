package comparators;

import java.util.Comparator;

import model.Aluno;

public class SearchByAgeAndCity implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		int ac = 0;
		if  (o1.getIdade() != o2.getIdade())
			ac = Integer.toString(o1.getIdade()).compareTo(Integer.toString(o2.getIdade()));
		else ac = o1.getCidade().compareTo(o2.getCidade());
		
		return ac;
	}

}