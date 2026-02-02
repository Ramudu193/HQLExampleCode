package com.kodnest.OneToManyHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        // 1️⃣ Create Objects
        Course course1 = new Course("Java");
        Course course2 = new Course("SQL");
        Course course3 = new Course("DSA");

        KodStudent student = new KodStudent("Omkar", "om@om.com", "89233444512");

        // 2️⃣ Set Relationships
        course1.setKodstudent(student);
        course2.setKodstudent(student);
        course3.setKodstudent(student);

        List<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);

        student.setCourse(courseList);

        // 3️⃣ Hibernate Configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(KodStudent.class);
        cfg.addAnnotatedClass(Course.class);

        // 4️⃣ Session Factory
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        // 5️⃣ Transaction
        Transaction tx = session.beginTransaction();

        // 6️⃣ Save Parent (Child auto-saved because of CascadeType.ALL)
        session.persist(student);

        // 7️⃣ Commit
        tx.commit();

        // 8️⃣ Close
        session.close();
        factory.close();

        System.out.println("✔ Student and Courses saved successfully!");
    }
}
