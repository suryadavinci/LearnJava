import java.util.LinkedList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;


public class PracticeEverything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List list = new LinkedList();
		
		LinkedList ll= new LinkedList();
		
		Iterable it=new Iterable() {

			public Iterator iterator() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		
		Collection c=new Collection() {

			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			public Iterator iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			public Object[] toArray(Object[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean add(Object e) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean containsAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean addAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean removeAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean retainAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			public void clear() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
