package datastructures;

import java.io.FileReader;
import java.util.Comparator;

public class ListaEncadeada<T> {
	
	private static class ListaNo<T> {
		private T dado;
		private ListaNo<T> proximo;
		private ListaNo<T> anterior;
		
		public ListaNo(T dado) {
			this.dado = dado;
			this.proximo = null;
			this.anterior = null;
		}
	}
	
	private ListaNo<T> head;
	private ListaNo<T> tail;
	
		
	public void append(T dado)	{
		ListaNo<T> novo = new ListaNo<>(dado);
		
		if (tail != null) {
			tail.proximo = novo;
		}
		else {
			head = novo;
		}
		tail = novo;
	}
	
	public void addFirst(T dado)	{
		 ListaNo<T> novo = new ListaNo<>(dado);
		   head = novo;
		    
		    if(head != null){
	          head.anterior = novo;
		    }
		    else {
		    	tail = novo;
		    }
		  }
	
	public T search(T key, Comparator<T> cmp)
	{
		return null;
	}
	public void printObjects()	{
		ListaNo<T> i = head;
		while (i != null) {
			System.out.println(i.dado);
			i = i.proximo;
		}
	}
	
	public static <T> ListaEncadeada<T> loadFromFile(FileReader arquivo)
	{
		return null;
	}
}
