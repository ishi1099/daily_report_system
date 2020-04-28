package action;

import javax.persistence.EntityManager;

import entity.Person;
import util.DBUtil;

public class JpaTest {

    public static void main(String[] args) {
        // EntityManagerのオブジェクトを生成
        EntityManager em = DBUtil.createEntityManager();

        // 1件取得して名前を表示する
        Person person = em.find(Person.class, 1);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getId());

        // EntityManagerの利用を終了する
        em.close();
    }
}