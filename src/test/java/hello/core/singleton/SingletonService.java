package hello.core.singleton;

public class SingletonService {

  //클래스 이름과 같은 걸 static final 지정하면 단 하나만 존재하게 된다
  private static final SingletonService instance = new SingletonService();

  private SingletonService() {

  }

  public static SingletonService getInstance() {
    return instance;
  }

  
}
