package datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Scanner;

import model.Aluno;
import predicates.NamePredicate;

public class ListaEncadeada<T> {
	private ListaNo<T> head;
	private ListaNo<T> tail;
	
	private static class ListaNo<T> {
		private T dado;
		private ListaNo<T> proximo;
		private ListaNo<T> anterior;
		
		public ListaNo(T dado, ListaNo<T> anterior, ListaNo<T> proximo) {
			this.dado = dado;
			this.proximo = proximo;
			this.anterior = anterior;
		}

		
		
		
	}
			
	public void append(T dado)	{
		ListaNo<T> novo = new ListaNo<>(dado, tail, null);
		
		if (tail != null) {
			tail.proximo = novo;
		}
		else {
			head = novo;
		}
		tail = novo;
	}
	
	public void addFirst(T dado)	{
		 ListaNo<T> novo = new ListaNo<>(dado, null, head);
		   head = novo;
		    
		    if(head != null){
	          head.anterior = novo;
		    }
		    else {
		    	tail = novo;
		    }
		  }
	
	public T search(T key, Comparator<T> cmp) {
		ListaNo<T> i = head;
		while( i != null){
			if(cmp.compare(key,  i.dado) == 0){
				return i.dado;
			}
		}
		return null;
	}
	public void printObjects()	{
		ListaNo<T> i = head;
		while (i != null) {
			System.out.println(i.dado);
			i = i.proximo;
		}
	}
	
	public static ListaEncadeada<model.Aluno> loadFromFile(FileReader arquivo)	{
		
		ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
		Scanner sc;
		try{
			sc = new Scanner(new File("data/alunos.csv"));
			sc.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não localizado");
			return null;
		}
		while (sc.hasNext()) {
			Aluno aluno = new Aluno();
			aluno.setMatricula(sc.next());
			aluno.setName(sc.next());
			aluno.setEmail(sc.next());
			aluno.setIdade(sc.nextInt());
			aluno.setSexo(sc.next());
			aluno.setEmpresa(sc.next());
			aluno.setCidade(sc.next());
			
			alunos.append(aluno);
		}

		sc.close();
		
		return alunos;
	}

	public void removeIf(NamePredicate namePredicate) {
		// TODO Auto-generated method stub
		
	}
}
