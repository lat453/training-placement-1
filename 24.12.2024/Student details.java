import java.util.*;

class Student {
    int id;
    String firstName;
    double cgpa;

    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String firstName = sc.next();
            double cgpa = sc.nextDouble();
            sc.nextLine();
            students.add(new Student(id, firstName, cgpa));
        }
        
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (Double.compare(s2.cgpa, s1.cgpa) != 0) {
                    return Double.compare(s2.cgpa, s1.cgpa);
                }
                if (!s1.firstName.equals(s2.firstName)) {
                    return s1.firstName.compareTo(s2.firstName);
                }
                return Integer.compare(s1.id, s2.id);
            }
        });
        
        for (Student student : students) {
            System.out.println(student.firstName);
        }
        
        sc.close();
    }
}
