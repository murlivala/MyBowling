package bowling.mock.mybowling.service;

import android.content.Context;

import bowling.mock.mybowling.interfaces.ServiceCallback;
import bowling.mock.mybowling.model.Score;
import bowling.mock.mybowling.presenter.ScorePresenter;

/**
 * Created by Murlivala on 23/01/2018.
 */

public class BowlingService implements ServiceCallback<Score> {
    private Context mContext;
    private ScorePresenter scorePresenter;
    BowlingService(Context context, ScorePresenter presenter){
        mContext = context;
        scorePresenter = presenter;
    }

    public void getScoreFromServer(){
        //To do
        //request to server
    }



    public void onSuccess(int status,Score score){
        scorePresenter.onResponse(status,score);
    }

    public void onFailure(int error){
        scorePresenter.onResponse(error,null);
    }

}
