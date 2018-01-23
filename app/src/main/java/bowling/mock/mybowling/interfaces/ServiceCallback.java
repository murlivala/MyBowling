package bowling.mock.mybowling.interfaces;


/**
 * service callbacks
 */
public interface ServiceCallback<T> {
    void onSuccess(int status, T response);
    void onFailure(int error);
}
