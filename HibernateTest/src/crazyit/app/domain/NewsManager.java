package crazyit.app.domain;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Name: admin
 * Date: 2017/3/4
 * Time: 23:28
 */
public class NewsManager {

    public static void main(String[] args) throws Exception{

        //实例化Configuration,默认加载hibernate.cfg.xml
        Configuration configuration = new Configuration().configure();

        //以configuration创建SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //创建Session
        Session session = sessionFactory.openSession();

        //开始事务
        Transaction transaction = session.beginTransaction();

        //创建消息实例
        News news = new News();
        news.setTitle("今日要闻2");
        news.setContent("内容1234");

        //保存消息
        session.save(news);
        //提交事务
        transaction.commit();

        //关闭Session
        session.close();
        sessionFactory.close();

    }
}
