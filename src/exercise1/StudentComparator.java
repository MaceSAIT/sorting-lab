package exercise1;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		int ageComparison = Integer.compare(o1.getAge(), o2.getAge());
        if (ageComparison == 0) 
        {
            return o1.compareTo(o2);
        }
        return ageComparison;
	}

}
