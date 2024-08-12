package compartilhado;

public interface interfaceRepositorio <T> {

    void create (T entidade);

    void update (T entidade);

    void delete (T entidade);

    T findById (int id);
}
